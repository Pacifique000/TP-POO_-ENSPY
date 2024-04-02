/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.Date;

/**
 *
 * @author erwan
 */
public class Agent extends Contact {
    int salaire;
    String statut;
    String catégorie;
    String indice_de_salaire;
    String occupation;

    public Agent(int salaire, String statut, String catégorie, String indice_de_salaire, String occupation, String code, String nom, Date date_de_naissance, String address, String email, String telNumber) {
        super(code, nom, date_de_naissance, address, email, telNumber);
        this.salaire = salaire;
        this.statut = statut;
        this.catégorie = catégorie;
        this.indice_de_salaire = indice_de_salaire;
        this.occupation = occupation;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getCatégorie() {
        return catégorie;
    }

    public void setCatégorie(String catégorie) {
        this.catégorie = catégorie;
    }

    public String getIndice_de_salaire() {
        return indice_de_salaire;
    }

    public void setIndice_de_salaire(String indice_de_salaire) {
        this.indice_de_salaire = indice_de_salaire;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    
}
