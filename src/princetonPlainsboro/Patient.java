package princetonPlainsboro;

 public class Patient extends Personne {

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
        return this.getPrenom() + " " + this.getNom() + "\n " + this.adresse + "\n" + this.secu;
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

}
