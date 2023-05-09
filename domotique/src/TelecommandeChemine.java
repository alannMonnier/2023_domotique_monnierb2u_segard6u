import java.util.ArrayList;

public class TelecommandeChemine implements Telecommandable {
    private ArrayList<Cheminee> cheminees;
    private Cheminee c;

    public TelecommandeChemine(Cheminee c1){
        this.c = c1;
    }

    public Cheminee getChemnee(){
        return this.c;
    }

    @Override
    public void allumer() {
        
    }

    @Override
    public void eteindre() {

    }
}
