package essais;
import entites.Personne;
import entites.AdressePostale;
public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale firstadd = new AdressePostale();
		firstadd.numeroRue= 26;
		firstadd.libelleRue= "rue de la bambee";
		 firstadd.codePostal= 33600 ;
		 firstadd.ville="Pessac" ;
		
				
		AdressePostale secondadd = new AdressePostale();
		secondadd.numeroRue= 52;
		secondadd.libelleRue= "rue de la Lionking";
		 secondadd.codePostal= 33300 ;
		 secondadd.ville="Merignac" ;
		
Personne one = new Personne();
         one.nom = "Timbaland";
         one.prénom="Jack";
         one.addman=firstadd;
         
Personne two = new Personne();
two.nom = "Addidas";
two.prénom="Black";
two.addman=firstadd;


	}

}
