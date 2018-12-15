package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.Next;

@Repository("nextDAO")
public class NextDAO {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public List<Next> getNexts(String name) {
		String sqlStatement = "select * from nexts where ?";

		return jdbcTemplate.query(sqlStatement, new Object[] {name},new RowMapper<Next>() {

			@Override
			public Next mapRow(ResultSet rs, int rowNum) throws SQLException {

				Next next = new Next();

				next.setName(rs.getString("name"));
				next.setText(rs.getString("text"));

				return next;
			}

		});
	}

	public boolean insert(Next next) {
		String name = next.getName();
		String text = next.getText();

		String sqlStatement = "insert into nexts (name, text, values(?,?)";

		return (jdbcTemplate.update(sqlStatement, new Object[] { name, text }) == 1);
	}

}
