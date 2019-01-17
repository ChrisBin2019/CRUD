package com.dao;

import java.util.List;

import com.pojo.News;
import com.pojo.User;

public interface NewsDao {
	public List<News> getNewsList(int pageIndex,int pageSize);
	public int getTotalRows();
	
	public List<News> getMyNewsList(User id);
	
	public News getNewsById(int id);
	public void addNews(News news);
	public void deleteNews(int id);
	public void updateNews(News news);
	
}
