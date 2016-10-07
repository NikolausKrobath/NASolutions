/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import pojo.Jahrgang;
import pojo.Klassen;
import service.Service;

/**
 *
 * @author Bauer
 */
@ManagedBean
@SessionScoped
public class AdminBean {
    @ManagedProperty(value = "#{service}")
    private Service service;
    
    List<Klassen> kList = new ArrayList<>();
    List<Jahrgang> jList = new ArrayList<>();

    public AdminBean() {
        jList = service.getjList();
        kList = service.getjList().get(0).getKlassenliste();
    }
    
    
    
}
