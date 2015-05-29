package princetonPlainsboro;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

class Patient extends Personne {

    private String adresse;
    private String secu;

    public String getAdresse() {
        return this.adresse;

    }

    public String getSecu() {
        return this.secu;

    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;

    }

    public void setSecu(String secu) {
        this.secu = secu;

    }

    public Patient(String nom, String prenom, String secu, String adresse) {
        super(nom, prenom);
        this.adresse = adresse;
        this.secu = secu;

    }

    public String toString() {
        return this.getPrenom() + " " + this.getNom() + " \n"
                + " " + this.adresse + " \n" + this.secu;
    }

    public void afficherPersonne() {
        System.out.println(this.toString());
    }

    public boolean equals(Object o) {
        if (o instanceof Patient) {
            Patient p = (Patient) o;
            return this.getNom().equals(p.getNom()) && this.getPrenom().equals(p.getPrenom());
        } else {
            return false;
        }
    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
         int retValue = Printable.NO_SUCH_PAGE;
        switch (pageIndex) {
            case 0: {
                /* On définit une marge pour l'impression */
                int marge = 30;

                /* On récupère les coordonnées des bords de la page */
                int x = (int) pageFormat.getImageableX();
                int y = (int) pageFormat.getImageableY();
                int w = (int) pageFormat.getImageableWidth();
                int h = (int) pageFormat.getImageableHeight();

                /* Dessin d'un cadre gris clair
                 graphics.setColor(Color.LIGHT_GRAY);
                 graphics.fillRect(x+10, y+10, w-20, h-20);*/

                /* On écrit une ligne de titre en rouge, en gras de taille 18 */
                graphics.setFont(new Font("Cambria", Font.BOLD, 18));
                graphics.setColor(Color.BLUE);
                graphics.drawString("Fiche Patient \n ", x + marge, y + marge );
                
                

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


