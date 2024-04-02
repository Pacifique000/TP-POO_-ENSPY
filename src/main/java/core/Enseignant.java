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
public class Enseignant extends Contact {
    String statut;

    public Enseignant(String statut, String code, String nom, Date date_de_naissance, String address, String email, String telNumber) {
        super(code, nom, date_de_naissance, address, email, telNumber);
        this.statut = statut;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
    
}
