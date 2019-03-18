package essais;
import entites.AdressePostale;

public class TestAdressePostale {
	public static void main (String [] args){
		AdressePostale tim = new AdressePostale();
		tim.numeroRue= 26;
		tim.libelleRue= "rue de la bambee";
		 tim.codePostal= 33600 ;
		 tim.ville="Pessac" ;
		
				
		AdressePostale jim = new AdressePostale();
		jim.numeroRue= 52;
		jim.libelleRue= "rue de la Lionking";
		 jim.codePostal= 33300 ;
		 jim.ville="Merignac" ;
	}

}
