/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princetonPlainsboro;

/**
 *
 * @author Cyril
 */
public class Secretaire extends Personne{

    private String identifiant;
    private String mdp;
    
    
    
    public Secretaire(String nom, String prenom, String identifiant, String mdp)
    {
        super(nom,prenom);
        this.identifiant=identifiant;
        this.mdp=mdp;
            
    
    }
    
    @Override
    public void afficherPersonne() {
        System.out.println(this.toString());    
    }
    
    public String toString()
    {
    return this.getNom() + " "+ this.getPrenom() + " \n ";
    }

    /**
     * @return the identifiant
     */
    public String getIdentifiant() {
        return identifiant;
    }

    /**
     * @param identifiant the identifiant to set
     */
    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    /**
     * @return the mdp
     */
    public String getMdp() {
        return mdp;
    }

    /**
     * @param mdp the mdp to set
     */
    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
    
    
}
