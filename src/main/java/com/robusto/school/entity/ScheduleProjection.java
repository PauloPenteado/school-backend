package com.robusto.school.entity;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="scheduleDTO", types = { Schedule.class })
public interface ScheduleProjection {

	int getId();
	Course getCourse();
	Employee getInstructor();
	String getLevel();
	int getDay();
	int getHour();
	int getMinutes();
}
