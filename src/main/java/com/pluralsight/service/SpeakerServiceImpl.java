package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository speakerRepository = new HibernateSpeakerRepositoryImpl();

    public SpeakerServiceImpl() {
        System.out.println("SpeakerServiceImpl no args constructor");
    }
    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        System.out.println("SpeakerServiceImpl args constructor");
        this.speakerRepository = speakerRepository;
    }
    @Override
    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }

    @Autowired
    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        System.out.println("Inside setter speaker repository");
        this.speakerRepository = speakerRepository;
    }
}
