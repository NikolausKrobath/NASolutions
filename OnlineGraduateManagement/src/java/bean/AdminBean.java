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
        kList.add(new Klassen(1,"5AHIF","2016/17"));
        kList.add(new Klassen(2,"3AHIF","2015/16"));
        kList.add(new Klassen(3,"4AHIF","2016/17"));
        jList.add(new Jahrgang("Jahrgang 2016/17"));
        jList.get(0).setkList(kList);
        
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public List<Klassen> getkList() {
        return kList;
    }

    public void setkList(List<Klassen> kList) {
        this.kList = kList;
    }

    public List<Jahrgang> getjList() {
        return jList;
    }

    public void setjList(List<Jahrgang> jList) {
        this.jList = jList;
    }
    

}
