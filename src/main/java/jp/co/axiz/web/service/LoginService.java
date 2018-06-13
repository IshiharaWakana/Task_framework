package jp.co.axiz.web.service;

import java.sql.Connection;

import jp.co.axiz.web.dao.AdminDao;
import jp.co.axiz.web.entity.Admin;
import jp.co.axiz.web.util.DbUtil;

public class LoginService {

	public Admin login(String id,String pass) {
		try(Connection conn = DbUtil.getConnection()){
			AdminDao adminDao = new AdminDao();
			Admin login = adminDao.findByIdAndPassword(id,pass);

			return login;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

}
