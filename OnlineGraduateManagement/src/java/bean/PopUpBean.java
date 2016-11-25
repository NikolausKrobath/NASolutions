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
 * @author Nikolaus
 */
@ManagedBean
@SessionScoped
public class PopUpBean {
    @ManagedProperty(value = "#{service}")
    private Service service;
    
    Klasse k;
    Jahrgang j;
    List<Klasse> kList = new ArrayList<Klasse>();
    
    public PopUpBean(){
        
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Klasse getK() {
        return k;
    }

    public void setK(Klasse k) {
        this.k = k;
    }

    public Jahrgang getJ() {
        return j;
    }

    public void setJ(Jahrgang j) {
        this.j = j;
    }

    public List<Klasse> getkList() {
        return kList;
    }

    public void setkList(List<Klasse> kList) {
        this.kList = kList;
    }
    
    
    
}
