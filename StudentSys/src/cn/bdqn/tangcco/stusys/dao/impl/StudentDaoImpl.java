package cn.bdqn.tangcco.stusys.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.tangcco.stusys.dao.StudentDao;
import cn.bdqn.tangcco.stusys.pojo.Student;

public class StudentDaoImpl extends HibernateDaoSupport implements StudentDao {
	public List<Student> findAll() {
		return super.getHibernateTemplate().find("from Student");
	}

	public void add(Student student) {
		super.getHibernateTemplate().save(student);
	}

	public void delete(Student student) {
		super.getHibernateTemplate().delete(student);
	}

	public Student get(Integer studentNo) {
		return super.getHibernateTemplate().get(Student.class, studentNo);
	}

	public void update(Student student) {
	    super.getHibernateTemplate().update(student);
	}
}
