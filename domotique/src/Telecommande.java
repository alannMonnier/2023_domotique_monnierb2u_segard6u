import java.util.ArrayList;

/**
 * Classe qui represente une telecommande qui peut allumer des lampes et monter le son
 */
public class Telecommande {

    /**
     * Déclarations des attriubts
     */
    private ArrayList<Lampe> lampes;
    private ArrayList<Hifi> hifis;

    /**
     * Constructeur de la classe Telecommande qui intialise les listes contenant les lampes qu'elle peut contrôler et les chaines hifi
     */
    public Telecommande(){
        this.lampes = new ArrayList<>();
        this.hifis = new ArrayList<>();
    }

    /**
     * Méthode qui retourne la liste des lampes
     * @return la liste des lampes
     */
    public ArrayList<Lampe> getLampes() {
        return lampes;
    }



    /**
     * Méthode qui retourne la liste des chaines hifi
     * @return la liste des chaines hifi
     */
    public ArrayList<Hifi> getHifis() {
        return hifis;
    }

    /**
     * Méthode qui va ajouter une lampe dans la liste de lampes
     * @param l représente une lampe
     */
    public void ajouterLampe(Lampe l){
        this.lampes.add(l);
    }


    /**
     * Méthode qui va ajouter une chaine hii dans la liste de chaine hifi
     * @param h représente une chaine hifi
     */
    public void ajouterHifi(Hifi h){
        this.hifis.add(h);
    }

    /**
     * Méthode qui va allumer une lampe en la récupérant dans la liste à l'indice donné
     * @param indiceLampe indice pour récupérer une lampe dans la liste
     */
    public void activerLampe(int indiceLampe){
        this.lampes.get(indiceLampe).allumer();
    }

    /**
     * Méthode qui va allumer une chaine hifi en la récupérant dans la liste à l'indice donné
     */
    public void activerHifi(int indiceHifi){
        this.hifis.get(indiceHifi).allumer();
    }


    /**
     * Méthode qui va éteindre la lampe récupérée dans la liste grâce à l'indice donné
     * @param indiceLampe indice pour récupérer une lampe dans la liste
     */
    public void desactiverLampe(int indiceLampe){
        this.lampes.get(indiceLampe).eteindre();
    }

    /**
     * Méthode qui va éteindre la chaien hifi récupérée dans la liste grâce à l'indice donné
     * @param indiceHifi indice pour récupérer une chaine hifi dans la liste
     */
    public void desactiverHifi(int indiceHifi){
        this.hifis.get(indiceHifi).eteindre();
    }

    /**
     * Méthode qui allume toutes les lampes de la liste et les chaines hifi de la liste
     */
    public void activerTout(){
        for(int i=0; i<this.lampes.size(); i++){
            this.activerLampe(i);
            this.activerHifi(i);
        }
    }



    /**
     * Méthode qui retourne le descriptif de la télécommande
     * @return une chaine représentant le descriptif de la télécommande
     */
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("Télécommande controle ces lampes:");
        for (Lampe l: this.lampes){
            s.append(l.toString());
        }
        for(Hifi h: this.hifis){
            s.append(h.toString());
        }
        return s.toString();
    }
}
