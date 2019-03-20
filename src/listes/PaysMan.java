package listes;

public class PaysMan {
	private String nom;
	private int nbdhabitants;
	private double pib;
	public PaysMan(String nom,int nbdhabitants,double pib)
	{
		this.nom=nom;
		this.nbdhabitants=nbdhabitants;
		this.pib=pib;
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
	public double getPib() {
		return pib;
	}
	public void setPib(double pib) {
		this.pib = pib;
	}
	
	public String toString()
	{
		return nom+" "+nbdhabitants+" "+pib; 
	}
}
