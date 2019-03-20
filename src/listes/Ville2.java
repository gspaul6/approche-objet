package listes;

public class Ville2 {
	private String nom;
	private int nbdhabitants;

    public Ville2(String nom, int nbdhabitants)
    {
    	this.nom=nom;
    	this.nbdhabitants=nbdhabitants;
    	
    }
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbdhabitants() {
		return nbdhabitants;
	}

	public void setNbdhabitants(int nbdhabitants) {
		this.nbdhabitants = nbdhabitants;
	}

	public String toString()
	{
		return nom+" "+nbdhabitants; 
	}
}
