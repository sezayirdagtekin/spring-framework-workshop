package com.sezo.conference.service;

import java.util.List;

import javax.annotation.PostConstruct;

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

	@Autowired
	private SpeakerRepository speakerRepository;

	public SpeakerServiceImpl() {
		System.out.println("Default conctruction...");
	}
	
	@PostConstruct
	private void initialize() {
		System.out.println("We are calling after conctruction...");

	}

	
	@Override
	public List<Speaker> findAll() {
		return speakerRepository.findAll();

	}

}
