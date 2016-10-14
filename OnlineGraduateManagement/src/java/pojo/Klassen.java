/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author Bauer
 */
public class Klassen implements Identifiable{
    private int klassenID;
    private String bezeichnung; //4AHIF
    private String abschlussjahr; //2017

    public Klassen(int klassenID, String bezeichnung, String abschlussjahr) {
        this.klassenID = klassenID;
        this.bezeichnung = bezeichnung;
        this.abschlussjahr = abschlussjahr;
    }

    public int getKlassenID() {
        return klassenID;
    }

    public void setKlassenID(int klassenID) {
        this.klassenID = klassenID;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getAbschlussjahr() {
        return abschlussjahr;
    }

    public void setAbschlussjahr(String abschlussjahr) {
        this.abschlussjahr = abschlussjahr;
    }

    @Override
    public int getID() {
        return this.klassenID;
    }

    @Override
    public void setID(int id) {
        this.klassenID=id;
    }
    
    
}
