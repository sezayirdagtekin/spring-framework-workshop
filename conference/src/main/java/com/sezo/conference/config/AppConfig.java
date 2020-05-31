package com.sezo.conference.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.sezo.conference.repository.SpeakerRepository;
import com.sezo.conference.repository.SpeakerRepositoryImpl;
import com.sezo.conference.service.SpeakerService;
import com.sezo.conference.service.SpeakerServiceImpl;

@Configuration
public class AppConfig {
	
	@Bean(name = "speakerService")
	@Scope(value="singleton")
	public SpeakerService getSpeakerService() {
		SpeakerServiceImpl service =	new SpeakerServiceImpl();
		service.setSpeakerRepository(getSpeakerRepository());
		return service;
	}
	
	@Bean(name="speakerRepository")
	public SpeakerRepository getSpeakerRepository() {
		return new SpeakerRepositoryImpl();
	}

}
