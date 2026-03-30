package com.example.techcorp;

public class Main {
    public static void main(String[] args) {
        Project mobileApp = new Project("Mobile App", 40);

        
        Workable worker1 = new Employee("Anna", 9, 8000) {
            @Override
            public int work() { return getSkill(); }
        };

        Workable worker2 = new Employee("Piotr", 6, 6500) {
            @Override
            public int work() { return getSkill() / 2; }
        };

        mobileApp.addWorker(worker1);
        mobileApp.addWorker(worker2);
        
        
        mobileApp.addWorker(new AutomatedTool("Cipeline", 5));

        mobileApp.start();

        while (!mobileApp.isFinished()) {
            mobileApp.workOneTurn();
            System.out.println(mobileApp.getName() + " | progress: " 
                + mobileApp.getProgress() + "/" + mobileApp.getRequiredWork());
        }
        
        System.out.println("Projekt gotowy!");
    }
}