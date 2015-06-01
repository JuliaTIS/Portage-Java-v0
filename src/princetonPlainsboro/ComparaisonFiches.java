package princetonPlainsboro;
/**
 * interface contenant une m�thode abstraite permettant une comparaison entre deux fiches de soins
 * @author DULAC Julia, MUSCIO Cassandra, RAINAUT Jennifer, TREBOSSEN Lucie
 */
// cette interface permet de representer une comparaison entre deux FicheDeSoins
public interface ComparaisonFiches {
    // la fonction 'comparer' doit retourner :
    //    <0  si fiche1 < fiche2
    //     0  si fiche1 == fiche2
    //    >0  si fiche1 > fiche2
    /**
     * m�thode abstraite de comparaison entre deux fiches
     * @param fiche1
     * @param fiche2
     * @return retourne un int permettant de conna�tre le r�sultat de la comparaison
     * inf�rieur � 0 si fiche 2 sup�rieur � fiche 1
     * sup�rieur � 0 si fiche 1 sup�rieur � fiche 2
     * �gal � 0 si fiche 1 �gale � fiche 2
     */
    public int comparer(FicheDeSoins fiche1, FicheDeSoins fiche2);
}
