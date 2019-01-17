package com.daoImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.dao.NewsDao;
import com.pojo.News;
import com.pojo.User;

public class NewsDaoImpl extends SqlMapClientDaoSupport implements NewsDao {

	@Override
	public List<News> getNewsList(int pageIndex,int pageSize) {
		// TODO Auto-generated method stub
		List<News> list=new ArrayList<News>();
		int startRow=0;
		
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("startRow", startRow);
		map.put("pageSize", pageSize);
		list=this.getSqlMapClientTemplate().queryForList("getNewsList",map);
		return list;
	}

	@Override
	public List<News> getMyNewsList(User id) {
		// TODO Auto-generated method stub
		List<News> myList=new ArrayList<News>();
		myList=this.getSqlMapClientTemplate().queryForList("gerMyNewsList");
		return myList;
	}

	@Override
	public int getTotalRows() {
		// TODO Auto-generated method stub
		int totalRows=(int) this.getSqlMapClientTemplate().queryForObject("getTotalRows");
		return totalRows;
	}

	@Override
	public News getNewsById(int id) {
		// TODO Auto-generated method stub
		News dbNews=(News) this.getSqlMapClientTemplate().queryForObject("getNewsById", id);
		return dbNews;
	}

	@Override
	public void addNews(News news) {
		// TODO Auto-generated method stub
		getSqlMapClientTemplate().insert("addNews", news);
	}

	@Override
	public void deleteNews(int id) {
		// TODO Auto-generated method stub
		getSqlMapClientTemplate().delete("deleteNews", id);
	}

	@Override
	public void updateNews(News news) {
		// TODO Auto-generated method stub
		getSqlMapClientTemplate().update("updateNews", news);
	}

}
