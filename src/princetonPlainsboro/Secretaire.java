/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princetonPlainsboro;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

/**
 * Classe Secretaire d�finissant les m�thodes concernant un secr�taire m�dical
 * @author DULAC Julia, MUSCIO Cassandra, RAINAUT Jennifer, TREBOSSEN Lucie
 */
public class Secretaire extends Personne {

    private String identifiant;
    private String mdp;
    
    
    /**
     * Constructeur de la classe Secretaire
     * @param nom Nom du secr�taire
     * @param prenom Pr�nom du secr�taire
     * @param identifiant Identifiant du secr�taire
     * @param mdp Mot de passe du secr�taire
     */
    public Secretaire(String nom, String prenom, String identifiant, String mdp)
    {
        super(nom,prenom);
        this.identifiant=identifiant;
        this.mdp=mdp;
            
    
    }
    
    /**
     * M�thode h�rit� de la classe Personne permettant d'afficher les informations du secr�taire au niveau de la console
     */
    @Override
    public void afficherPersonne() {
        System.out.println(this.toString());    
    }

    /**
     * M�thode permettant d'obtenir les informations du secr�taire sous forme de cha�ne de caract�res
     * @return Retourne les informations du secr�taire sous forme de cha�ne de caract�res
     */
    public String toString()
    {
    return super.toString() + " \n ";
    }

    /**
     * M�thode permettant d'obtenir l'identifiant du secr�taire
     * @return Retourne l'identifiant de connexion du secr�taire sous forme de cha�ne de caract�res
     */
    public String getIdentifiant() {
        return identifiant;
    }

    /**
     * M�thode permettant de d�finir l'identifiant de connexion du secr�taire
     * @param identifiant Identifiant sous forme de cha�ne de caract�re que l'on d�finit pour le secr�taire
     */
    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    /**
     * M�thode permettant d'obtenir le mot de passe du secr�taire
     * @return Retourne le mot de passe du secr�taire sous forme de cha�ne de caract�res
     */
    public String getMdp() {
        return mdp;
    }

    /**
     * M�thode permettant de d�finir le mot de passe du secr�taire
     * @param mdp Mot de passe que l'on d�finit pour le secr�taire sous forme de cha�ne de caract�res
     */
    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    /**
     * M�thode permettant d'imprimer les informations relatives � un secr�taire m�dical
     * @param graphics
     * @param pageFormat
     * @param pageIndex
     * @return
     * @throws PrinterException 
     */
    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        int retValue = Printable.NO_SUCH_PAGE;
        switch (pageIndex) {
            case 0: {
                /* On d�finit une marge pour l'impression */
                int marge = 30;

                /* On r�cup�re les coordonn�es des bords de la page */
                int x = (int) pageFormat.getImageableX();
                int y = (int) pageFormat.getImageableY();
                int w = (int) pageFormat.getImageableWidth();
                int h = (int) pageFormat.getImageableHeight();

                /* Dessin d'un cadre gris clair
                 graphics.setColor(Color.LIGHT_GRAY);
                 graphics.fillRect(x+10, y+10, w-20, h-20);*/

                /* On �crit une ligne de titre en rouge, en gras de taille 18 */
                graphics.setFont(new Font("Cambria", Font.BOLD, 18));
                graphics.setColor(Color.BLUE);
                graphics.drawString("Fiche Secr�taire \n ", x + marge, y + marge );
                
                

                /* On �crit une ligne en noir de taille 14 */
                graphics.setFont(new Font("Cambria", Font.PLAIN, 14));
                graphics.setColor(Color.BLACK);
                graphics.drawString(this.toString(), x + marge, y + marge + 20);

                retValue = Printable.PAGE_EXISTS;
            }
        }
        return retValue;
    }

    }
    
    

