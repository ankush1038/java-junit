package com.bridgelabz;

public class Performance {
    public String longRunnigTask(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        return "Task Completed";
    }
}
