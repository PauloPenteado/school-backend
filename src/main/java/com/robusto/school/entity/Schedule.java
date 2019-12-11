package com.robusto.school.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="schedule")
public class Schedule {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int Id;
	
	@ManyToOne(cascade= {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name="course_id")
	private Course course;
	
	@JoinColumn(name="instructor_id")
	@OneToOne
	private Employee instructor;
	
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
	
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}


	public Employee getInstructor() {
		return instructor;
	}

	public void setInstructor(Employee instructor) {
		this.instructor = instructor;
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
		return "Schedule [Id=" + Id + ", course=" + course + ", instructor=" + instructor + ", level=" + level
				+ ", day=" + day + ", hour=" + hour + ", minutes=" + minutes + "]";
	}

}
