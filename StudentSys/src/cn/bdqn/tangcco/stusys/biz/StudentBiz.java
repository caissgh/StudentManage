package cn.bdqn.tangcco.stusys.biz;

import java.util.List;

import cn.bdqn.tangcco.stusys.pojo.Student;

public interface StudentBiz {
	public List<Student> findAllStudent();
	public void addStudent(Student student);
	public void deleteStudent(Student student);
	public Student findStudentByNo(Integer studentNo);
	public void updateStudent(Student student);
}
