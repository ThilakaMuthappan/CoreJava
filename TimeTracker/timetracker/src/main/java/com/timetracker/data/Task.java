package com.timetracker.data;

import java.time.LocalDateTime;

public class Task {

    private String taskName;
    private Category category;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private TaskStatus taskStatus;


    public Task(String taskName, Category category) {
        this.taskName = taskName;
        this.category = category;
        this.startTime = LocalDateTime.now();
        this.taskStatus = TaskStatus.TASK_INPROGRESS;
    }


    public TaskStatus getTaskStatus() {
        return taskStatus;
    }
    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
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
    public LocalDateTime getStartTime() {
        return startTime;
    }
    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }
    public LocalDateTime getEndTime() {
        return endTime;
    }
    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Task : [category=" + category + ", endTime=" + endTime + ", startTime=" + startTime + ", taskName="
                + taskName + ", taskStatus=" + taskStatus + "]";
    }
    
}
