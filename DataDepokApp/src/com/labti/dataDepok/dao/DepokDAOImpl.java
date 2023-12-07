/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labti.dataDepok.dao;

import com.labti.dataDepok.model.Depok;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DepokDAOImpl implements DepokDAO {
     @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void save(Depok depok){
        sessionFactory.getCurrentSession().save(depok);
    }
    
    @Override
    public void update(Depok depok){
        sessionFactory.getCurrentSession().update(depok);
    }
    
    @Override
    public void delete(Depok depok){
        sessionFactory.getCurrentSession().delete(depok);
    }
    
    @Override
    public Depok getDepok(String id){
        return (Depok) sessionFactory.getCurrentSession().get(Depok.class, id);        
    }
    
    @Override
    public List<Depok> getDepoks(){
        return sessionFactory.getCurrentSession().createCriteria(Depok.class).list();
    }
}
