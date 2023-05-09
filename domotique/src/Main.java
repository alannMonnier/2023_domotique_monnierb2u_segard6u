
public class Main {

	public static void main(String args[])
	{
		Telecommande t=new Telecommande();
		
		

		t.ajouterTelecommandable(new Lampe("Lampe1"));
		t.ajouterTelecommandable(new Lampe("Lampe2"));
		t.ajouterTelecommandable(new Lampe("Lampe3"));
		t.ajouterTelecommandable(new Lampe("Lampe4"));
		t.ajouterTelecommandable(new Lampe("Lampe5"));


		TelecommandeGraphique tg = new TelecommandeGraphique(t);
		

		
	}
	
}
