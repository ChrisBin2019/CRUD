package com.actionForm;

import org.apache.struts.action.ActionForm;

public class IndexForm extends ActionForm {
	private int pageIndex;

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	
}
