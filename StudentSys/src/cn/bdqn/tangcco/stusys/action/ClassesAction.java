package cn.bdqn.tangcco.stusys.action;

import java.util.List;
import java.util.Map;

import cn.bdqn.tangcco.stusys.biz.ClassesBiz;
import cn.bdqn.tangcco.stusys.pojo.Classes;
import cn.bdqn.tangcco.stusys.pojo.Student;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ClassesAction extends ActionSupport {
	private ClassesBiz classesBiz;
	private List<Classes> classesList;
	public void setClassesBiz(ClassesBiz classesBiz) {
		this.classesBiz = classesBiz;
	}
	
	public List<Classes> getClassesList() {
		return classesList;
	}

	public void setClassesList(List<Classes> classesList) {
		this.classesList = classesList;
	}
	private Student student;
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String findAllClasses() throws Exception {
		classesList=classesBiz.findAllClasses();
		System.out.println(student.getStudentNo());
		
		Map<String,Object> session=ActionContext.getContext().getSession();
		session.put("classesList", classesList);
		session.put("student",student);
		return SUCCESS;
	}
	
}
