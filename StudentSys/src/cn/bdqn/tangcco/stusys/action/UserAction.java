package cn.bdqn.tangcco.stusys.action;



import java.util.Map;

import cn.bdqn.tangcco.stusys.biz.UserBiz;
import cn.bdqn.tangcco.stusys.pojo.User;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	private UserBiz userBiz;
	private User user;
	private String msg;
	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String doLogin() throws Exception {
		User findUser=userBiz.login(user);
		if (findUser!=null) {
			//登录成功
		  Map<String,Object> session=ActionContext.getContext().getSession();
		  session.put("loginUser", findUser);
		  return SUCCESS;
		}else{
			this.msg="用户名或密码错误,登录失败!";
			return INPUT;//登录失败
		}
	}
	/**
	 * ע��
	 * @return
	 * @throws Exception
	 */
	public String doLogOut() throws Exception {
		Map<String,Object> session=ActionContext.getContext().getSession();
		session.remove("loginUser");
		return SUCCESS;
	}
}
