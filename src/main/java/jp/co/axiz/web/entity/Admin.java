package jp.co.axiz.web.entity;

import java.io.Serializable;

public class Admin implements Serializable {

	private String id;
	private String name;
	private String password;
	private String admin_id;
	private String admin_name;

//	@Override
//	public String toString() {
//		return "Admin [id=" + id + ", name=" + name + ",pass='' + password + "]";
//	}

	public String getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}



	public String getAdmin_name() {
		return admin_name;
	}

	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
