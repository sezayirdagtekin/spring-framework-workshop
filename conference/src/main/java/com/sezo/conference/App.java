package com.sezo.conference;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sezo.conference.config.AppConfig;
import com.sezo.conference.model.Speaker;
import com.sezo.conference.service.SpeakerService;

public class App {

	private static ApplicationContext appContext;

	public static void main(String[] args) {

		appContext = new AnnotationConfigApplicationContext(AppConfig.class);

		SpeakerService service = (SpeakerService) appContext.getBean("speakerService", SpeakerService.class);

		List<Speaker> speakers = service.findAll();
		speakers.forEach(System.out::println);

	}
}
