package princetonPlainsboro;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

public class Medecin extends Personne {

    private String specialite;
    private String tel;
    private String mdp;
    private String identifiant;

    public Medecin(String nom, String prenom, String specialite, String tel, String mdp, String identifiant) {
        super(nom, prenom);
        this.specialite = specialite;
        this.mdp = mdp;
        this.tel = tel;
        this.identifiant = identifiant;
    }

    public void afficherPersonne() {
        System.out.println(this.toString());
    }

    public String getSpecialite() {
        return specialite;
    }

    public String toString() {
        return "Dr " + super.toString() + ", " + this.specialite + "\n" + ""
                + " Telephone : " + this.tel;
    }

    public boolean equals(Object o) {
        if (o instanceof Medecin) {
            Medecin p = (Medecin) o;
            return this.getNom().equals(p.getNom()) && this.getPrenom().equals(p.getPrenom());
        } else {
            return false;
        }
    }

    /**
     * @return the tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(String tel) {
        this.tel = tel;
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

    @Override
    public int print(Graphics graphics, PageFormat pf, int i) throws PrinterException {
        int retValue = Printable.NO_SUCH_PAGE;
        switch (i) {
            case 0: {
                /* On définit une marge pour l'impression */
                int marge = 30;

                /* On récupère les coordonnées des bords de la page */
                int x = (int) pf.getImageableX();
                int y = (int) pf.getImageableY();
                int w = (int) pf.getImageableWidth();
                int h = (int) pf.getImageableHeight();

                /* Dessin d'un cadre gris clair
                 graphics.setColor(Color.LIGHT_GRAY);
                 graphics.fillRect(x+10, y+10, w-20, h-20);*/

                /* On écrit une ligne de titre en rouge, en gras de taille 18 */
                graphics.setFont(new Font("Cambria", Font.BOLD, 18));
                graphics.setColor(Color.BLUE);
                graphics.drawString("Fiche Médecin\n \n \n \n \n ", x + marge, y + marge );
                
                

                /* On écrit une ligne en noir de taille 14 */
                graphics.setFont(new Font("Cambria", Font.PLAIN, 14));
                graphics.setColor(Color.BLACK);
                graphics.drawString(this.toString(), x + marge, y + marge + 20);

                retValue = Printable.PAGE_EXISTS;
            }
        }
        return retValue;
    }

}
