/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author GHOSK
 */
public class Repertoire {
    private ArrayList<Contact> contacts;

    public Repertoire(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }
    
    public void ajoutContact(Contact pers){
        this.contacts.add(pers);
    }
    
    public void delContact(Contact pers){
        this.contacts.remove(pers);
    }
    
    public void rechercher_Contact(Contact pers){
        if(contacts.indexOf(pers) >= 0){
            System.out.println("Ce contact existe ");
            System.out.println("Son index est: "+ this.contacts.indexOf(pers));
        }else{
            System.out.println("Ce contact est inexistant");
        }
    }
    
    public void updateContact(Contact pers) throws ParseException{
        Scanner sc = new Scanner(System.in);
        Integer modify;
        System.out.println("Que voulez-vous modifier à propos de ce contact ?");
        System.out.println("Le code ? (0)");
        System.out.println("Le nom ? (1)");
        System.out.println("La date de naissance ? (2)");
        System.out.println("L'adresse ? (3)");
        System.out.println("L'email ? (4)");
        System.out.println("Le numéro de téléphone ? (5)");
        System.out.println("Le cycle ? (6)");
        System.out.println("Le niveau ? (7)");
        System.out.println("Le statut ? (8)");
        System.out.println("Le salaire ? (9)");
        System.out.println("La catégorie ? (10)");
        System.out.println("L'indice de salaire ? (11)");
        System.out.println("L'occupation ? (12)");

        modify = sc.nextInt();
        if (modify == 0){
            String change;
            System.out.println("Veuillez entrer le nouveau code");
            sc.nextLine();
            change = sc.nextLine();
            pers.setCode(change);
        }
        if (modify == 1) {
            String change;
            System.out.println("Veuillez entrer le nouveau nom");
            sc.nextLine();
            change = sc.nextLine();
            pers.setNom(change);
        }
        if (modify == 2) {
            String change;
            System.out.println("Veuillez entrer la nouvelle date de naissance au format (dd/MM/yyyy)");
            sc.nextLine();
            change = sc.nextLine();
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(change);
            pers.setDate_de_naissance(date);
        }
        if (modify == 3){
            String change;
            System.out.println("Veuillez entrer la nouvelle adresse");
            sc.nextLine();
            change = sc.nextLine();
            pers.setAddress(change);
        }
        if (modify == 4){
            String change;
            System.out.println("Veuillez entrer la nouvelle adresse email");
            sc.nextLine();
            change = sc.nextLine();
            pers.setEmail(change);
        }
        if (modify == 5){
            String change;
            System.out.println("Veuillez entrer le nouveau numéro de téléphone");
            sc.nextLine();
            change = sc.nextLine();
            pers.setTelNumber(change);
        }
        if (modify == 6){
            String change;
            System.out.println("Veuillez entrer le nouveau cycle");
            sc.nextLine();
            change = sc.nextLine();
            Etudiant e = (Etudiant)pers;
            e.setCycle(change);
        }
        if (modify == 7){
            int change;
            System.out.println("Veuillez entrer le nouveau niveau");
            sc.nextLine();
            change = sc.nextInt();
            Etudiant e = (Etudiant)pers;
            e.setNiveau(change);
        }
        if (modify == 8){
            String change;
            Integer choix;
            System.out.println("S'agit-il d'un enseignant(0) ou d'un agent(1) ?");
            choix = sc.nextInt();
            if (choix == 0){
                System.out.println("Veuillez entrer le nouveau statut");
                sc.nextLine();
                change = sc.nextLine();
                Enseignant e = (Enseignant)pers;
                e.setStatut(change);
            }else {
                System.out.println("Veuillez entrer le nouveau statut");
                sc.nextLine();
                change = sc.nextLine();
                Agent a = (Agent)pers;
                a.setStatut(change);
            }
        }
        if (modify == 9){
            Integer change;
            System.out.println("Veuillez entrer le nouveau salaire");
            Agent a = (Agent)pers;
            change = sc.nextInt();
            a.setSalaire(change);
        }
        if (modify == 10){
            String change;
            System.out.println("Veuillez entrer la nouvelle catégorie");
            Agent a = (Agent)pers;
            sc.nextLine();
            change = sc.nextLine();
            a.setCatégorie(change);
        }
        if (modify == 11){
            String change;
            System.out.println("Veuillez entrer le nouvel indice du salaire");
            Agent a = (Agent)pers;
            change = sc.nextLine();
            a.setIndice_de_salaire(change);
        }
        if (modify == 12){
            String change;
            System.out.println("Veuillez entrer la nouvelle occupation");
            Agent a = (Agent)pers;
            sc.nextLine();
            change = sc.nextLine();
            a.setOccupation(change);
        }
         
    }
    
    public void getContact(){
        for(int i = 0; i < this.contacts.size(); i++ ){
            System.out.println(this.contacts.get(i).getCode());
            System.out.println(this.contacts.get(i).getNom());
            System.out.println(this.contacts.get(i).getDate_de_naissance());
            System.out.println(this.contacts.get(i).getAddress());
            System.out.println(this.contacts.get(i).getEmail());
            System.out.println(this.contacts.get(i).getTelNumber());
            System.out.println("------------------------------------------------------------------");
        }
    }
    
    public String getContactWIn(){
        String result = "";
        for(int i = 0; i < this.contacts.size(); i++ ){
            String predicat = "Le contact de code "+ contacts.get(i).getCode() + "et de nom "+ contacts.get(i).getNom()+" est bien enregistré dans la base de données";
            result = result + predicat;
        }
        return result;
    }
}
