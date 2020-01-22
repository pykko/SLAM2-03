package fr.awa.admin ;

public class Repas {

	private int numero ;
	private String specialite ;
	private int nbCouverts = 2 ;
	private boolean vegetarien = false ;
	
	public Repas( int numero , String specialite , int nbCouverts ){
		super() ;
		this.numero = numero ;
		this.specialite = specialite ;
		this.nbCouverts = nbCouverts ;
	}

	public Repas( int numero , String specialite , int nbCouverts , boolean vegetarien ){
		super() ;
		this.numero = numero ;
		this.specialite = specialite ;
		this.nbCouverts = nbCouverts ;
		this.vegetarien = vegetarien ;
	}

	public int getNumero(){
		return numero;
	}

	public void setNumero( int numero ){
		this.numero = numero;
	}

	public String getSpecialite(){
		return specialite ;
	}

	public void setSpecialite( String specialite ) {
		this.specialite = specialite ;
	}

	public int getNbCouverts(){
		return nbCouverts ;
	}

	public void setNbCouverts( int nbCouverts ){
		this.nbCouverts = nbCouverts ;
	}

	public boolean isVegetarien(){
		return vegetarien ;
	}

	public void setVegetarien( boolean vegetartien ){
		this.vegetarien = vegetarien;
	}

	public String toString() {
		return "Repas [numero=" + numero + ", specialite=" + specialite
				+ ", nbCouverts=" + nbCouverts + ", vegetarien="
				+ vegetarien + "]";
	}
	
}
