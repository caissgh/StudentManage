package cn.bdqn.tangcco.stusys.pojo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private Integer studentNo;
	private Classes classes;
	private String studentName;
	private String sex;
	private String phone;
	private String address;
	private Timestamp bornDate;
	private String email;
	private String identityCard;
	private String hobby;
	private Set hobbyses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(String studentName, String sex) {
		this.studentName = studentName;
		this.sex = sex;
	}

	/** full constructor */
	public Student(Classes classes, String studentName, String sex,
			String phone, String address, Timestamp bornDate, String email,
			String identityCard, String hobby, Set hobbyses) {
		this.classes = classes;
		this.studentName = studentName;
		this.sex = sex;
		this.phone = phone;
		this.address = address;
		this.bornDate = bornDate;
		this.email = email;
		this.identityCard = identityCard;
		this.hobby = hobby;
		this.hobbyses = hobbyses;
	}

	// Property accessors

	public Integer getStudentNo() {
		return this.studentNo;
	}

	public void setStudentNo(Integer studentNo) {
		this.studentNo = studentNo;
	}

	public Classes getClasses() {
		return this.classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Timestamp getBornDate() {
		return this.bornDate;
	}

	public void setBornDate(Timestamp bornDate) {
		this.bornDate = bornDate;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdentityCard() {
		return this.identityCard;
	}

	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}

	public String getHobby() {
		return this.hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public Set getHobbyses() {
		return this.hobbyses;
	}

	public void setHobbyses(Set hobbyses) {
		this.hobbyses = hobbyses;
	}

}