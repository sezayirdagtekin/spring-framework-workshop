package com.sezo.conference.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sezo.conference.model.Speaker;

/**
 * 
 * @author Sezayir
 *
 */

@Repository(value="speakerRepository")
public class SpeakerRepositoryImpl implements SpeakerRepository {

	@Override
	public List<Speaker> findAll() {
		List<Speaker> speakers = new ArrayList<>();
		Speaker speaker = new Speaker();
		speaker.setFirstName("Sezayir");
		speaker.setLastName("Dagtekin");
		speakers.add(speaker);
		return speakers;
	}

}
