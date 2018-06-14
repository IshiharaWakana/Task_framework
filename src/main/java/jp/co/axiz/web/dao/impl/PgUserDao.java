//package jp.co.axiz.web.dao.impl;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//import jp.co.axiz.web.entity.UserInfo;
//
//public class PgUserDao implements UserInfoDao{
//
//	@Autowired
//    private JdbcTemplate jdbcTemplate;
//
//	public List<UserInfo> findAll() {
//		return jdbcTemplate.query
//				("SELECT user_id, user_name, telephone, password FROM user_info ORDER BY user_id",
//					new BeanPropertyRowMapper<UserInfo>(UserInfo.class));
//	}
//}
