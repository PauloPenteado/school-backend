package com.robusto.school.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="schedule")
public class Schedule {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int Id;
	
	@Column(name="course_id")
	private int courseId;
	
	@Column(name="instructor_id")
	private int instructorId;
	
	@Column(name="level")
	private String level;
	
	@Column(name="day")
	private int day;
	
	@Column(name="hour")
	private int hour;
	
	@Column(name="minutes")
	private int minutes;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	@Override
	public String toString() {
		return "Schedule [id=" + Id + ", courseId=" + courseId + ", instructorId=" + instructorId + ", level=" + level
				+ ", day=" + day + ", hour=" + hour + ", minutes=" + minutes + "]";
	}
	
	
}
