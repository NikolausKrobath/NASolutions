/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import database.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import pojo.Identifiable;

/**
 *
 * @author Bauer
 */
public abstract class JDBCBaseDAO<T extends Identifiable> {

    protected abstract T getPojoFromResultSet(ResultSet result) throws SQLException;

    protected abstract PreparedStatement getUpdateStatement(T t, Connection conn) throws SQLException;

    protected abstract PreparedStatement getInsertStatement(T t, Connection conn) throws SQLException;
    protected abstract PreparedStatement getDeleteStatement(T t, Connection conn) throws SQLException;
    private final String TABLENAME;
    private final String PRIMARYID;

    public JDBCBaseDAO(String tablename, String id) {
        this.TABLENAME = tablename;
        this.PRIMARYID = id;
    }

    private Connection getConnection() {
        return ConnectionManager.getInst().getConn();
    }

    public String getTablename() {
        return this.TABLENAME;
    }

    public T select(int i) throws SQLException {
        T ret = null;
        try (Connection con = this.getConnection();
                PreparedStatement stmt = con.prepareStatement("select * from" + this.TABLENAME + " where " + PRIMARYID + " = " + i);
                ResultSet rs = stmt.executeQuery();){
            if (rs.next()) {
                ret = getPojoFromResultSet(rs);
            }
        }
        return ret;
    }

    public List<T> selectAll() throws SQLException {
        List<T> ret = new ArrayList<>();
        try (Connection con = this.getConnection();
                PreparedStatement stmt = con.prepareStatement("select * from " + TABLENAME);
                ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                ret.add(getPojoFromResultSet(rs));
            }
        }
        return ret;
    }

    public void update(T element) throws SQLException {
        try (Connection con = this.getConnection();
                PreparedStatement stmt = getUpdateStatement(element, con);) {
            stmt.execute();
        }
    }

    public void insert(T element) throws SQLException {
        try (Connection con = this.getConnection();
                PreparedStatement stmt = getInsertStatement(element,con);){
                stmt.execute();
        }
    }
    
    public void delete(T element) throws SQLException{
        try( Connection con= this.getConnection();
                PreparedStatement stmt= getDeleteStatement(element,con);){
            stmt.execute();
        }
    }
}
