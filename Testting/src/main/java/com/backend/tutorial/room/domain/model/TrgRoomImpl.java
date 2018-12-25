package com.backend.tutorial.room.domain.model;

import javax.persistence.*;
import java.sql.Date;

@Entity(name= "ROOM")
@Table(name= "TRG_ROOM")
public class TrgRoomImpl implements TrgRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;

    @Column(name= "DateRegister")
    private Date tarikhDaftar;

    @Column (name= "RoomName")
    private String roomName;

    @Column(name= "roomAddressline1")
    private String roomAddressLine1;
    @Column(name= "roomAddressline2")
    private String roomAddressLine2;
    @Column(name= "roomAddressline3")
    private String roomAddressLine3;
    @Column(name= "roomAddressPoskod")
    private Integer roomAddressPoskod;

    public TrgRoomImpl() {
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Date getTarikhDaftar() {
        return tarikhDaftar;
    }

    @Override
    public void setTarikhDaftar(Date tarikhDaftar) {
        this.tarikhDaftar = tarikhDaftar;
    }

    @Override
    public String getRoomName() {
        return roomName;
    }

    @Override
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    @Override
    public String getRoomAddressLine1() {
        return roomAddressLine1;
    }

    @Override
    public void setRoomAddressLine1(String roomAddressLine1) {
        this.roomAddressLine1 = roomAddressLine1;
    }

    @Override
    public String getRoomAddressLine2() {
        return roomAddressLine2;
    }

    @Override
    public void setRoomAddressLine2(String roomAddressLine2) {
        this.roomAddressLine2 = roomAddressLine2;
    }

    @Override
    public String getRoomAddressLine3() {
        return roomAddressLine3;
    }

    @Override
    public void setRoomAddressLine3(String roomAddressLine3) {
        this.roomAddressLine3 = roomAddressLine3;
    }

    @Override
    public Integer getRoomAddressPoskod() {
        return roomAddressPoskod;
    }

    @Override
    public void setRoomAddressPoskod(Integer roomAddressPoskod) {
        this.roomAddressPoskod = roomAddressPoskod;
    }
}
