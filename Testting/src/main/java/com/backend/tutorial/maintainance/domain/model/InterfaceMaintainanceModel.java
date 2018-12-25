package com.backend.tutorial.maintainance.domain.model;

import java.sql.Date;

public interface InterfaceMaintainanceModel {
    long getId();

    void setId(long id);

    String getRoom();

    void setRoom(String room);

    String getCleanerName();

    void setCleanerName(String cleanerName);

    Date getCleanSchedule();

    void setCleanSchedule(Date cleanSchedule);

    double getCleanerPayment();

    void setCleanerPayment(double cleanerPayment);

    String getRoomStatus();

    void setRoomStatus(String roomStatus);
}
