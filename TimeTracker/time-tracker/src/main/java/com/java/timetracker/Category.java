package com.java.timetracker;

public class Category {
    
    private String name;
    private int totalTime;

    
    public Category(String name, int totalTime) {
        this.name = name;
        this.totalTime = totalTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalTime() {
        return totalTime;
    }

     public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    

}
