package com.sezo.conference.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sezo.conference.model.Speaker;
import com.sezo.conference.repository.SpeakerRepository;

/**
 * 
 * @author sezayir
 *
 */
@Service(value = "speakerService")
public class SpeakerServiceImpl implements SpeakerService {

	private SpeakerRepository speakerRepository;

	public SpeakerServiceImpl() {
		System.out.println("Default sonctruction...");
	}

	// Disable constructor injection
	// @Autowired
	public SpeakerServiceImpl(SpeakerRepository repository) {
		System.out.println("Constructor  injection...");
		this.speakerRepository = repository;
	}

	// Enable Setter injection
	@Autowired
	public void setSpeakerRepository(SpeakerRepository speakerRepository) {
		System.out.println("Setter injection...");
		this.speakerRepository = speakerRepository;
	}

	@Override
	public List<Speaker> findAll() {
		return speakerRepository.findAll();

	}

}
