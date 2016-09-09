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
public class Absolvent implements Identifiable{
    private int abNr;
    private int svNr;
    private String nachname;
    private String vorname;
    private boolean geschlecht;
    private String EMail;
    private String telefonNr;
    private String firma;
    private int ortID;
    private String straße;
    private boolean newsletter;
    private boolean jobangebot;
    private boolean datenVeröffentlichen;
    private int klassenID;
    private String EMailAlt;

    public Absolvent(){
        
    }

    public String geteMailAlt() {
        return EMailAlt;
    }

    public void seteMailAlt(String eMailAlt) {
        this.EMailAlt = eMailAlt;
    }

    @Override
    public String toString() {
        return "Absolvent{" + "abNr=" + abNr + ", svNr=" + svNr + ", nachname=" + nachname + ", vorname=" + vorname + ", geschlecht=" + geschlecht + ", eMail=" + EMail + ", telefonNr=" + telefonNr + ", firma=" + firma + ", ortID=" + ortID + ", stra\u00dfe=" + straße + ", newsletter=" + newsletter + ", jobangebot=" + jobangebot + ", datenVer\u00f6ffentlichen=" + datenVeröffentlichen + ", klassenID=" + klassenID + '}';
    }
    public Absolvent(int abNr, int svNr, String nachname, String vorname, boolean geschlecht, String eMail, String telefonNr, String firma, int ortID, String straße, boolean newsletter, boolean jobangebot, boolean datenVeröffentlichen, int klassenID, String eMailAlt) {
        this.abNr = abNr;
        this.svNr = svNr;
        this.nachname = nachname;
        this.vorname = vorname;
        this.geschlecht = geschlecht;
        this.EMail = eMail;
        this.telefonNr = telefonNr;
        this.firma = firma;
        this.ortID = ortID;
        this.straße = straße;
        this.newsletter = newsletter;
        this.jobangebot = jobangebot;
        this.datenVeröffentlichen = datenVeröffentlichen;
        this.klassenID = klassenID;
        this.EMailAlt=eMailAlt;
    }

    public int getAbNr() {
        return abNr;
    }

    public void setAbNr(int abNr) {
        this.abNr = abNr;
    }

    public int getSvNr() {
        return svNr;
    }

    public void setSvNr(int svNr) {
        this.svNr = svNr;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public boolean isGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(boolean geschlecht) {
        this.geschlecht = geschlecht;
    }

    public String getEMail() {
        return EMail;
    }

    public void setEMail(String eMail) {
        this.EMail = eMail;
    }

    public String getTelefonNr() {
        return telefonNr;
    }

    public void setTelefonNr(String telefonNr) {
        this.telefonNr = telefonNr;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public int getOrtID() {
        return ortID;
    }

    public void setOrtID(int ortID) {
        this.ortID = ortID;
    }

    public String getStraße() {
        return straße;
    }

    public void setStraße(String straße) {
        this.straße = straße;
    }

    public boolean isNewsletter() {
        return newsletter;
    }

    public void setNewsletter(boolean newsletter) {
        this.newsletter = newsletter;
    }

    public boolean isJobangebot() {
        return jobangebot;
    }

    public void setJobangebot(boolean jobangebot) {
        this.jobangebot = jobangebot;
    }

    public boolean isDatenVeröffentlichen() {
        return datenVeröffentlichen;
    }

    public void setDatenVeröffentlichen(boolean datenVeröffentlichen) {
        this.datenVeröffentlichen = datenVeröffentlichen;
    }

    public int getKlassenID() {
        return klassenID;
    }

    public void setKlassenID(int klassenID) {
        this.klassenID = klassenID;
    }

    @Override
    public int getID() {
        return this.abNr;
    }

    @Override
    public void setID(int id) {
        this.abNr=id;
    }
}
