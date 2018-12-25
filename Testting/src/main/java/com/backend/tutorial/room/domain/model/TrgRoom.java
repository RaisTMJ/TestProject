package com.backend.tutorial.room.domain.model;

import java.sql.Date;

public interface TrgRoom {
    String getId();

    void setId(String id);

    Date getTarikhDaftar();

    void setTarikhDaftar(Date tarikhDaftar);

    String getRoomName();

    void setRoomName(String roomName);

    String getRoomAddressLine1();

    void setRoomAddressLine1(String roomAddressLine1);

    String getRoomAddressLine2();

    void setRoomAddressLine2(String roomAddressLine2);

    String getRoomAddressLine3();

    void setRoomAddressLine3(String roomAddressLine3);

    Integer getRoomAddressPoskod();

    void setRoomAddressPoskod(Integer roomAddressPoskod);
}
