/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author Bauer
 */
public class Code implements Identifiable{
    private int abNr; //AbsolventenNummer
    private int code;
    private Timestamp timeStamp;

    public Code(int abNr, int code, Timestamp timeStamp) {
        this.abNr = abNr;
        this.code = code;
        this.timeStamp = timeStamp;
    }

    public int getAbNr() {
        return abNr;
    }

    public void setAbNr(int abNr) {
        this.abNr = abNr;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public int getID() {
        return abNr;
    }

    @Override
    public void setID(int id) {
        this.abNr=id;
    }
    
    
}
