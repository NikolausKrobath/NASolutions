/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.Absolvent;

import database.JDBCBaseDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import pojo.Absolvent;

/**
 *
 * @author Bauer
 */
@ManagedBean
@SessionScoped
public class AbsolventDAOJDBC extends JDBCBaseDAO<Absolvent> implements AbsolventDAO {

    public AbsolventDAOJDBC(String tablename, String id) {
        super("Absolvent", "abNr");
    }

    @Override
    protected Absolvent getPojoFromResultSet(ResultSet result) throws SQLException {
        Absolvent a = new Absolvent(
                Integer.parseInt(result.getString("abNr")),
                Integer.parseInt(result.getString("svNr")),
                result.getString("nachname"),
                result.getString("vorname"),
                result.getBoolean("geschlecht"),
                result.getString("eMail"),
                result.getString("telefonNr"),
                result.getString("firma"),
                result.getInt("ortID"),
                result.getString("straße"),
                result.getBoolean("newsletter"),
                result.getBoolean("jobangebot"),
                result.getBoolean("dataVeröffentlichen"),
                result.getInt("klassenID"),
                result.getString("eMailAlt"));
        return a;
    }

    @Override
    protected PreparedStatement getUpdateStatement(Absolvent t, Connection conn) throws SQLException {
       PreparedStatement ps= conn.prepareStatement("Update Absolvent set svNr = ? , nachname =?, vorname=?, geschlecht=?, eMail= ?, telefonNr= ?, firma= ?, ortID= ?, straße=?, newsletter= ?, jobangebot=?, dataVeröffentlichen=?, klassenID=?, eMailAlt=? where abNr=? ");
       ps.setInt(15, t.getAbNr());
        ps.setInt(1, t.getSvNr());
        ps.setString(2, t.getNachname());
        ps.setString(3, t.getVorname());
        ps.setBoolean(4, t.isGeschlecht());
        ps.setString(5, t.getEMail());
        ps.setString(6, t.getTelefonNr());
        ps.setString(7, t.getFirma());
        ps.setInt(8, t.getOrtID());
        ps.setString(9, t.getStraße());
        ps.setBoolean(10, t.isNewsletter());
        ps.setBoolean(11, t.isJobangebot());
        ps.setBoolean(12, t.isDatenVeröffentlichen());
        ps.setInt(13, t.getKlassenID());
        ps.setString(14, t.geteMailAlt());
       return ps;
    }

    @Override
    protected PreparedStatement getInsertStatement(Absolvent t, Connection conn) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("Insert into Absolvent values ? ,?, ?,?,?,?,?,?,?,?,?,?,?,?,? ");
        ps.setInt(1, t.getAbNr());
        ps.setInt(2, t.getSvNr());
        ps.setString(3, t.getNachname());
        ps.setString(4, t.getVorname());
        ps.setBoolean(5, t.isGeschlecht());
        ps.setString(6, t.getEMail());
        ps.setString(7, t.getTelefonNr());
        ps.setString(8, t.getFirma());
        ps.setInt(9, t.getOrtID());
        ps.setString(10, t.getStraße());
        ps.setBoolean(11, t.isNewsletter());
        ps.setBoolean(12, t.isJobangebot());
        ps.setBoolean(13, t.isDatenVeröffentlichen());
        ps.setInt(14, t.getKlassenID());
        ps.setString(15, t.geteMailAlt());
        return ps;
    }

    @Override
    protected PreparedStatement getDeleteStatement(Absolvent t, Connection conn) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("Delete from Absolvent where abNr=?");
        ps.setInt(1, t.getAbNr());
        return ps;
    }

}
