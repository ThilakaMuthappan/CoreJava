package com.java.timetracker;

import java.time.LocalDateTime;

public class Task {

    private String taskName;
    private Category category;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;

    public Task()
    {

    }
    public Task(String taskName, Category category, LocalDateTime startDateTime, LocalDateTime endDateTime) {
        this.taskName = taskName;
        this.category = category;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
    }
    
    public String getTaskName() {
        return taskName;
    }
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }
    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }
    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }
    
}
