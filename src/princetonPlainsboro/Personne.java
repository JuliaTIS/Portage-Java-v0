/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princetonPlainsboro;

import java.awt.print.Printable;

/**
 *
 * @author DULAC Julia, MUSCIO Cassandra, RAINAUT Jennifer, TREBOSSEN Lucie
 */
public abstract class Personne implements Printable{

    private String nom;
    private String prenom;

    public Personne(String nom, String prenom) {
        this.prenom = prenom;
        this.nom = nom;

    }
    
    public String toString()
    {
     return this.nom + " " + this.prenom;
    
    }

    public String getNom() {
        return this.nom;

    }

    public String getPrenom() {
        return this.prenom;

    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;

    }

    public abstract void afficherPersonne();

    public void setNom(String nom) {
        this.nom = nom;

    }
}
