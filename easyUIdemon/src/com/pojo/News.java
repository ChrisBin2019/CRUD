package com.pojo;

import java.util.Date;

public class News {
	private int id;
	private String title;
	private String content;
	private Date publishDate;
	private int browseCount;
	private int userId;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public int getBrowseCount() {
		return browseCount;
	}
	public void setBrowseCount(int browseCount) {
		this.browseCount = browseCount;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "News [id=" + id + ", title=" + title + ", content=" + content
				+ ", publishDate=" + publishDate + ", browseCount="
				+ browseCount + ", userId=" + userId + ", name=" + name + "]";
	}
}
