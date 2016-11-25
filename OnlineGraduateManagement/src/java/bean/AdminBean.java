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
 * @author Bauer
 */
@ManagedBean
@SessionScoped
public class AdminBean {
    @ManagedProperty(value = "#{service}")
    private Service service;
    
    List<Klasse> kList = new ArrayList<>();
    List<Jahrgang> jList = new ArrayList<>();
    List<Boolean> bList = new ArrayList<>();
    
     boolean svnrB;
     boolean vornameB;
     boolean nachnameB;
     boolean geschlechtB;
     boolean telefonB;
     boolean eMailB;
     boolean beschäftigtB;
     boolean plzB;
     boolean straßeB;
     boolean ortB;
     boolean all;

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
    
    
    public void exportieren(){
        Absolvent a = null;
        if(all==true){
            service.exAbsolvent(a);
        }else if(svnr)
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

    public boolean isSvnrB() {
        return svnrB;
    }

    public void setSvnrB(boolean svnrB) {
        this.svnrB = svnrB;
    }

    public boolean isVornameB() {
        return vornameB;
    }

    public void setVornameB(boolean vornameB) {
        this.vornameB = vornameB;
    }

    public boolean isNachnameB() {
        return nachnameB;
    }

    public void setNachnameB(boolean nachnameB) {
        this.nachnameB = nachnameB;
    }

    public boolean isGeschlechtB() {
        return geschlechtB;
    }

    public void setGeschlechtB(boolean geschlechtB) {
        this.geschlechtB = geschlechtB;
    }

    public boolean isTelefonB() {
        return telefonB;
    }

    public void setTelefonB(boolean telefonB) {
        this.telefonB = telefonB;
    }

    public boolean iseMailB() {
        return eMailB;
    }

    public void seteMailB(boolean eMailB) {
        this.eMailB = eMailB;
    }

    public boolean isBeschäftigtB() {
        return beschäftigtB;
    }

    public void setBeschäftigtB(boolean beschäftigtB) {
        this.beschäftigtB = beschäftigtB;
    }

    public boolean isPlzB() {
        return plzB;
    }

    public void setPlzB(boolean plzB) {
        this.plzB = plzB;
    }

    public boolean isStraßeB() {
        return straßeB;
    }

    public void setStraßeB(boolean straßeB) {
        this.straßeB = straßeB;
    }

    public boolean isOrtB() {
        return ortB;
    }

    public void setOrtB(boolean ortB) {
        this.ortB = ortB;
    }

    public boolean isAll() {
        return all;
    }

    public void setAll(boolean all) {
        this.all = all;
    }

   
    
    
    

}
