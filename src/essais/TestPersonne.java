package essais;
import entites.Personne;
import entites.AdressePostale;
public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale firstadd = new AdressePostale(26, "rue de la bambee",33600,"Pessac");
		
				
		AdressePostale secondadd = new AdressePostale(52, "rue de la Picnic", 33300,"Merignac");
		
		
Personne one = new Personne("Timbaland","Jack",firstadd);
                 
Personne two = new Personne("Addidas","Black",secondadd);


	}

}
