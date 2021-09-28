package com.razal.dao;

import com.razal.entities.Atachment;

import java.util.List;

public interface AtachmentDAO {

    public List<Atachment> getAtachments();
    public void createAtachment(Atachment atachment);
    public Atachment getAtachment(int id);
    public void updateAtachment(int id);
    public void deleteAtachment(int id);

}
