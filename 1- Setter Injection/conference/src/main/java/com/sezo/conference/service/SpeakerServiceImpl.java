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
	
	//Setter injection
	public void setSpeakerRepository(SpeakerRepository speakerRepository) {
	   System.out.println("Setter injection...");
		this.speakerRepository = speakerRepository;
	}

	@Override
	public List<Speaker> findAll() {
		return speakerRepository.findAll();

	}

}
