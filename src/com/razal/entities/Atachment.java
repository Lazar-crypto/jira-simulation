package com.razal.entities;

public class Atachment {

    private int atachmentid;
    private String name;
    private String path;
    private String filename;
    private String extension;
    private String uploaded;

    public Atachment() {

    }

    public int getAtachmentid() {
        return atachmentid;
    }

    public void setAtachmentid(int atachmentid) {
        this.atachmentid = atachmentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getUploaded() {
        return uploaded;
    }

    public void setUploaded(String uploaded) {
        this.uploaded = uploaded;
    }

    @Override
    public String toString() {
        return "Atachment{" +
                ", name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", filename='" + filename + '\'' +
                ", extension='" + extension + '\'' +
                ", uploaded='" + uploaded + '\'' +
                '}';
    }
}
