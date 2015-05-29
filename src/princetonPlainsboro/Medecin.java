package princetonPlainsboro;

import java.awt.print.Printable;

class Medecin extends Personne {

    private String specialite;
    private String tel;
    private String mdp;
    private String identifiant;
    

    public Medecin(String nom, String prenom, String specialite, String tel, String mdp, String identifiant) {
        super(nom, prenom);
        this.specialite = specialite;
        this.mdp = mdp;
        this.tel = tel;
        this.identifiant=identifiant;
    }

    public void afficherPersonne() {
        System.out.println(this.toString());
    }

    public String getSpecialite() {
        return specialite;
    }

    public String toString() {
        return "Dr " + this.getPrenom() + " " + this.getNom() + ", " + this.specialite + " tel : " + this.tel;
    }

    public boolean equals(Object o) {
        if (o instanceof Medecin) {
            Medecin p = (Medecin) o;
            return this.getNom().equals(p.getNom()) && this.getPrenom().equals(p.getPrenom());
        } else {
            return false;
        }
    }

    /**
     * @return the tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * @return the mdp
     */
    public String getMdp() {
        return mdp;
    }

    /**
     * @param mdp the mdp to set
     */
    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
}
