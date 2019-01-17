package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.actionForm.LoginForm;
import com.pojo.User;
import com.service.UserService;

public class LoginAction extends Action {
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		LoginForm login = (LoginForm) form;
		String email = login.getEmail();
		String passWord = login.getPassWord();
		request.setAttribute("email", email);
		User u=this.getUserService().findUser(email, passWord);
		if(u!=null){
			request.getSession().setAttribute("dbUser", u);
			return mapping.findForward("success");
		}else{
			return mapping.findForward("fail");
		}
		
	}

}
