/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author Bauer
 */
public class ConnectionManager {
   private static final String DATASOURCE = "jdbc/database";
   private static ConnectionManager connMgrInst = null;
   private DataSource ds = null;

   public static synchronized ConnectionManager getInst() {
      if (connMgrInst == null) 
            connMgrInst = new ConnectionManager();
      
      return connMgrInst;
   }
   private ConnectionManager() {
      try {
         Context ctx;
         ctx = new javax.naming.InitialContext();
         ds = (DataSource) ctx.lookup("java:comp/env/" + DATASOURCE);
      } catch (NamingException ex) {
            //log.error("Error lookup:"java:comp/env/"+DATASOURCE, ex);
      }
   }

   public Connection getConn() {
      Connection retVal = null;
      try {
         retVal = ds.getConnection();  //get a connection from the pool
      } catch (SQLException ex) {
      
      }
      return retVal;
   }
} 
