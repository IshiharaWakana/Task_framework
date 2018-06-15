package jp.co.axiz.web.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.axiz.web.dao.AdminDao;
import jp.co.axiz.web.entity.Admin;


@Repository
public class PgAdminDao implements AdminDao{

	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public Admin findByIdAndPassword(String id, String pass) {

		List<Admin> list = jdbcTemplate.query
				("SELECT admin_id, admin_name, password FROM admin "
						+ "WHERE admin_id = ? AND password = ?",
						new BeanPropertyRowMapper<Admin>(Admin.class), id,pass);

		if(list.size()==0) {
			return null;
		}

		return (Admin) list.get(0);
	}


//			stmt.setString(1, id);
//			stmt.setString(2, password);
//			ResultSet rs = stmt.executeQuery();
//
//			if (rs.next()) {
//				Admin a = new Admin();
//				a.setId(rs.getString("admin_id"));
//				a.setName(rs.getString("admin_name"));
//				a.setPassword(rs.getString("password"));
//				return a;
//			}
//		} catch (SQLException e) {
//			throw new DataAccessException(e);
//		}
//
//		return null;
//	}

}

