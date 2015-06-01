package princetonPlainsboro;
/**
 * Classe permettant de cr�er et �tudier une ou des dates de fiches de soins
 * @author DULAC Julia, MUSCIO Cassandra, RAINAUT Jennifer, TREBOSSEN Lucie
 */
public class Date implements Comparable {
    
    private int jour;
    private int mois;
    private int annee;
    
    /**
     * Constructeur de la classe Date, prend 3 param�tres
     * @param jour le jour de la date cr��e
     * @param mois le mois de la date cr��e
     * @param annee l'ann�e de la date cr��e
     */
    public Date(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
        }
    
    /**
     * M�thode d'affichage de la date dans la console
     * @return Retourne une cha�ne de caract�res affichant la date
     */
    public String toString() {
        return jour + "/" + mois + "/" + annee;
        }
    
    /**
     * M�thode permettant de savoir si deux dates sont identiques
     * @param o pr�condition ; 'o' est une instance de 'Date'
     * @return Retourne un bool�en
     * true si les deux dates sont identiques
     * false dans le cas contraire
     */
    public boolean equals(Object o) {
        if (o instanceof Date) {
            Date d = (Date)o;
            return (annee == d.annee) && (mois == d.mois) && (jour == d.jour);
            }
        else
            return false;
        }
    
    /**
     * M�thode permettant de conna�tre le laps de temps entre deux dates
     * @param o pr�condition ; 'o' est une instance de 'Date'
     * @return Retourne un entier repr�sentant la diff�rence de temps entre les deux dates, soit en ann�es, soit en mois, soit en jours
     */
    public int compareTo(Object o) {
        Date d = (Date)o;
        if (annee != d.annee)
            return annee - d.annee;
        // ici on a forcement annee == d.annee :
        if (mois != d.mois)
            return mois  - d.mois;
        // ici on a forcement annee == d.annee et mois == d.mois :
        return jour - d.jour;
        }
    
    }
