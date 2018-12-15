package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.Expect;
import kr.ac.hansung.model.PassYS;
import kr.ac.hansung.model.School;

@Repository("schoolDAO")
public class SchoolDAO {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public List<School> getName(PassYS passYS) {
		int year = passYS.getYear();
		int semester = passYS.getSemester();
		System.out.println("*****"+year+semester);
		String sqlStatement ="select * from school where year=? and semester=?";
		return jdbcTemplate.query(sqlStatement, new Object[] {year,semester},new RowMapper<School>() {

			@Override
			public School mapRow(ResultSet rs, int rowNum) throws SQLException {

				School school = new School();

				school.setYear(rs.getInt("year"));
				school.setSemester(rs.getInt("semester"));
				school.setCode(rs.getString("code"));
				school.setName(rs.getString("name"));
				school.setSection(rs.getString("section"));
				school.setScore(rs.getInt("score"));
				return school;
			}
		
	});
	}
	
	public boolean insert(Expect expect) {
		String name = expect.getName();
		
		String sqlStatement =  "insert into expect (name) values(?)";
	
		return (jdbcTemplate.update(sqlStatement, new Object[] {name}) ==1);
	}
	
	public List<Expect> getAll() {
		
		String sqlStatement =  "select * from expect";
	
		return jdbcTemplate.query(sqlStatement, new RowMapper<Expect>() {

			@Override
			public Expect mapRow(ResultSet rs, int rowNum) throws SQLException {
				Expect expect = new Expect();
				expect.setId(rs.getInt("id"));
				expect.setName(rs.getString("name"));
				return expect;
			}
			
		});
	}
	
}
