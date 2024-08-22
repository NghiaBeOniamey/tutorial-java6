package com.example.demo.entity;

import org.springframework.stereotype.Component;

@Component
public class AnhQuynh implements Study{

    @Override
    public void studyEnglish() {
        System.out.println("study English 1");
    }
}
