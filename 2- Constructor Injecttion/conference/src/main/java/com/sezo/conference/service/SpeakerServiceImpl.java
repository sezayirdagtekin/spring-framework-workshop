package com.sezo.conference.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sezo.conference.model.Speaker;
import com.sezo.conference.repository.SpeakerRepository;
import com.sezo.conference.repository.SpeakerRepositoryImpl;

/**
 * 
 * @author sezayir
 *
 */
public class SpeakerServiceImpl implements SpeakerService {

	private SpeakerRepository speakerRepository;

	// constructor injection
	public SpeakerServiceImpl(SpeakerRepository repository) {
		System.out.println("Constructor injection...");
		this.speakerRepository = repository;

	}

	@Override
	public List<Speaker> findAll() {
		return speakerRepository.findAll();

	}

}
