package cn.bdqn.tangcco.stusys.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Hobbys entity. @author MyEclipse Persistence Tools
 */

public class Hobbys implements java.io.Serializable {

	// Fields

	private Integer hid;
	private String hname;
	private Set students = new HashSet(0);

	// Constructors

	/** default constructor */
	public Hobbys() {
	}

	/** minimal constructor */
	public Hobbys(String hname) {
		this.hname = hname;
	}

	/** full constructor */
	public Hobbys(String hname, Set students) {
		this.hname = hname;
		this.students = students;
	}

	// Property accessors

	public Integer getHid() {
		return this.hid;
	}

	public void setHid(Integer hid) {
		this.hid = hid;
	}

	public String getHname() {
		return this.hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public Set getStudents() {
		return this.students;
	}

	public void setStudents(Set students) {
		this.students = students;
	}

}