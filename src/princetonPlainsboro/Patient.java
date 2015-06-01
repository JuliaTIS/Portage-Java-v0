package princetonPlainsboro;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

/**
 * Classe Patient h�ritant de Personne (et des m�thodes de l'interface
 * Printable)
 *
 * @author DULAC Julia, MUSCIO Cassandra, RAINAUT Jennifer, TREBOSSEN Lucie
 */
public class Patient extends Personne {

    private String adresse;
    private String secu;

    /**
     * Constructeur de la classe Patient
     *
     * @param nom Nom du patient
     * @param prenom Pr�nom du patient
     * @param secu N� de s�curit� du patient
     * @param adresse Adresse du Patient
     */
    public Patient(String nom, String prenom, String secu, String adresse) {
        super(nom, prenom);
<<<<<<< HEAD
this.secu = secu;
this.adresse = adresse;      
      }
=======
        this.adresse = adresse;
        this.secu = secu;
>>>>>>> origin/master

    }
    /**
     * M�thode permettant d'obtenir l'adresse du patient sous forme de cha�ne de
     * caract�res
     *
     * @return Retourne l'adresse sous forme de cha�ne de caract�res
     */
    public String getAdresse() {
        return this.adresse;

    }

    /**
     * M�thode permettant d'obtenir le num�ro de s�cu du patient sous forme de
     * cha�ne de caract�res
     *
     * @return Retourne le num�ro de s�cu sous forme de cha�ne de caract�res
     */
    
    public String getSecu() {
        return this.secu;

    }

    /**
     * M�thode permettant de d�finir l'adresse du patient
     *
     * @param adresse Adresse en String � d�finir
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;

    }

    /**
     * M�thode permettant de d�finir le num�ro de s�cu du patient
     *
     * @param secu Cha�ne de caract�res qu'on d�finit pour le patient
     */
    public void setSecu(String secu) {
        if (testSecu(secu)) {
            this.secu = secu;
            System.out.println("num�ro ok");
        }
        else {
            System.out.println("num�ro pourri");
        }

    }

    /**
     * M�thode retournant les informations du patient sous forme de cha�ne de
     * caract�res
     *
     * @return Retourne les informations du m�decin
     */
    public String toString() {
        return this.getPrenom() + " " + this.getNom() + " \n"
                + " " + this.adresse + " \n" + this.secu;
    }

    /**
     * M�thode permettant d'afficher les informations concernant un patient au
     * niveau de la console
     */
    public void afficherPersonne() {
        System.out.println(this.toString());
    }

    /**
     * M�thode permettant de v�rifier si deux patients sont identiques
     *
     * @param o Pr�condition ; 'o' doit �tre une instance de la classe Patient
     * @return Retourne un bool�en true s'il s'agit du m�me patient false dans
     * le cas contraire
     */
    public boolean equals(Object o) {
        if (o instanceof Patient) {
            Patient p = (Patient) o;
            return this.getNom().equals(p.getNom()) && this.getPrenom().equals(p.getPrenom());
        } else {
            return false;
        }
    }

    /**
     * M�thode permettant de rester le num�ro de s�curit�
     *
     * @return Retourne un bool�en
     * @param secu reht true si le num�ro est valide false dans le cas contraire
     */
    public boolean testSecu(String secu) {
        boolean res = false;
        long num = Long.parseLong(secu);
        long complement = (num / 100) % 97;
        long cle = 97 - complement;
        if (num >= 100000000000000L && num <= 299999999999999L) {
            if (cle > 0 && cle < 98) {
                if (num / 10000000000L % 100 <= 12 && num / 10000000000L % 100 >= 01) {
                    res = true;

                }
            } else {
                res = false;
            }
        }
        return res;
    }

    /**
     * M�thode permettant d'imprimer les informations relatives � un patient
     *
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

                graphics.drawString("Fiche Patient \n ", x + marge, y + marge);

                /* On �crit une ligne en noir de taille 14 */
                graphics.setFont(new Font("Cambria", Font.PLAIN, 14));
                graphics.setColor(Color.BLACK);
                drawString(graphics, this.toString(), x + marge, y + marge + 20);

                retValue = Printable.PAGE_EXISTS;
            }
        }
        return retValue;
    }

}
