package com.service;

import java.util.List;

import com.pojo.News;

public interface NewsService {
	public List<News> getNewsList(int pageIndex,int pageSize);
	public int getTotalPage(int pageSize);
}
