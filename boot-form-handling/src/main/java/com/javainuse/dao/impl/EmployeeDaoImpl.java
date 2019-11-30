package com.javainuse.dao.impl;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.javainuse.dao.EmployeeDao;
import com.javainuse.model.work;

@Repository
public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao{
	
	@Autowired 
	DataSource dataSource;
	
	@PostConstruct
	private void initialize(){
		setDataSource(dataSource);
	}
	
	@Override
	public void insertWork(work w) {
		String sql = "INSERT INTO workshops " +
				"(workid, topic, venue, wsdate, organiser, location ) VALUES (?, ?, ?, ?, ?, ?)" ;
		getJdbcTemplate().update(sql, new Object[]{
				w.getWorkid(), w.getTopic(), w.getVenue(), w.getDate(), w.getOrganiser(), w.getLocation()
		});
	}
	
	@Override
	public void insertWorks(final List<work> works) {
		String sql = "INSERT INTO workshops " + "(workid, topic, venue, wsdate, organiser, location )"
				+ " VALUES (?, ?, ?, ?, ?, ?)";
		getJdbcTemplate().batchUpdate(sql, new BatchPreparedStatementSetter() {
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				work w = works.get(i);
				ps.setString(1, w.getWorkid());
				ps.setString(2, w.getTopic());
				ps.setString(3, w.getVenue());
				ps.setDate(4, w.getDate());
				ps.setString(5, w.getOrganiser());
				ps.setString(6, w.getLocation());
			}
			
			public int getBatchSize() {
				return works.size();
			}
		});

	}
	@Override
	public List<work> getAllWorks(){
		String sql = "SELECT * FROM workshops";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		List<work> result = new ArrayList<work>();
		for(Map<String, Object> row:rows){
			work w = new work();
			w.setWorkid((String)row.get("workid"));
			w.setTopic((String)row.get("topic"));
			w.setVenue((String)row.get("venue"));
			w.setDate((Date)row.get("wsdate"));
		
			w.setOrganiser((String)row.get("organiser"));
			w.setLocation((String)row.get("location"));
			result.add(w);
		}
		
		return result;
	}

	@Override
	public work getWorkById(String empId) {
		String sql = "SELECT * FROM workshops WHERE workid = ?";
		return (work)getJdbcTemplate().queryForObject(sql, new Object[]{empId}, new RowMapper<work>(){
			@Override
			public work mapRow(ResultSet rs, int rwNumber) throws SQLException {
				work w = new work();
				w.setWorkid(rs.getString("workid"));
				w.setTopic(rs.getString("topic"));
				w.setVenue(rs.getString("venue"));
				w.setDate(rs.getDate("wsdate"));
			
				w.setOrganiser(rs.getString("organiser"));
				w.setLocation(rs.getString("location"));
				return w;
			}
		});
	}

	@Override
	public List<work> getWorkByTopic(String topic) {
		String sql = "SELECT * FROM workshops where topic like '%"+topic+"%'";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		List<work> result = new ArrayList<work>();
		for(Map<String, Object> row:rows){
			work w = new work();
			w.setWorkid((String)row.get("workid"));
			w.setTopic((String)row.get("topic"));
			w.setVenue((String)row.get("venue"));
			w.setDate((Date)row.get("wsdate"));
			//w.setReg_fee((int)row.get("regfee"));
			w.setOrganiser((String)row.get("organiser"));
			w.setLocation((String)row.get("location"));
			result.add(w);
		}
		
		return result;
	}

	@Override
	public List<work> getWorkByDate(Date date) {
		String sql = "SELECT * FROM workshops where wsdate like '%"+date+"%'";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		List<work> result = new ArrayList<work>();
		for(Map<String, Object> row:rows){
			work w = new work();
			w.setWorkid((String)row.get("workid"));
			w.setTopic((String)row.get("topic"));
			w.setVenue((String)row.get("venue"));
			w.setDate((Date)row.get("wsdate"));
		//	w.setReg_fee((int)row.get("regfee"));
			w.setOrganiser((String)row.get("organiser"));
			w.setLocation((String)row.get("location"));
			result.add(w);
		}
		
		return result;
	}

	@Override
	public List<work> getWorkByCity(String city) {
		String sql = "SELECT * FROM workshops where location like '%"+city+"%'";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		List<work> result = new ArrayList<work>();
		for(Map<String, Object> row:rows){
			work w = new work();
			w.setWorkid((String)row.get("workid"));
			w.setTopic((String)row.get("topic"));
			w.setVenue((String)row.get("venue"));
			w.setDate((Date)row.get("wsdate"));
			//w.setReg_fee((int)row.get("regfee"));
			w.setOrganiser((String)row.get("organiser"));
			w.setLocation((String)row.get("location"));
			result.add(w);
		}
		
		return result;
	}

	@Override
	public List<work> getWorkByCollege(String college) {
		String sql = "SELECT * FROM workshops where location like '%"+college+"%'";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		List<work> result = new ArrayList<work>();
		for(Map<String, Object> row:rows){
			work w = new work();
			w.setWorkid((String)row.get("workid"));
			w.setTopic((String)row.get("topic"));
			w.setVenue((String)row.get("venue"));
			w.setDate((Date)row.get("wsdate"));
			
			w.setOrganiser((String)row.get("organiser"));
			w.setLocation((String)row.get("location"));
			result.add(w);
		}
		
		return result;
	
	}

	@Override
	public List<work> getWorkByOrganiser(String organiser) {
		String sql = "SELECT * FROM workshops where organiser like '%"+organiser+"%'";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		List<work> result = new ArrayList<work>();
		for(Map<String, Object> row:rows){
			work w = new work();
			w.setWorkid((String)row.get("workid"));
			w.setTopic((String)row.get("topic"));
			w.setVenue((String)row.get("venue"));
			w.setDate((Date)row.get("wsdate"));
			w.setOrganiser((String)row.get("organiser"));
			w.setLocation((String)row.get("location"));
			result.add(w);
		}
		
		return result;
	}

	@Override
	public List<work> getWorkByYear(int year) {
		String sql = "SELECT * FROM workshops where wsdate like '%"+year+"%'";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		List<work> result = new ArrayList<work>();
		for(Map<String, Object> row:rows){
			work w = new work();
			w.setWorkid((String)row.get("workid"));
			w.setTopic((String)row.get("topic"));
			w.setVenue((String)row.get("venue"));
			w.setDate((Date)row.get("wsdate"));
			
			w.setOrganiser((String)row.get("organiser"));
			w.setLocation((String)row.get("location"));
			result.add(w);
		}
		
		return result;
	}

	@Override
	public List<work> getWorkByMonth(int month) {
		String sql = "SELECT * FROM workshops where date like '%-"+month+"-%'";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		List<work> result = new ArrayList<work>();
		for(Map<String, Object> row:rows){
			work w = new work();
			w.setWorkid((String)row.get("workid"));
			w.setTopic((String)row.get("topic"));
			w.setVenue((String)row.get("venue"));
			w.setDate((Date)row.get("wsdate"));
			
			w.setOrganiser((String)row.get("organiser"));
			w.setLocation((String)row.get("location"));
			result.add(w);
		}
		
		return result;
	}
}