package com.razal;

import com.razal.dao.AtachmentDAO;
import com.razal.dao.AtachmentDAOImpl;
import com.razal.db.DatabaseConnection;
import com.razal.entities.Atachment;
import com.razal.services.AtachmentService;
import com.razal.services.AtachmentServiceImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) throws SQLException {

        AtachmentService atachmentService = new AtachmentServiceImpl();
        Atachment atachment = atachmentService.getAtachment(1);
        System.out.println(atachment.toString());

    }
}
