package cn.bdqn.tangcco.stusys.pojo;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String loginName;
	private String loginPwd;
	private String name;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(String loginName, String loginPwd, String name) {
		this.loginName = loginName;
		this.loginPwd = loginPwd;
		this.name = name;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPwd() {
		return this.loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}