package cn.bdqn.tangcco.stusys.dao;

import cn.bdqn.tangcco.stusys.pojo.User;

public interface UserDao {
	/**
	 * 
	 * @param condition
	 * @return
	 */
	public User findUser(User condition);
}
