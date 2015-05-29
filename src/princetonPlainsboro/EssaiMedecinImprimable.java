/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princetonPlainsboro;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.print.*;

/**
 *
 * @author Alice
 */
public class EssaiMedecinImprimable extends Personne implements Printable {

    
    private String specialite;
    private String tel;
    private String mdp;
    private String identifiant;
    

    public EssaiMedecinImprimable (String nom, String prenom, String specialite, String tel, String mdp, String identifiant) {
        super(nom, prenom);
        this.specialite = specialite;
        this.mdp = mdp;
        this.tel = tel;
        this.identifiant=identifiant;
    }
    
    @Override
    public int print(Graphics graphics, PageFormat pf, int i) throws PrinterException {
        int retValue = Printable.NO_SUCH_PAGE;
        switch(i){
            case 0 : {
               /* On d�finit une marge pour l'impression */
		int marge=30;

		/* On r�cup�re les coordonn�es des bords de la page */
		int x = (int)pf.getImageableX();
		int y = (int)pf.getImageableY();
		int w = (int)pf.getImageableWidth();
		int h = (int)pf.getImageableHeight();

		/* Dessin d'un cadre gris clair*/
		graphics.setColor(Color.LIGHT_GRAY);
		graphics.fillRect(x+10, y+10, w-20, h-20);

		/* On �crit une ligne de titre en rouge, en gras de taille 18 */
		graphics.setFont(new Font("Arial", Font.BOLD, 18));
		graphics.setColor(Color.RED);
		graphics.drawString("Fiche M�decin\n", x + marge, y+marge);

		/* On �crit une ligne en noir de taille 14 */
		graphics.setFont(new Font("Arial", Font.PLAIN, 14));
		graphics.setColor(Color.BLACK);
		graphics.drawString(this.toString(), x+marge, y+marge+20);

                retValue = Printable.PAGE_EXISTS;
            }
        }
        return retValue;
    }

    @Override
    public void afficherPersonne() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
