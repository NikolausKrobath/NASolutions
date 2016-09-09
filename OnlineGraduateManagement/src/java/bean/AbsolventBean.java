/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import database.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpSession;
import pojo.Absolvent;
import pojo.Klassen;

/**
 *
 * @author Bauer
 */
@ManagedBean
public class AbsolventBean {
    private Absolvent absolvent;
    private List<Absolvent> absolventList;

    public AbsolventBean() {
        absolvent = new Absolvent();
        FacesContext context = FacesContext.getCurrentInstance();
        ExternalContext ec = context.getExternalContext();
        HttpSession sess = (HttpSession) ec.getSession(true);
        absolvent.setSvNr((int) sess.getAttribute("SVNR"));
    }

    public List<Absolvent> getAbsolventList() {
        return absolventList;
    }

    public void setAbsolventList(List<Absolvent> absolventList) {
        this.absolventList = absolventList;
    }

    public Absolvent getAbsolvent() {
        return absolvent;
    }

    public void setAbsolvent(Absolvent ab) {
        this.absolvent = ab;
    }
}
