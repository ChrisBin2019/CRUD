package com.action;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.actionForm.IndexForm;
import com.pojo.News;
import com.service.NewsService;

public class IndexAction extends Action {
	private NewsService newsService;

	public NewsService getNewsService() {
		return newsService;
	}

	public void setNewsService(NewsService newsService) {
		this.newsService = newsService;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		IndexForm index =(IndexForm) form;
		
		System.out.println("收到请求");
		
		int pageIndex=index.getPageIndex();
		
		System.out.println("jspPageIndex"+pageIndex);
		
		List<News> newsList=new ArrayList<News>();
		newsList=newsService.getNewsList(pageIndex,10);
		int totalPage=newsService.getTotalPage(10);
		request.getSession().setAttribute("pageIndex", pageIndex);
		request.getSession().setAttribute("newsList", newsList);
		request.getSession().setAttribute("totalPage", totalPage);
		return mapping.findForward("success");
		
	}

}
