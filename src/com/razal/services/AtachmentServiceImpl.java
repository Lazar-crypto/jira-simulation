package com.razal.services;

import com.razal.dao.AtachmentDAO;
import com.razal.dao.AtachmentDAOImpl;
import com.razal.entities.Atachment;

import java.util.List;

public class AtachmentServiceImpl implements AtachmentService{

    private AtachmentDAO atachmentDAO;

    public AtachmentServiceImpl() {
        atachmentDAO = new AtachmentDAOImpl();
    }


    @Override
    public List<Atachment> getAtachments() {
        return null;
    }

    @Override
    public void createAtachment(Atachment atachment) {

    }

    @Override
    public Atachment getAtachment(int id) {
        return atachmentDAO.getAtachment(id);
    }

    @Override
    public void updateAtachment(int id) {

    }

    @Override
    public void deleteAtachment(int id) {

    }
}
