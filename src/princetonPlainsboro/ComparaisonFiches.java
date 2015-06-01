package princetonPlainsboro;
/**
 * interface contenant une méthode abstraite permettant une comparaison entre deux fiches de soins
 * @author DULAC Julia, MUSCIO Cassandra, RAINAUT Jennifer, TREBOSSEN Lucie
 */
// cette interface permet de representer une comparaison entre deux FicheDeSoins
public interface ComparaisonFiches {
    /* Méthode abstraite de comparaison entre deux fiches
    * @param fiche1
    * @param fiche2
    * @return un inter permettant de connaître le résultat de la comparaison
    *    <0  si fiche1 < fiche2
    *     0  si fiche1 == fiche2
    *    >0  si fiche1 > fiche2
    */
    public int comparer(FicheDeSoins fiche1, FicheDeSoins fiche2);
}
