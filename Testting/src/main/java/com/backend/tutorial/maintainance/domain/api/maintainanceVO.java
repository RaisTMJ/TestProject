package com.backend.tutorial.maintainance.domain.api;

import javax.persistence.Column;
import java.sql.Date;

public class maintainanceVO {
    private long id;
    private String room;
    private String cleanerName;
    private Date cleanSchedule;
    private double cleanerPayment;
    private String roomStatus;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getCleanerName() {
        return cleanerName;
    }

    public void setCleanerName(String cleanerName) {
        this.cleanerName = cleanerName;
    }

    public Date getCleanSchedule() {
        return cleanSchedule;
    }

    public void setCleanSchedule(Date cleanSchedule) {
        this.cleanSchedule = cleanSchedule;
    }

    public double getCleanerPayment() {
        return cleanerPayment;
    }

    public void setCleanerPayment(double cleanerPayment) {
        this.cleanerPayment = cleanerPayment;
    }

    public String getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
    }
}
