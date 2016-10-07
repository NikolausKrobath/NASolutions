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
    List<Klassen> kList = new ArrayList<>();
    String jahrgang;

    public Jahrgang(String jahrgang) {
        this.jahrgang = jahrgang;
    }

    public Jahrgang() {
    }

    public List<Klassen> getkList() {
        return kList;
    }

    public void setkList(List<Klassen> kList) {
        this.kList = kList;
    }

    public String getJahrgang() {
        return jahrgang;
    }

    public void setJahrgang(String jahrgang) {
        this.jahrgang = jahrgang;
    }
    
    public Klassen getKlasse(int id){
        return kList.get(id);
    }
    
    public List<Klassen> getKlassenliste(){
        return kList;
    }
    
    public void addKlassenListe(List<Klassen> kList){
        this.kList = kList;
    }
    
    public void addKlasse(Klassen k){
        this.kList.add(k);
    }
}
