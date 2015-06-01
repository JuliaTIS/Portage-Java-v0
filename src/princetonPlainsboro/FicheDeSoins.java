package princetonPlainsboro;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.util.Vector;
/**
 * Classe permettant de cr�er et acc�der aux fiches de soin
 * @author DULAC Julia, MUSCIO Cassandra, RAINAUT Jennifer, TREBOSSEN Lucie
 */
public class FicheDeSoins extends Impression implements Printable  {

    private Patient patient;
    private Medecin medecin;
    private Date date;
    private Vector<Acte> actes;       // contient des objets de classe 'Acte'

    /**
     * Constructeur de la classe FicheDeSoins
     * @param patient
     * @param medecin
     * @param date 
     */
    public FicheDeSoins(Patient patient, Medecin medecin, Date date) {
        this.patient = patient;
        this.medecin = medecin;
        this.date = date;
        actes = new Vector<Acte>();   // liste vide
    }

    /**
     * M�thode qui retourne le patient d'une fiche de soin
     * @return Retourne le patient de la fiche
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * M�thode qui retourne le m�decin affect� � la fiche de soin
     * @return Retourne le m�decin de la fiche
     */
    public Medecin getMedecin() {
        return medecin;
    }

    /**
     * M�thode qui retourne la date d'une fiche de soin
     * @return Retourne la date � laquelle a �t� cr��e la fiche
     */
    public Date getDate() {
        return date;
    }

    /**
     * M�thode permettant d'ajouter un acte � une fiche de soins
     * @param acte Acte � ajouter � la fiche de soins
     */
    public void ajouterActe(Acte acte) {
        getActes().add(acte);
    }

    /**
     * M�thode permettant d'ajouter un acte qui n'a pas encore �t� cr�� � la fiche de soin
     * @param code Code de l'acte cr��
     * @param coefficient Coefficient de l'act� cr��
     */
    public void ajouterActe(Code code, int coefficient) {
        Acte acte = new Acte(code, coefficient);
        getActes().add(acte);
    }

    /**
     * M�thode permettant l'affichage d'une fiche de soins
     */
    public void afficher() {
        System.out.println("Fiche de soins du " + date.toString() + "\n" + "- medecin : "
                + medecin.toString() + "\n" + "- patient : " + patient.toString() + "\n" + "- actes medicaux : \n");

        for (int i = 0; i < getActes().size(); i++) {
            Acte a = getActes().get(i);
            System.out.println(a.toString());
        }
    }

    /**
     * M�thode passant une fiche de soins en cha�ne de caract�res
     * @return Retourne une cha�ne de carat�res correspondant � la fiche de soins
     */
    public String toString() {
        String s = "Fiche de soins du " + date.toString() + "\n" + "- medecin : "
                + medecin.toString() + "\n" + "- patient : " + patient.toString() + "\n" + "- actes medicaux : \n";
        for (int i = 0; i < getActes().size(); i++) {
            Acte a = getActes().get(i);
            s = s + a.toString();
        }
        for (int i=0; i<4 ; i++)
        {
        s=s+"\n";
                }
        return s;

    }

    /**
     * M�thode retournant le co�t total de la fiche de soins
     * @return Retourne un double repr�sentant le total de la fiche de soins
     */
    public double coutTotal() {
        double total = 0;
        for (int i = 0; i < getActes().size(); i++) {
            Acte a = getActes().get(i);
            total += a.cout();
        }
        return total;
    }

    /**
     * M�thode retournant les actes d'une fiche de soins
     * @return Retourne les actes
     */
    public Vector<Acte> getActes() {
        return actes;
    }

    /**
     * M�thodes permettant de modifier les actes d'une fiches de soins
     * @param actes Les actes � mettre
     */
    public void setActes(Vector<Acte> actes) {
        this.actes = actes;

    }

    /**
     * M�thode permettant d'imprimer une fiche de soins
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
                
                /* On �crit une ligne de titre en rouge, en gras de taille 18 */
                graphics.setFont(new Font("Cambria", Font.BOLD, 18));
                graphics.setColor(Color.BLUE);
                graphics.drawString("Fiche de Soin de \n " + this.getPatient().getNom().toString() + " " + this.getPatient().getPrenom().toString(), x + marge, y + marge);

                /* On �crit une ligne en noir de taille 14 */
          /* On �crit une ligne en noir de taille 14 */
                graphics.setFont(new Font("Cambria", Font.PLAIN, 14));
                graphics.setColor(Color.BLACK);
                drawString(graphics, this.toString(), x + marge, y + marge + 90);

                retValue = Printable.PAGE_EXISTS;
            }
        }
        return retValue;
    }
}
