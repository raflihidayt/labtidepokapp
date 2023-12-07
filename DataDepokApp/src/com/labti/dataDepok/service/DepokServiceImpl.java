/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labti.dataDepok.service;

import com.labti.dataDepok.model.Depok;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.labti.dataDepok.dao.DepokDAO;

@Service("DepokService")
@Transactional(readOnly = true)

public class DepokServiceImpl implements DepokService {
    @Autowired
    private DepokDAO depokDao;
    
    @Transactional
    @Override
    public void save(Depok depok){
        depokDao.save(depok);
    }
    
    @Transactional
    @Override
    public void update(Depok depok){
        depokDao.update(depok);
    }
    
    @Transactional
    @Override
    public void delete(Depok depok){
        depokDao.delete(depok);
    }
    
    @Override
    public Depok getDepok(String npm){
        return depokDao.getDepok(npm);
    }
    
    @Override
    public List<Depok> getDepoks(){
        return depokDao.getDepoks();
    }
}
