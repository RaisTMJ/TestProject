package com.backend.tutorial.maintainance.domain.model;

import javax.persistence.*;
import java.sql.Date;

@Entity(name= "EntityMaintainance")
@Table(name = "TRG_MNTC")
public class TrgMaintainanceImpl implements InterfaceMaintainanceModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
     private long id;

    @Column(name= "room")
    private String room;

    @Column (name ="name_clnr")
    private String cleanerName;

    @Column(name ="cln_Shle")
    private Date cleanSchedule;

    @Column (name="clnr_pmnt")
    private double cleanerPayment;

    @Column (name ="room_stts")
    private String roomStatus;

    public TrgMaintainanceImpl(){}

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getRoom() {
        return room;
    }

    @Override
    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public String getCleanerName() {
        return cleanerName;
    }

    @Override
    public void setCleanerName(String cleanerName) {
        this.cleanerName = cleanerName;
    }

    @Override
    public Date getCleanSchedule() {
        return cleanSchedule;
    }

    @Override
    public void setCleanSchedule(Date cleanSchedule) {
        this.cleanSchedule = cleanSchedule;
    }

    @Override
    public double getCleanerPayment() {
        return cleanerPayment;
    }

    @Override
    public void setCleanerPayment(double cleanerPayment) {
        this.cleanerPayment = cleanerPayment;
    }

    @Override
    public String getRoomStatus() {
        return roomStatus;
    }

    @Override
    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
    }
}
