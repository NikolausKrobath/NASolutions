/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import pojo.Jahrgang;

/**
 *
 * @author Bauer
 */
@ManagedBean
@SessionScoped
public class Service {
    List<Jahrgang> jList = new ArrayList<>();
    
    

    public List<Jahrgang> getjList() {
        return jList;
    }

    public void setjList(List<Jahrgang> jList) {
        this.jList = jList;
    }
    
    
}


