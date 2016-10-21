/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.Klassen;

import database.JDBCBaseDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pojo.Klasse;

/**
 *
 * @author Bauer
 */
public class KlassenDAOJDBC extends JDBCBaseDAO<Klasse> implements KlassenDAO {

    public KlassenDAOJDBC(String tablename, String id) {
        super("Klassen", "klassenID");
    }

    @Override
    protected Klasse getPojoFromResultSet(ResultSet result) throws SQLException {
        Klasse k = new Klasse(Integer.parseInt(result.getString("klassenID")), result.getString("bezeichnung"), result.getString("abschlussjahr"));
        return k;
    }

    @Override
    protected PreparedStatement getUpdateStatement(Klasse t, Connection conn) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("Update Klassen set bezeichnung = ? , abschlussjahr =? where klassenID=? ");
        ps.setString(1, t.getBezeichnung());
        ps.setString(2, t.getAbschlussjahr());
        ps.setInt(3, t.getKlassenID());
        return ps;
    }

    @Override
    protected PreparedStatement getInsertStatement(Klasse t, Connection conn) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("Insert into Klassen values ? ,?, ? ");
        ps.setString(2, t.getBezeichnung());
        ps.setString(3, t.getAbschlussjahr());
        ps.setInt(1, t.getKlassenID());
        return ps;
    }

    @Override
    protected PreparedStatement getDeleteStatement(Klasse t, Connection conn) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("Delete from Klassen where klassenID=?");
        ps.setInt(1, t.getKlassenID());
        return ps;
    }
}
