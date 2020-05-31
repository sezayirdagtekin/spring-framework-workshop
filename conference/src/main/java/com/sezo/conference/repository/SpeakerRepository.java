package com.sezo.conference.repository;

import java.util.List;

import com.sezo.conference.model.Speaker;

public interface SpeakerRepository {

	List<Speaker> findAll();

}