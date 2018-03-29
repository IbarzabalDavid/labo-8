import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

/**
 * Created by Ibada1731710 on 2018-03-26.
 */
public class Main {
    public static void main(String[] args) {
        TreeSet<Livre> tri1=new TreeSet<>();
        TreeSet<Livre> tri2=new TreeSet<>(new Comparer());
        ArrayList<Livre> tri3=new ArrayList<>();
        ArrayList<Livre> tri4=new ArrayList<>();
        ArrayList<Livre> tri5=new ArrayList<>();

        RemplirListe(tri1);
        RemplirListe(tri2);
        RemplirListe(tri3);
        RemplirListe(tri4);
        RemplirListe(tri5);

        Collections.sort(tri3);
        Collections.sort(tri4,new Comparer());
        algoPerso(tri5);

        //Affichage
        System.out.println("----------------------------------------");
        System.out.println("TreeSet par année");
        for (Livre livre : tri1){
            livre.afficher();
        }
        System.out.println("----------------------------------------");
        System.out.println("TreeSet avec la methode comparer");
        for (Livre livre : tri2){
            livre.afficher();
        }
        System.out.println("----------------------------------------");
        System.out.println("Trier par année");
        for (Livre livre : tri3){
            livre.afficher();
        }
        System.out.println("----------------------------------------");
        System.out.println("Trier avec la methode comparer");
        for (Livre livre : tri4){
            livre.afficher();
        }
        System.out.println("----------------------------------------");
        System.out.println("Trier avec algo personnel (par année)");
        for (Livre livre : tri5){
            livre.afficher();
        }


    }
    public static void RemplirListe(Collection<Livre> livre){
        livre.add(new Livre("123123","How to Git","altf4","Gélinas","BouBou",1999));
        livre.add(new Livre("53235434","HarryPotter","T4","Renaud","Michon",28));
        livre.add(new Livre("234234234","Ferme des animaux","cochon","Ibarzabal","BouBou",2016));
        livre.add(new Livre("23423423","MaxouPicsou","money","Gélinas","CharlesCompany",2000));
        livre.add(new Livre("34234","le Terre Bleu","eau","Pageau","Yessir",2018));
        livre.add(new Livre("234234","l'or","money","Carrier","BouBou",2017));
        livre.add(new Livre("45565","How to Git","addcommmitpush","Renaud","Ibarzpowpow",2016));
        livre.add(new Livre("12321324","123 go","parté","Renaud","Poulet",2008));
        livre.add(new Livre("56464","supprimer","altf4","Ibarzabal","Yessir",2002));
        livre.add(new Livre("123123","dieu","religion","Belley","Poulet",1999));
    }
    public static void algoPerso(ArrayList<Livre> livre){
        Livre temporaire=null;
        int x;
        for(int i=0;i<livre.size();i++){
            x=i;
            temporaire=livre.get(i);
            for(int j=i;j<livre.size();j++){
                if(temporaire.compareTo(livre.get(j))>0){
                    temporaire=livre.get(j);
                    x=j;
                }
            }
            livre.remove(x);
            livre.add(i,temporaire);
        }
    }
}
