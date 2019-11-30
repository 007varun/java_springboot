package com.javainuse.dao;

import java.util.List;
import java.sql.Date;

import com.javainuse.model.work;

public interface EmployeeDao {
	void insertWork(work cus);
	void insertWorks(List<work> works);
	List<work> getAllWorks();
	work getWorkById(String workId);
	List<work> getWorkByTopic(String topic);
	List<work> getWorkByDate(Date date);
	List<work> getWorkByYear(int year);
	List<work> getWorkByMonth(int month);
	List<work> getWorkByCity(String city);
	List<work> getWorkByCollege(String location);
	List<work> getWorkByOrganiser(String organiser);
}