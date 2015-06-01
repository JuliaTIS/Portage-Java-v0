package princetonPlainsboro;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.AttributedCharacterIterator;

class Test {

    public static void main(String[] args) throws PrinterException {
  /*   LectureXML test = new LectureXML("dossiers.xml");
        DossierMedical dm = test.getDossier();
        dm.afficher();

        System.out.println("\n********\n");
*/
        Patient p1 = new Patient("De vil", "Cruella", "214097855130917", "Rue des pommiers");
/*        System.out.println("> cout de " + p1.toString() + " : " + dm.coutPatient(p1));

        System.out.println("\n********\n");

        String spe = "Cardiologue";
        System.out.println("> cout de la specialite '" + spe + "' : " + dm.coutSpecialite(spe));

        System.out.println("\n********\n");

        Medecin m1 = new Medecin("Deblouze", "Agathe", "Cardiologue", "06 76 54 34 23", "1234", "IDENTIFIANT 1");
        dm.afficherListePatients(m1);

        System.out.println("\n********\n");

        Date d1 = new Date(1, 11, 2005);
        Date d2 = new Date(5, 1, 2006);
        System.out.println("> nombre de fiches entre " + d1 + " et " + d2 + " : " + dm.nombreFichesIntervalle(d1, d2));

        System.out.println("\n********\n");

        System.out.println();
        System.out.println("Dossier trie selon les dates :");
        dm.trierDates();

        System.out.println("\n********\n");

        System.out.println();
        System.out.println("Dossier trie selon les couts :");
        dm.trier(new ComparaisonFichesCouts());

        p1.afficherPersonne();
        m1.afficherPersonne();

        dm.afficherMedecins();
        dm.afficherPatients();
        dm.afficherListePatients(m1);

        System.out.println("\n Fiches de soin entre" + d1.toString() + " et " + d2.toString());

        dm.afficherFichesEntreDate(d1, d2);

        EcritureXML ecr = new EcritureXML(dm);
        ecr.setXML();

        Medecin med = new Medecin("Alice", "Rainaut", "Codeuse pro", "tel", "mdp", "id");
        Date d = new Date(12, 12, 12);

        Secretaire sec = new Secretaire("Super", "Secretaire", "identifiant top secret", "mot de passe encore plus seceret");
        Patient pat = new Patient("leonardo", "di caprio", "secu 2", "las vegas cityyyyyy");
        FicheDeSoins fds = new FicheDeSoins(pat, med, d);
        fds = dm.getFiches().get(0);

       Impression imp= new Impression() ;
       imp.imprimer(dm);
       

            fds.afficher();

        /* DossierMedical dm1= new DossierMedical();
        dm1.ajouterFiche(fds);
        EcritureXML ecri= new EcritureXML(dm1);
        ecri.setXML();
       // OK pour que la base de donn�es XML soit gener�e a partir d'un dossier medical =) 
      // par contre on a toujours un probleme pour stocker les secretaire... Dans un autre fichier XML ? 
        
        */
        
        
        }

    }

