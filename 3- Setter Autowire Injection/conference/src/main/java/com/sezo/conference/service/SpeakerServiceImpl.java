package com.sezo.conference.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sezo.conference.model.Speaker;
import com.sezo.conference.repository.SpeakerRepository;

/**
 * 
 * @author sezayir
 *
 */
public class SpeakerServiceImpl implements SpeakerService {

	private SpeakerRepository speakerRepository;
	

	public SpeakerServiceImpl() {
		  System.out.println("Default sonctruction...");
	}

	@Autowired
	public void setSpeakerRepository(SpeakerRepository speakerRepository) {
	   System.out.println("Method level autowired injection...");
		this.speakerRepository = speakerRepository;
	}

	@Override
	public List<Speaker> findAll() {
		return speakerRepository.findAll();

	}

}
