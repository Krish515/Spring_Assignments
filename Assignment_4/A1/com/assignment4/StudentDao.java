package com.assignment4;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class StudentDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int saveStudent(Student s){
		String query = "insert into student values('"+s.getStudentId()+"','"+s.getStudentName()+"','"+s.getStudentAddress()+"')";
		int status = jdbcTemplate.update(query);
		return status;
	}
	public int deleteStudent(Student s){
		String query = "delete from student where studentid='"+s.getStudentId()+"'";
		int status = jdbcTemplate.update(query);		
		return status;
	}
	public int updateStudent(Student s){
		  String query="update student set  studentname='"+s.getStudentName()+"',studentaddress='"+s.getStudentAddress()+"' where studentid='"+s.getStudentId()+"' ";  
		int status = jdbcTemplate.update(query);
		return status;
	}

	public int readStudent(Student s) {
		  String sql="select * from student";  
		  int status=0;
		  List stList = getJdbcTemplate().query(sql, new ResultSetExtractor<List>(){
			  
		        public List extractData(ResultSet rs) throws SQLException,
		                DataAccessException {
		            List stList = new ArrayList();
		            while(rs.next()) {
		                Student st = new Student(rs.getString("studentid"), rs.getString("studentname"), rs.getString("studentaddress"));                    
		                stList.add(st);
		            }
		            return stList;
		        }});
		     
		    System.out.println(stList);
		    if(stList.size()>0)
		    	status = 1;
		return status;
	}
}
