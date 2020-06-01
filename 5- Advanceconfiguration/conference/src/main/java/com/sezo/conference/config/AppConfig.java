package com.sezo.conference.config;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sezo.conference.util.CalendarFactoy;

@Configuration
@ComponentScan({ "com.sezo" })
public class AppConfig {

	@Bean
	public CalendarFactoy getCalendarFactoy() {
		CalendarFactoy calfactoy = new CalendarFactoy();
		calfactoy.addDays(2);
		return calfactoy;
	}

	@Bean
	public Calendar cal() throws Exception {
		return getCalendarFactoy().getObject();
	}
	
}
