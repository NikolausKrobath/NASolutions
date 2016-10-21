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
import pojo.Klasse;
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
    
    List<Klasse> kList = new ArrayList<>();
    List<Jahrgang> jList = new ArrayList<>();

    public AdminBean() {
        jList.add(new Jahrgang("2016/17"));
      /*  jList = service.getjList();
        jList.add(new Jahrgang("Jahrgang 2016/17"));
        kList = service.getjList().get(0).getkList();
        kList.add(new Klasse(1,"5AHIF","2016/17"));
        kList.add(new Klasse(2,"3AHIF","2015/16"));
        kList.add(new Klasse(3,"4AHIF","2016/17"));
        
        jList.get(0).setkList(kList);
        */
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public List<Klasse> getkList() {
        return kList;
    }

    public void setkList(List<Klasse> kList) {
        this.kList = kList;
    }

    public List<Jahrgang> getjList() {
        return jList;
    }

    public void setjList(List<Jahrgang> jList) {
        this.jList = jList;
    }
    

}
