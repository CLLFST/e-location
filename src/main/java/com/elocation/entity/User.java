package com.elocation.entity;

public class User {

    private int id;
    private String username;
    private String adressemail;
    private String password;
    private String prenom;
    private String nom;

    public User(int id, String username, String adressemail, String password, String prenom, String nom) {
        this.id = id;
        this.username = username;
        this.adressemail = adressemail;
        this.password = password;
        this.prenom = prenom;
        this.nom = nom;
    }

    public void setId(int id) {

        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAdressemail(String adressemail) {
        this.adressemail = adressemail;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {

        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getAdressemail() {
        return adressemail;
    }

    public String getPassword() {
        return password;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }
}
