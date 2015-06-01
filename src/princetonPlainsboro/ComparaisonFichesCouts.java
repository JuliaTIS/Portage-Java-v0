package princetonPlainsboro;
/**
 * Classe permettant de comparer les co�ts de deux fiches de soins
 * @author DULAC Julia, MUSCIO Cassandra, RAINAUT Jennifer, TREBOSSEN Lucie
 */
public class ComparaisonFichesCouts implements ComparaisonFiches {
/**
 * impl�mentation de la m�thode abstraite "comparer" h�rit�e de l'interface ComparaisonFiches, ici appliqu�e � des co�ts
 * @param fiche1
 * @param fiche2
 * @return retourne un entier
 * sup�rieur � 0 si le co�t de la fiche 1 est sup�rieur � celui de la fiche 2
 * inf�rieure dans le o� le co�t de la fiche 2 est sup�rieur � celui de la fiche 1
 * �gal � 0 si les co�ts sont �gaux
 */
    @Override
    public int comparer(FicheDeSoins fiche1, FicheDeSoins fiche2) {
        Double c1 = new Double(fiche1.coutTotal());
        Double c2 = new Double(fiche2.coutTotal());
        return c1.compareTo(c2);
        }
    }
