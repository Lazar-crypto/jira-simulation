package com.razal.services;

import com.razal.entities.Atachment;

import java.util.List;

public interface AtachmentService {

    public List<Atachment> getAtachments();
    public void createAtachment(Atachment atachment);
    public Atachment getAtachment(int id);
    public void updateAtachment(int id);
    public void deleteAtachment(int id);

}
