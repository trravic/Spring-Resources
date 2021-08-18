package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    @Autowired
    private SpeakerRepository speakerRepository = new HibernateSpeakerRepositoryImpl();

    public SpeakerServiceImpl() {
        System.out.println("SpeakerServiceImpl no args constructor");
    }

    @Autowired
    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        System.out.println("SpeakerServiceImpl args constructor");
        this.speakerRepository = speakerRepository;
    }

    /**
     * Example of bean postprocessor
     */
    @PostConstruct
    private void initialize(){
        System.out.println("Called after constructors");
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
