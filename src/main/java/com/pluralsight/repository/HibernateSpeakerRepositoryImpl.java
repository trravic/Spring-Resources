package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Autowired
    private Calendar calendar;

    @Value("#{ T(java.lang.Math).random() * 100.0 }")
    private double seedNum;
    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker1 = new Speaker();
        speaker1.setFirstName("Thiyagarajan");
        speaker1.setLastName("Ravichandran");
        speaker1.setSeedNum(seedNum);


        System.out.println("Cal : " + calendar.getTime());
        speakers.add(speaker1);
        return speakers;
    }
}
