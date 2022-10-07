package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Disease {
    private int id;
    private String name;
    private List<String> symptoms = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(List<String> symptoms) {
        this.symptoms = symptoms;
    }

    public Disease(int id, String name, List<String> symptoms){
        this.id = id;
        this.name = name;
        this.symptoms.addAll(symptoms);
    }

}
