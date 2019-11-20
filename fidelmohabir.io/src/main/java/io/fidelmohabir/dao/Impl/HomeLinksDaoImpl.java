package io.fidelmohabir.dao.Impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import io.fidelmohabir.beans.HomeLinksBean;
import io.fidelmohabir.dao.HomeLinksDao;

@Component
public class HomeLinksDaoImpl implements HomeLinksDao {
	
	@Autowired
	JdbcTemplate jdbc;
	
	@Override
	public List<HomeLinksBean> getLinks() {
		
		List<HomeLinksBean> links = jdbc.query("select * from links",
				new RowMapper<HomeLinksBean>() {
			
					public HomeLinksBean mapRow(ResultSet rs, int rowNum) throws SQLException {
						HomeLinksBean link = new HomeLinksBean();
						link.setName(rs.getString("name"));
						link.setAddr(rs.getString("url"));
						return link;
					}
			
		});
		return links;
	}

}
