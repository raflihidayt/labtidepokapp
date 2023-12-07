/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labti.dataDepok;

import com.labti.dataDepok.view.DepokView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.labti.dataDepok.service.DepokService;

public class app {

    private static ApplicationContext applicationContext;
    
    public static void main(String[] args){
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring-configuration.xml");
        new DepokView().setVisible(true);
    }
    
    public static DepokService getDepokService(){
        return(DepokService)applicationContext.getBean("DepokService");
    }
    
}
