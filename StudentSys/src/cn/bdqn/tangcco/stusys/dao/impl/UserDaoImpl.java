package cn.bdqn.tangcco.stusys.dao.impl;

import java.util.List;

import org.apache.struts2.components.If;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.tangcco.stusys.dao.UserDao;
import cn.bdqn.tangcco.stusys.pojo.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	public User findUser(User condition) {
		List<User> userList=super.getHibernateTemplate().find("from User where loginName=? and loginPwd=?", 
											new Object[]{condition.getLoginName(),
											condition.getLoginPwd()});
		if (userList.size()>0) {
		    return userList.get(0);
		}else{
			return null;
		}
	}

}
