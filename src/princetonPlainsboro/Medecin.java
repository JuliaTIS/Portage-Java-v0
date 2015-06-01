package princetonPlainsboro;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

/**
 * Classe Medecin h�ritant de Personne (et des m�thodes de l'interface Printable)
 * @author DULAC Julia, MUSCIO Cassandra, RAINAUT Jennifer, TREBOSSEN Lucie
 */
public class Medecin extends Personne {

    private String specialite;
    private String tel;
    private String mdp;
    private String identifiant;

    /**
     * Constructeur de la classe Medecin, permet de cr�er un nouveau m�decin
     * avec un login et mot de passe
     *
     * @param nom Nom du m�decin
     * @param prenom Pr�nom du m�decin
     * @param specialite Sp�cialit� du m�decin
     * @param tel T�l�phone du m�decin
     * @param mdp Mot de passe du m�decin
     * @param identifiant Identifiant du m�decin
     */
    public Medecin(String nom, String prenom, String specialite, String tel, String mdp, String identifiant) {
        super(nom, prenom);
        this.specialite = specialite;
        this.mdp = mdp;
        this.tel = tel;
        this.identifiant = identifiant;
    }

    /**
     * M�thode permettant d'affiche les informations d'un m�decin sur la console
     */
    public void afficherPersonne() {
        System.out.println(this.toString());
    }

    /**
     * M�thohde permettant de r�cup�rer la sp�cialit� d'un m�decin
     *
     * @return Retourne la sp�cialit� sous forme de cha�ne de caract�res
     */
    public String getSpecialite() {
        return specialite;
    }

    /**
     * M�thode permettant de transformer les informations d'un m�decin en cha�ne
     * de caract�res
     *
     * @return Retourne une cha�ne de caract�res contenant les informations
     */
    public String toString() {
        return "Dr " + super.toString() + ", " + this.specialite + "\n" + ""
                + " Telephone : " + this.tel;
    }

    /**
     * M�thode permettant de savoir si deux m�decins sont les m�mes
     *
     * @param o Pr�condition : 'o' doit �tre une instance de la classe Medecin
     * @return Retourne un bool�en true s'il s'agit du m�me m�decin false dans
     * le cas contraire
     */
    public boolean equals(Object o) {
        if (o instanceof Medecin) {
            Medecin p = (Medecin) o;
            return this.getNom().equals(p.getNom()) && this.getPrenom().equals(p.getPrenom());
        } else {
            return false;
        }
    }

    /**
     * M�thode permettant de r�cup�rer le t�l�phone d'un m�decin
     *
     * @return Retourne le t�l�phone sous forme de cha�ne de caract�res
     */
    public String getTel() {
        return tel;
    }

    /**
     * M�thode permettant de d�finir le t�l�phone d'un m�decin
     *
     * @param tel T�l�phone que l'on d�finit pour le m�decin
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * M�thode permettant de r�cup�rer le mot de passe d'un m�decin
     *
     * @return Retourne le mot de passe sous forme de cha�ne de caract�res
     */
    public String getMdp() {
        return mdp;
    }

    /**
     * M�thode permettant de d�finir le mot de passe d'un m�decin
     *
     * @param mdp Mot de passe que l'on d�finit pour le m�decin
     */
    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    /**
     * M�thode permettant l'impression des informations concernant un m�decin
     *
     * @param graphics
     * @param pf
     * @param i
     * @return
     * @throws PrinterException
     */
    @Override
    public int print(Graphics graphics, PageFormat pf, int i) throws PrinterException {
        int retValue = Printable.NO_SUCH_PAGE;
        String newLine = System.getProperty("line.separator");
        switch (i) {
            case 0: {
                /* On d�finit une marge pour l'impression */
                int marge = 30;

                /* On r�cup�re les coordonn�es des bords de la page */
                int x = (int) pf.getImageableX();
                int y = (int) pf.getImageableY();
                int w = (int) pf.getImageableWidth();
                int h = (int) pf.getImageableHeight();

                /* On �crit une ligne de titre en rouge, en gras de taille 18 */
                graphics.setFont(new Font("Cambria", Font.BOLD, 18));
                graphics.setColor(Color.BLUE);
                graphics.drawString("Fiche M�decin ", x + marge, y + marge);

                /* On �crit une ligne en noir de taille 14 */
                graphics.setFont(new Font("Cambria", Font.PLAIN, 14));
                graphics.setColor(Color.BLACK);
                drawString(graphics, this.toString(), x + marge, y + marge + 90);

                retValue = Printable.PAGE_EXISTS;
            }
        }
        return retValue;
    }
   

    /**
     * M�thode permettant de r�cup�rer l'identifiant d'un m�decin
     *
     * @return Retourne l'identifiant sous forme de cha�ne de caract�res
     */
    public String getIdentifiant() {
        return identifiant;
    }

    /**
     * M�thode permettant de d�finir l'identifiant d'un m�decin
     *
     * @param tel Identifiant que l'on d�finit pour le m�decin
     */
    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

}
