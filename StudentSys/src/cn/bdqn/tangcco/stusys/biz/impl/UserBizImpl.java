package cn.bdqn.tangcco.stusys.biz.impl;

import cn.bdqn.tangcco.stusys.biz.UserBiz;
import cn.bdqn.tangcco.stusys.dao.UserDao;
import cn.bdqn.tangcco.stusys.pojo.User;

public class UserBizImpl implements UserBiz {
    private UserDao userDao;
    //Spring×¢Èë
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public User login(User condition) {
		return userDao.findUser(condition);
	}

}
