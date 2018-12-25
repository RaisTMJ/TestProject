package com.backend.tutorial.maintainance.domain.api;

import com.backend.tutorial.maintainance.domain.dao.InterfaceDaoMaintainance;
import com.backend.tutorial.maintainance.domain.model.InterfaceMaintainanceModel;
import com.backend.tutorial.maintainance.domain.model.TrgMaintainanceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class maintainanceController {

    private final InterfaceDaoMaintainance maintainanceDao;

    @Autowired
    public maintainanceController(InterfaceDaoMaintainance maintainanceDao){
        this.maintainanceDao=maintainanceDao;
    }

    @GetMapping(path = "add_maintainance")
    public ResponseEntity<List<InterfaceMaintainanceModel>>findMaintainances(){
        List<InterfaceMaintainanceModel> maintainance =maintainanceDao.findMaintainance();
        return new ResponseEntity<List<InterfaceMaintainanceModel>>(maintainance,HttpStatus.OK);

    }
    @PostMapping(path="/new")
    public ResponseEntity<String> makeMaintainance(@RequestBody maintainanceVO vo){

        InterfaceMaintainanceModel maintainance= new TrgMaintainanceImpl();
        maintainance.setCleanSchedule(vo.getCleanSchedule());
        maintainance.setRoom(vo.getRoom());
        maintainance.setCleanerName(vo.getCleanerName());
        maintainance.setRoomStatus(vo.getRoomStatus());
        maintainanceDao.saveMaintainance(maintainance);
        return new ResponseEntity<>("maintainance has been added", HttpStatus.OK);

    }

}
