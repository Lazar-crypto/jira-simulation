package com.razal.dao;

import com.razal.db.DatabaseConnection;
import com.razal.entities.Atachment;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class AtachmentDAOImpl implements AtachmentDAO{

    @Override
    public List<Atachment> getAtachments() {
        return null;
    }

    @Override
    public void createAtachment(Atachment atachment) {

    }

    @Override
    public Atachment getAtachment(int id) {

        Atachment atachment = new Atachment();

        try {
            Statement statementQuerryRead = DatabaseConnection.getConnection().createStatement();
            System.out.println("Connection to: database established..");
            String queryRead = "select * from atachment";
            ResultSet getDbAtachment = statementQuerryRead.executeQuery(queryRead);

            while(getDbAtachment.next()){
                if(getDbAtachment.getInt("atachmentid") == id){
                    atachment.setAtachmentid(id);
                    atachment.setName(getDbAtachment.getString("name"));
                    atachment.setPath(getDbAtachment.getString("path"));
                    atachment.setFilename(getDbAtachment.getString("filename"));
                    atachment.setExtension(getDbAtachment.getString("extension"));
                    atachment.setUploaded(getDbAtachment.getString("uploaded"));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return atachment.getAtachmentid() != 0 ? atachment : null;
    }

    @Override
    public void updateAtachment(int id) {

    }

    @Override
    public void deleteAtachment(int id) {

    }
}
