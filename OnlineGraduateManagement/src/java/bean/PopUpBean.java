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
import pojo.Absolvent;
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
    
    Absolvent absolvent;
    Klasse klasse;
    Jahrgang jahrgang;
    List<Klasse> kList = new ArrayList<Klasse>();
    
    public PopUpBean(){
        
    }
    
    public void klasseExportieren(){
        
    }
    
    public void klasseImportieren(){
        
    }
    
    public void klasseHinzufügen(){
        
    }
    
    public void jahrgangHinzufügen(){
        
    }
    
    public void absolventHinzufügen(){
        
    }
    
    public void datenBearbeiten(){
        
    }
    
    public void datenLöschen(){
        
    }
    

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Absolvent getAbsolvent() {
        return absolvent;
    }

    public void setAbsolvent(Absolvent absolvent) {
        this.absolvent = absolvent;
    }

    public Klasse getKlasse() {
        return klasse;
    }

    public void setKlasse(Klasse klasse) {
        this.klasse = klasse;
    }

    public Jahrgang getJahrgang() {
        return jahrgang;
    }

    public void setJahrgang(Jahrgang jahrgang) {
        this.jahrgang = jahrgang;
    }
    
    

    public List<Klasse> getkList() {
        return kList;
    }

    public void setkList(List<Klasse> kList) {
        this.kList = kList;
    }
    
    
    
}
