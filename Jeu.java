package fr.gns.admin ;

public class Jeu {

	private int numero ;
	private String nom ;
	private int nbJoueursMax ;
	private int nbRecommandations = 0 ;
	
	public Jeu( int numero , String nom , int nbJoueursMax ){
		super() ;
		this.numero = numero ;
		this.nom = nom ;
		this.nbJoueursMax = nbJoueursMax ;
	}

	public Jeu( int numero , String nom, int nbJoueursMax , int nbRecommandations ){
		super() ;
		this.numero = numero ;
		this.nom = nom ;
		this.nbJoueursMax = nbJoueursMax ;
		this.nbRecommandations = nbRecommandations ;
	}

	public int getNumero(){
		return numero;
	}

	public void setNumero( int numero ){
		this.numero = numero;
	}

	public String getNom(){
		return nom ;
	}

	public void setNom( String nom ) {
		this.nom = nom ;
	}

	public int getNbJoueursMax(){
		return nbJoueursMax ;
	}

	public void setNbJoueursMax( int nbJoueursMax ){
		this.nbJoueursMax = nbJoueursMax ;
	}

	public int getNbRecommandations(){
		return nbRecommandations;
	}

	public void setNbRecommandations( int nbRecommandations ){
		this.nbRecommandations = nbRecommandations;
	}

	public String toString() {
		return "Jeu [numero=" + numero + ", nom=" + nom
				+ ", nbJoueursMax=" + nbJoueursMax + ", nbRecommandations="
				+ nbRecommandations + "]";
	}
	
}
