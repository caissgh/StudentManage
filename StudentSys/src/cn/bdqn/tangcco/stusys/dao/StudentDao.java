package cn.bdqn.tangcco.stusys.dao;

import java.util.List;

import cn.bdqn.tangcco.stusys.pojo.Student;

public interface StudentDao {
	public List<Student> findAll();
	public void add(Student student);
	public void delete(Student student);
	public Student get(Integer studentNo);
	public void update(Student student);
}
