import java.util.Comparator;

/**
 * Created by Ibada1731710 on 2018-03-26.
 */
public class Comparer implements Comparator<Livre>{

    @Override
    public int compare(Livre o1, Livre o2) {
        int maisonEditionCompare = o1.getMaisonEdition().compareTo(o2.getMaisonEdition());
        if(maisonEditionCompare==0){
            int auteurCompare = o1.getAuteur().compareTo(o2.getAuteur());
            if(auteurCompare==0){
                int titreCompare = o1.getTitre().compareTo(o2.getTitre());
                if(titreCompare==0){
                    return o1.getAnneePublictaion()-o2.getAnneePublictaion();
                }
                return titreCompare;
            }
            return auteurCompare;
        }
        return maisonEditionCompare;
    }
}