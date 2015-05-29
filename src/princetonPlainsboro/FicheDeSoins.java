package princetonPlainsboro;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.util.Vector;

class FicheDeSoins implements Printable {
    private Patient patient;
    private Medecin medecin;
    private Date date;
    private Vector<Acte> actes;       // contient des objets de classe 'Acte'
    
    public FicheDeSoins(Patient patient, Medecin medecin, Date date) {
        this.patient = patient;
        this.medecin = medecin;
        this.date = date;
        actes = new Vector<Acte>();   // liste vide
        }
    
    public Patient getPatient() { return patient; }
    public Medecin getMedecin() { return medecin; }
    public Date    getDate()    { return date; }
    
    public void ajouterActe(Acte acte) {
        getActes().add(acte);
        }
    
    public void ajouterActe(Code code, int coefficient) {
        Acte acte = new Acte(code, coefficient);
        getActes().add(acte);
        }
    
    public void afficher() {
        System.out.println("Fiche de soins du " + date.toString() +"\n"+ "- medecin : " + 
                medecin.toString()+ "\n" + "- patient : " + patient.toString()  + "\n" + "- actes medicaux : \n"); 
          
            for (int i=0; i<getActes().size(); i++) {
            Acte a = getActes().get(i);
               System.out.println(a.toString());
            }
        }
    
    
    public String toString () 
    {
        String s = "Fiche de soins du " + date.toString() +"\n"+ "- medecin : " + 
                medecin.toString()+ "\n" + "- patient : " + patient.toString()  + "\n" + "- actes medicaux : \n"; 
        for (int i=0; i<getActes().size(); i++) {
            Acte a = getActes().get(i);
            s=s+ a.toString();
            }
                return s;
    
    }
    
    public double coutTotal() {
        double total = 0;
        for (int i=0; i<getActes().size(); i++) {
            Acte a = getActes().get(i);
            total += a.cout();
            }
        return total;
        }

    /**
     * @return the actes
     */
    public Vector<Acte> getActes() {
        return actes;
    }

    /**
     * @param actes the actes to set
     */
    public void setActes(Vector<Acte> actes) {
        this.actes = actes;
        
      
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

                /* On écrit une ligne de titre en rouge, en gras de taille 18 */
                graphics.setFont(new Font("Cambria", Font.BOLD, 18));
                graphics.setColor(Color.BLUE);
                graphics.drawString("Fiche de Soin de \n " + this.getPatient().getNom().toString() +" "+ this.getPatient().getPrenom().toString(), x + marge, y + marge );
                
                

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
    

