package entites;

public class Personne {
	public String nom;
	public String prenom;
	public AdressePostale addman;

	public Personne(String nom, String prenom){
		this.nom = nom;
		this.prenom =prenom;
		
	}
	public Personne(){
		
	}

	public Personne(String nom, String prenom, AdressePostale addman) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.addman = addman;
	}
	// to show the names
	public void afficher(){
	System.out.println(prenom+" "+nom.toUpperCase());	
	}
	
	// to modifier the name
	public void setnom(String nom)
	{
		this.nom =nom;
	}
	public String getnom()
	{
		return this.nom;
	}
	
	
	public void setprenom(String prenom)
	{
		this.prenom =prenom;
	}
	public String getprenom(){
		return this.prenom;
	}
	
	public void setaddress(AdressePostale addman)
	{
		this.addman =addman;
	}
	public AdressePostale getaddress()
	{
		return this.addman;
	}
}
