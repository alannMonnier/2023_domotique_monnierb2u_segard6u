
public class Main {

	public static void main(String args[])
	{
		Telecommande t=new Telecommande();
		
		

		t.ajouterTelecommandable(new Lampe("Lampe1"));
		t.ajouterTelecommandable(new Lampe("Lampe2"));
		t.ajouterTelecommandable(new Hifi());
		t.ajouterTelecommandable(new TelecommandeChemine(new Cheminee()));
		t.ajouterTelecommandable(new TelecommandeChemine(new Cheminee()));


		TelecommandeGraphique tg = new TelecommandeGraphique(t);
		

		
	}
	
}
