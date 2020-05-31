package com.sezo.conference.service;

import java.util.List;

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

	public void setSpeakerRepository(SpeakerRepository speakerRepository) {
		this.speakerRepository = speakerRepository;
	}

	@Override
	public List<Speaker> findAll() {
		return speakerRepository.findAll();

	}

}
