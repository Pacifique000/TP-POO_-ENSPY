package core;

import java.util.Date;

/*@author nanda
 */
public class Etudiant extends Contact{
    String Cycle;
    int Niveau;
    

    public Etudiant(String code, String nom, Date date_de_naissance, String address, String email, String telNumber, String cycle, int Niveau) {
        super(code, nom, date_de_naissance, address, email, telNumber);
        this.Niveau=Niveau;
        this.Cycle=cycle;
    }

    public String getCycle() {
        return Cycle;
    }

    public void setCycle(String Cycle) {
        this.Cycle = Cycle;
    }

    public int getNiveau() {
        return Niveau;
    }

    public void setNiveau(int Niveau) {
        this.Niveau = Niveau;
    }
}
