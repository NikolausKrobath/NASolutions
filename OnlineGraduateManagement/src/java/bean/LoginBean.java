/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.HashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import org.primefaces.context.RequestContext;

/**
 *
 * @author Bauer
 */
@ManagedBean
@SessionScoped
public class LoginBean {

    private int svNr;
    private int autoCode; //generierter Code
    private int code; //Usereingabe

    public LoginBean(){
        
    }
    public String login() {
        FacesContext context = FacesContext.getCurrentInstance();
        ExternalContext ec = context.getExternalContext();//SVNR in absolventen Bean weiterleiten
        HttpSession sess = (HttpSession) ec.getSession(true);
        sess.setAttribute("SVNR", svNr);
        if (svNr == 333333333 && autoCode == code) {
            return new String("adminsuccess");
        }
        if (svNr == 123456789 && autoCode == code) {
            return new String("success");
        }
        return null;
    }

    public int getSvNr() {
        return svNr;
    }

    public void setSvNr(int svNr) {
        this.svNr = svNr;
    }

    public int getCode() {
        return code;
    }

    public int getAutoCode() {
        return autoCode;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void generateCode() {
        //prüfen auf die 15 minuten
        autoCode = (int) (Math.random() * 10000000);
        System.out.println(autoCode);
    }
    
    public void showMessage(){
        System.out.println("Hallo");
        Map<String,Object> options = new HashMap<String, Object>();
        options.put("modal", true);
        RequestContext.getCurrentInstance().openDialog("Sozialversicherungsnummer",options, null);
    }
    
    
}
