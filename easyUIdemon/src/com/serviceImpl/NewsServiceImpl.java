package com.serviceImpl;

import java.util.List;

import com.dao.NewsDao;
import com.pojo.News;
import com.service.NewsService;

public class NewsServiceImpl implements NewsService {
	private NewsDao newsDao;
	
	public NewsDao getNewsDao() {
		return newsDao;
	}

	public void setNewsDao(NewsDao newsDao) {
		this.newsDao = newsDao;
	}

	@Override
	public List<News> getNewsList(int pageIndex, int pageSize) {
		// TODO Auto-generated method stub
		return newsDao.getNewsList(pageIndex, pageSize);
	}

	@Override
	public int getTotalPage(int pageSize) {
		// TODO Auto-generated method stub
		int totalRows=newsDao.getTotalRows();
		int temp=totalRows/pageSize;
		return totalRows%pageSize==0?temp:temp+1;
	}


}
