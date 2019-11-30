package com.javainuse.service;

import java.sql.Date;
import java.util.List;

import com.javainuse.model.work;

public interface workService {
	void insertWork(work emp);
	void insertWorks(List<work> works);
	List<work> getAllWorks();
	work getWorkById(String empid);
	List<work> getWorkByTopic(String topic);
	List<work> getWorkByDate(Date date);
	List<work> getWorkByYear(int year);
	List<work> getWorkByMonth(int month);
	List<work> getWorkByCity(String city);
	List<work> getWorkByCollege(String college);
	List<work> getWorkByOrganiser(String organiser);
}