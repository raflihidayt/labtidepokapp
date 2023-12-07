/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labti.dataDepok.dao;

import com.labti.dataDepok.model.Depok;
import java.util.List;

public interface DepokDAO {
    public void save(Depok depok);
    public void update(Depok depok);
    public void delete(Depok depok);
    public Depok getDepok(String id);
    public List<Depok> getDepoks();
}
