package com.backend.tutorial.maintainance.domain.dao;

import com.backend.tutorial.maintainance.domain.model.InterfaceMaintainanceModel;

import java.util.List;

public interface InterfaceDaoMaintainance {

    void saveMaintainance(InterfaceMaintainanceModel trgMaintainance);

    List<InterfaceMaintainanceModel > findMaintainance();
}
