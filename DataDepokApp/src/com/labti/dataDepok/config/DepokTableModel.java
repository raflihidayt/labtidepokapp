/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labti.dataDepok.config;

import com.labti.dataDepok.model.Depok;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class DepokTableModel extends AbstractTableModel {
    private List<Depok> depoks = new ArrayList<>();
    private final String HEADER[] = {"id","nama","alamat","rating"};
    
    public DepokTableModel(List<Depok> mahasiswas){
        this.depoks = mahasiswas;
    }
    
    @Override
    public int getRowCount(){
        return depoks.size();
    }
    
    @Override
    public int getColumnCount(){
        return HEADER.length;
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return HEADER[columnIndex];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Depok depok = depoks.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return depok.getId();
            case 1:
                return depok.getNama();
            case 2:
                return depok.getAlamat();
            case 3:
                return depok.getRating();
            default:
                return null;
        }
    }
}
