package com.razal.entities;

import java.util.Date;

public class Task {

    private int taskid;
    private String name;
    private String descrition;
    private Date created;
    private int atachmentid;

    public Task() {

    }

    public int getTaskid() {
        return taskid;
    }

    public void setTaskid(int taskid) {
        this.taskid = taskid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public int getAtachmentid() {
        return atachmentid;
    }

    public void setAtachmentid(int atachmentid) {
        this.atachmentid = atachmentid;
    }

    @Override
    public String toString() {
        return "Task{" +
                ", name='" + name + '\'' +
                ", descrition='" + descrition + '\'' +
                ", created=" + created +
                '}';
    }
}
