package com.example.demo.entity;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Student implements Outfit, Study {

    private String name;

    @PreDestroy
    @Override
    public void wear() {
        System.out.println("Mặc kimono");
    }

    @Override
    public void studyEnglish() {
        System.out.println("Study English");
    }
}
