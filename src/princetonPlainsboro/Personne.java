/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princetonPlainsboro;

import java.awt.print.Printable;

/**
 * Classe abstraite Personne impl�mentant Printable
 *
 * @author DULAC Julia, MUSCIO Cassandra, RAINAUT Jennifer, TREBOSSEN Lucie
 */
public abstract class Personne extends Impression implements Printable {

    private String nom;
    private String prenom;

    /**
     * Constructeur de la classe Personne
     *
     * @param nom Nom de la Personne
     * @param prenom Pr�nom de la Personne
     */
    public Personne(String nom, String prenom) {
        this.prenom = prenom;
        this.nom = nom;

    }

    /**
     * M�thode permettant d'obtenir les informations d'un patient sous forme de
     * cha�ne de caract�res
     *
     * @return Retourne les informations de la personne sous forme de cha�ne de
     * caract�res
     */
    public String toString() {
        return this.nom + " " + this.prenom;

    }

    /**
     * M�thode permettant d'obtenir le nom d'une personne
     *
     * @return Retourne le nom d'une personne sous forme de cha�ne de caract�res
     */
    public String getNom() {
        return this.nom;

    }

    /**
     * M�thode permettant d'obtenir le pr�nom d'une personne
     *
     * @return Retourne le pr�nom d'une personne sous forme de cha�ne de
     * caract�res
     */
    public String getPrenom() {
        return this.prenom;

    }

    /**
     * M�thode permettant de d�finir le pr�nom d'une personne
     *
     * @param nom Pr�nom de la personne sous forme de cha�ne de caract�res
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;

    }

    /**
     * M�thode abstraite qui permettra d'afficher les caract�ristiques de la
     * personne au niveau de la console
     */
    public abstract void afficherPersonne();

    /**
     * M�thode permettant de d�finir le nom d'une personne
     *
     * @param nom Nom de la personne sous forme de cha�ne de caract�res
     */
    public void setNom(String nom) {
        this.nom = nom;

    }
}
