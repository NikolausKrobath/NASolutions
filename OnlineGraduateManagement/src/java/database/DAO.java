/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bauer
 */
public interface DAO<T> extends Serializable{
    public T select(int i) throws SQLException;
    public List<T> selectAll() throws SQLException;
    public void update(T element) throws SQLException;
    public void insert(T element) throws SQLException;
    public void delete(T element) throws SQLException;
}
