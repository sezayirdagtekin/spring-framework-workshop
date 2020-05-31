package com.sezo.conference;

import java.util.List;

import com.sezo.conference.model.Speaker;
import com.sezo.conference.service.SpeakerService;
import com.sezo.conference.service.SpeakerServiceImpl;



public class App 
{
    public static void main( String[] args )
    {
    	SpeakerService service= new SpeakerServiceImpl();
    	List<Speaker> speakers= service.findAll();
    	speakers.forEach(System.out::println);

    }
}
