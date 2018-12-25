package com.backend.tutorial.maintainance.domain.dao;

import com.backend.tutorial.maintainance.domain.model.InterfaceMaintainanceModel;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class TrgMaintainanceDaoImpl implements InterfaceDaoMaintainance {
@PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveMaintainance(InterfaceMaintainanceModel trgMaintainance){
        entityManager.persist(trgMaintainance);
        entityManager.flush();
    }

    @Override
    public List<InterfaceMaintainanceModel > findMaintainance(){
        Query paymentQuery= entityManager.createQuery("select  maintainance from EntityMaintainance maintainance");
        return paymentQuery.getResultList();
    }

}
