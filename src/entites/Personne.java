package entites;

public class Personne {
	public String nom;
	public String prénom;
	public AdressePostale addman;

	public Personne(String nom, String prénom){
		this.nom = nom;
		this.prénom =prénom;
		
	}

	public Personne(String nom, String prénom, AdressePostale addman) {
		super();
		this.nom = nom;
		this.prénom = prénom;
		this.addman = addman;
	}
}
