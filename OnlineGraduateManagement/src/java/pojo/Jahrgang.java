/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pojo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nikolaus
 */
public class Jahrgang {
    List<Klasse> kList = new ArrayList<>();
    String jahrgang;

    public Jahrgang(String jahrgang) {
        this.jahrgang = jahrgang;
    }
    
    

    public Jahrgang() {
    }

    public List<Klasse> getkList() {
        return kList;
    }

    public void setkList(List<Klasse> kList){
        this.kList = kList;
    }

    public String getJahrgang() {
        return jahrgang;
    }

    public void setJahrgang(String jahrgang) {
        this.jahrgang = jahrgang;
    }
    
    public Klasse getKlasse(int id){
        return kList.get(id);
    }
    
    public void addKlassenListe(List<Klasse> kList){
        this.kList = kList;
    }
    
    public void addKlasse(Klasse k){
            this.kList.add(k);
    }
}
