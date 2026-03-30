package com.example.techcorp;

public class FreelancerBot implements Workable {
    private String model;
    private int power;

    public FreelancerBot(String model, int power) {
        this.model = model;
        this.power = power;
    }

    @Override
    public int work() {
        return power;
    }
}