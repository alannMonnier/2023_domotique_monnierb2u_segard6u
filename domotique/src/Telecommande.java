import java.util.ArrayList;

/**
 * Classe qui represente une telecommande qui peut allumer des lampes et monter le son
 */
public class Telecommande {

    /**
     * Déclarations des attriubts
     */
    private ArrayList<Telecommandable> telecommandables;

    /**
     * Constructeur de la classe Telecommande qui intialise les listes contenant les lampes qu'elle peut contrôler et les chaines hifi
     */
    public Telecommande(){
        this.telecommandables = new ArrayList<>();
    }

    /**
     * Méthode qui va ajouter une lampe dans la liste de lampes
     * @param t représente un objet télécommandable
     */
    public void ajouterTelecommandable(Telecommandable t){
        this.telecommandables.add(t);
    }

    /**
     * Méthode qui va allumer une lampe en la récupérant dans la liste à l'indice donné
     * @param indiceTelecommandable indice pour récupérer un objet télécommandable
     */
    public void allumer(int indiceTelecommandable){
        this.telecommandables.get(indiceTelecommandable).allumer();
    }



    /**
     * Méthode qui va éteindre la lampe récupérée dans la liste grâce à l'indice donné
     * @param indiceTelecommandable indice pour récupérer un objet télécommandable
     */
    public void eteindre(int indiceTelecommandable){
        this.telecommandables.get(indiceTelecommandable).eteindre();
    }

    public void activerTout(){
        for(int i=0; i<this.telecommandables.size(); i++){
            this.telecommandables.get(i).allumer();
        }
    }



    /**
     * Méthode qui retourne le descriptif de la télécommande
     * @return une chaine représentant le descriptif de la télécommande
     */
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("Télécommande controle ces lampes:");
        for (Telecommandable t: this.telecommandables){
            s.append(t.toString());
        }
        return s.toString();
    }
}
