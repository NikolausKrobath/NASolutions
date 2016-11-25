/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import database.Absolvent.AbsolventDAOJDBC;
import database.Code.CodeDAOJDBC;
import database.Klassen.KlassenDAOJDBC;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import pojo.Absolvent;
import pojo.Jahrgang;
import pojo.Klasse;

/**
 *
 * @author Bauer
 */
@ManagedBean
@SessionScoped
public class Service {
    @ManagedProperty(value = "#{absolventDAOJDBC}")
    AbsolventDAOJDBC absolventDAO;
    
    @ManagedProperty(value = "#{codeDAOJDBC}")
    CodeDAOJDBC codeDAO;
    
    @ManagedProperty(value = "#{klassenDAOJDBC}")
    KlassenDAOJDBC klasseDAO;
    
    List<Jahrgang> jList = new ArrayList<>();

    public Service() {
    }
    
    public void addKlasse(Klasse k) throws SQLException{
        klasseDAO.insert(k);
    }
    
    public void updateKlasse(Klasse k) throws SQLException{
        klasseDAO.update(k);
    }
    
    public void deleteKlasse(Klasse k) throws SQLException{
        klasseDAO.delete(k);
    }
    
    public Klasse getKlasse(int i){
        return null;
    }
    
    
    public void addAbsolvent(Absolvent a) throws SQLException{
        absolventDAO.insert(a);
    }
    
    public void updateAbsolvent(Absolvent a) throws SQLException{
        absolventDAO.update(a);
    }
    
    public void deleteAbsolvent(Absolvent a) throws SQLException{
        absolventDAO.delete(a);
    }
    
    public Absolvent getAbsolvent(int i){
        return null;
    }
    
    

    public List<Jahrgang> getjList() {
        return jList;
    }

    public void setjList(List<Jahrgang> jList) {
        this.jList = jList;
    }
    
    
}


