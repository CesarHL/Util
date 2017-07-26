package v2.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import v2.model.Contact;

public class ContactDAOImpl implements ContactDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	public ContactDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void saveOrUpdate(Contact contact) {
		
			String sql = "INSERT INTO contact (name, pass) VALUES (?, ?, ?, ?)";
			jdbcTemplate.update(sql, contact.getName(), contact.getPass());
		
	}

}
