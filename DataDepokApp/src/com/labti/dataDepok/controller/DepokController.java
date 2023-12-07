/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labti.dataDepok.controller;

import com.labti.dataDepok.app;
import com.labti.dataDepok.config.DepokTableModel;
import com.labti.dataDepok.model.Depok;
import com.labti.dataDepok.view.DepokView;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

public class DepokController {
    private final DepokView depokView;
    private DepokTableModel depokTableModel;
    private List<Depok> depoks;
    
    public DepokController (DepokView depokView){
        this.depokView = depokView;
    }
    
    public void tampilData(){
        depoks = app.getDepokService().getDepoks();
        depokTableModel = new DepokTableModel(depoks);
        this.depokView.getTabel().setModel((TableModel) depokTableModel);
    }
    
    public void show(){
        int index = this.depokView.getTabel().getSelectedRow();
        this.depokView.getNpm().setText(String.valueOf(
        this.depokView.getTabel().getValueAt(index, 0)));
        this.depokView.getNama().setText(String.valueOf(
        this.depokView.getTabel().getValueAt(index, 1)));
        this.depokView.getAlamat().setText(String.valueOf(
        this.depokView.getTabel().getValueAt(index, 2)));
        this.depokView.getRating().setText(String.valueOf(
        this.depokView.getTabel().getValueAt(index, 3)));
    }
    
    public void clear(){
        this.depokView.getNpm().setText("");
        this.depokView.getNama().setText("");
        this.depokView.getAlamat().setText("");
        this.depokView.getRating().setText("");
    }
    
    public void saveDepok(){
        Depok depok = new Depok();
        depok.setId(this.depokView.getNpm().getText());
        depok.setNama(this.depokView.getNama().getText());
        depok.setAlamat(this.depokView.getAlamat().getText());
        depok.setRating(this.depokView.getRating().getText());
        app.getDepokService().save(depok);
        JOptionPane.showMessageDialog(null, "Data Berhasil di simpan", "info",
                JOptionPane.INFORMATION_MESSAGE);
        clear();
        tampilData();
    }
    
    public void updateDepok(){
        Depok depok = new Depok();
        depok.setId(this.depokView.getNpm().getText());
        depok.setNama(this.depokView.getNama().getText());
        depok.setAlamat(this.depokView.getAlamat().getText());
        depok.setRating(this.depokView.getRating().getText());
        app.getDepokService().update(depok);
        JOptionPane.showMessageDialog(null, "Data berhasil di Edit", "info",
                JOptionPane.INFORMATION_MESSAGE);
        clear();
        tampilData();
    }
    
    public void deleteDepok(){
        if(this.depokView.getNpm().getText() == null){
            JOptionPane.showMessageDialog(null, "mahasiswa belum dipilih","error",JOptionPane.ERROR_MESSAGE);
        }else{
            Depok depok = new Depok();
            depok.setId(this.depokView.getNpm().getText());
            int pilih = JOptionPane.showConfirmDialog(null,"Apakah data ingin dihapus ?", "Warning",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (pilih == JOptionPane.YES_OPTION){
                app.getDepokService().delete(depok);
                JOptionPane.showMessageDialog(null, "Data Berhasil di Hapus","info",JOptionPane.INFORMATION_MESSAGE);
                clear();
                tampilData();
            }
        }
    }
}
