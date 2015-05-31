package princetonPlainsboro;
/**
 * Classe permettant de comparer les dates de deux fiches de soins
 * @author DULAC Julia, MUSCIO Cassandra, RAINAUT Jennifer, TREBOSSEN Lucie
 */
public class ComparaisonFichesDates implements ComparaisonFiches {
   /**
 * impl�mentation de la m�thode abstraite "comparer" h�rit�e de l'interface ComparaisonFiches, ici appliqu�e � des dates
 * @param fiche1
 * @param fiche2
 * @return retourne un entier
 * sup�rieur � 0 si la date de la fiche 1 est sup�rieure � celle de la fiche 2
 * inf�rieure dans le o� la date de la fiche 2 est sup�rieure � celle de la fiche 1
 * �gal � 0 si les dates sont identiques
 */
    public int comparer(FicheDeSoins fiche1, FicheDeSoins fiche2) {
        return fiche1.getDate().compareTo(fiche2.getDate());
        }
    }
