/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.Code;

import database.JDBCBaseDAO;
import database.Code.CodeDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import pojo.Code;

/**
 *
 * @author Bauer
 */
@ManagedBean
@SessionScoped
public class CodeDAOJDBC extends JDBCBaseDAO<Code> implements CodeDAO{

    public CodeDAOJDBC(String tablename, String id) {
        super("Code", "abnr");
    }

    @Override
    protected Code getPojoFromResultSet(ResultSet result) throws SQLException {
        Code ret= new Code(Integer.parseInt(result.getString("abnr")), Integer.parseInt(result.getString("code")),Timestamp.valueOf(result.getString("timesStamp")));
        return ret;
    }

    @Override
    protected PreparedStatement getUpdateStatement(Code t, Connection conn) throws SQLException {
        PreparedStatement ps= conn.prepareStatement("Update Code set code = ? , timeStamp =? where abNr=? ");
        ps.setInt(1, t.getCode());
        ps.setTimestamp(2, t.getTimeStamp());
        ps.setInt(3, t.getAbNr());
        return ps;
    }

    @Override
    protected PreparedStatement getInsertStatement(Code t, Connection conn) throws SQLException {
        PreparedStatement ps= conn.prepareStatement("Insert into Code values ?,?,?");
        ps.setInt(1, t.getAbNr());
        ps.setInt(2, t.getCode());
        ps.setTimestamp(3, t.getTimeStamp());
        return ps;
    }

    @Override
    protected PreparedStatement getDeleteStatement(Code t, Connection conn) throws SQLException {
        PreparedStatement ps= conn.prepareStatement("Delete from Code where abnr=?");
        ps.setInt(1, t.getAbNr());
        return ps;
    }
}
