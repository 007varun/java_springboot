package com.javainuse.model;
/*
public class Employee {

	private String empId;
	private String empName;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}

}
*/

import java.sql.Date;
public class work {


		String workid;
		String topic;
		String venue;
		Date date;
		String organiser;
		String location;
		
		public String getTopic() {
			return topic;
		}
		public void setTopic(String topic) {
			this.topic = topic;
		}
		public String getVenue() {
			return venue;
		}
		public void setVenue(String venue) {
			this.venue = venue;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		
		public String getOrganiser() {
			return organiser;
		}
		public void setOrganiser(String organiser) {
			this.organiser = organiser;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getWorkid() {
			return workid;
		}
		public void setWorkid(String workid) {
			this.workid = workid;
		}

		@Override
		public String toString() {
			return ("Publication[ID=" + workid + ", Topic=" + topic + ", conference=" + venue + ", Date=" + date + ", journal=" + organiser + ", Location=" + location + "]");
		}
}