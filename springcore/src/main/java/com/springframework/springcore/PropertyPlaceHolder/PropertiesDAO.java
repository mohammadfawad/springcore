/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springframework.springcore.PropertyPlaceHolder;

/**
 *
 * @author spring
 */
public class PropertiesDAO {
    private String dbServer;
    private String dbPort;
    private String dbUser;
    private String dbpass;

    public PropertiesDAO(String dbServer, String dbPort, String dbUser, String dbpass ){
        this.setDbServer(dbServer);
        this.setDbPort(dbPort);
        this.setDbUser(dbUser);
        this.setDbpass(dbpass);
        
    }
    @Override
    public String toString(){
    
        return " DBserver :: " + this.getDbServer() + " DBport :: " + this.getDbPort() + " DBuser :: " + this.getDbUser() + " DBpassword :: " + this.getDbpass();
    }
    /**
     * @return the dbServer
     */
    public String getDbServer() {
        return dbServer;
    }

    /**
     * @param dbServer the dbServer to set
     */
    public void setDbServer(String dbServer) {
        this.dbServer = dbServer;
    }

    /**
     * @return the dbPort
     */
    public String getDbPort() {
        return dbPort;
    }

    /**
     * @param dbPort the dbPort to set
     */
    public void setDbPort(String dbPort) {
        this.dbPort = dbPort;
    }

    /**
     * @return the dbUser
     */
    public String getDbUser() {
        return dbUser;
    }

    /**
     * @param dbUser the dbUser to set
     */
    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    /**
     * @return the dbpass
     */
    public String getDbpass() {
        return dbpass;
    }

    /**
     * @param dbpass the dbpass to set
     */
    public void setDbpass(String dbpass) {
        this.dbpass = dbpass;
    }
    
}
