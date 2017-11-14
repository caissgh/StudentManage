package cn.bdqn.tangcco.stusys.biz.impl;

import java.util.List;

import cn.bdqn.tangcco.stusys.biz.ClassesBiz;
import cn.bdqn.tangcco.stusys.dao.ClassesDao;
import cn.bdqn.tangcco.stusys.pojo.Classes;

public class ClassesBizImpl implements ClassesBiz {
	private ClassesDao classesDao;
	
	
	public void setClassesDao(ClassesDao classesDao) {
		this.classesDao = classesDao;
	}


	public List<Classes> findAllClasses() {
		return classesDao.findAll();
	}

}
