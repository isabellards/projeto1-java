package com.example.demo;

import java.util.ArrayList;

public class Symptom {
    private ArrayList<String> symptoms = new ArrayList<>();

    public void add(String name) {
        this.symptoms.add(name);
    }
    public ArrayList<String> getAllSymptoms() {
        return this.symptoms;
    }
}
