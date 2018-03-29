/**
 * Created by Ibada1731710 on 2018-03-26.
 */
public class Livre implements Comparable<Livre>{
    private String isbn;
    private String titre;
    private String sousTitre;
    private String auteur;
    private String maisonEdition;
    private int anneePublictaion;

    public Livre(String isbn, String titre, String sousTitre, String auteur, String maisonEdition, int anneePublictaion) {
        this.isbn = isbn;
        this.titre = titre;
        this.sousTitre = sousTitre;
        this.auteur = auteur;
        this.maisonEdition = maisonEdition;
        this.anneePublictaion = anneePublictaion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getSousTitre() {
        return sousTitre;
    }

    public void setSousTitre(String sousTitre) {
        this.sousTitre = sousTitre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getMaisonEdition() {
        return maisonEdition;
    }

    public void setMaisonEdition(String maisonEdition) {
        this.maisonEdition = maisonEdition;
    }

    public int getAnneePublictaion() {
        return anneePublictaion;
    }

    public void setAnneePublictaion(int anneePublictaion) {
        this.anneePublictaion = anneePublictaion;
    }


    @Override
    public int compareTo(Livre o) {
        return o.getAnneePublictaion()-anneePublictaion;
    }
    public void afficher(){
        System.out.println("-"+titre+", "+sousTitre+", "+auteur+", "+anneePublictaion+", "+maisonEdition+", "+isbn);
    }
}