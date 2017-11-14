package cn.bdqn.tangcco.stusys.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.tangcco.stusys.dao.ClassesDao;
import cn.bdqn.tangcco.stusys.pojo.Classes;

public class ClassDaoImpl extends HibernateDaoSupport implements ClassesDao {

	public List<Classes> findAll() {
		return super.getHibernateTemplate().find("from Classes");
	}

}
