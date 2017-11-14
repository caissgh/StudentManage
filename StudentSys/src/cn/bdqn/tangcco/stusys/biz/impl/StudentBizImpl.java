package cn.bdqn.tangcco.stusys.biz.impl;

import java.util.List;

import cn.bdqn.tangcco.stusys.biz.StudentBiz;
import cn.bdqn.tangcco.stusys.dao.StudentDao;
import cn.bdqn.tangcco.stusys.pojo.Student;

public class StudentBizImpl implements StudentBiz {
	private StudentDao studentDao;
	
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public List<Student> findAllStudent() {
		return studentDao.findAll();
	}

	public void addStudent(Student student) {
		studentDao.add(student);
	}

	public void deleteStudent(Student student) {
		studentDao.delete(student);
	}

	public Student findStudentByNo(Integer studentNo) {
		return studentDao.get(studentNo);
	}

	public void updateStudent(Student student) {
		studentDao.update(student);
	}

}
