package cn.bdqn.tangcco.stusys.action;
import java.util.List;
import java.util.Map;

import cn.bdqn.tangcco.stusys.biz.StudentBiz;
import cn.bdqn.tangcco.stusys.pojo.Classes;
import cn.bdqn.tangcco.stusys.pojo.Student;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class StudentAction extends ActionSupport {

	private StudentBiz studentBiz;
	private List<Student> studentList;
	
	public void setStudentBiz(StudentBiz studentBiz) {
		this.studentBiz = studentBiz;
	}
	

	public List<Student> getStudentList() {
		return studentList;
	}


	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}


	public String showStudentList() throws Exception {
		studentList=studentBiz.findAllStudent();
		return SUCCESS;
	}
	//===================================
	private Student student;
	private int cid;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}

	public String addStudent() throws Exception {
		try {
			Classes classes=new Classes();
			classes.setCid(cid);
			student.setClasses(classes);
			
			studentBiz.addStudent(student);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return INPUT;
		}
	}
	private Integer studentNo;
	
	public Integer getStudentNo() {
		return studentNo;
	}


	public void setStudentNo(Integer studentNo) {
		this.studentNo = studentNo;
	}


	public String showStudent() throws Exception {
		Map<String,Object> session=ActionContext.getContext().getSession();
		Student stu=(Student)session.get("student");
		student=studentBiz.findStudentByNo(stu.getStudentNo());
		return SUCCESS;
	}
	public String deleteStudent() throws Exception {
		try {
			Student delStudent=studentBiz.findStudentByNo(student.getStudentNo());
			studentBiz.deleteStudent(delStudent);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return INPUT;
		}
	}
	
	public String updateStudent() throws Exception {
		try {
			Classes classes=new Classes();
			classes.setCid(cid);
			student.setClasses(classes);
			
			studentBiz.updateStudent(student);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return INPUT;
		}
	}
	
}
