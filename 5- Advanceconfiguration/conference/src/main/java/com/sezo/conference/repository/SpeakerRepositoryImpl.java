package com.sezo.conference.repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sezo.conference.model.Speaker;

/**
 * 
 * @author Sezayir
 *
 */

@Repository(value = "speakerRepository")
public class SpeakerRepositoryImpl implements SpeakerRepository {

	@Autowired
	private Calendar cal;

	@Override
	public List<Speaker> findAll() {

		List<Speaker> speakers = new ArrayList<>();
		Speaker speaker = new Speaker();
		speaker.setFirstName("Sezayir");
		speaker.setLastName("Dagtekin");
		speaker.setDate(cal.getTime());
		speakers.add(speaker);
		return speakers;
	}

}
