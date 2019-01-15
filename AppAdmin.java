package fr.gns.admin ;

public class AppAdmin {

	public static void main(String[] args) {
		
		Jeu [] lesJeux = {
				new Jeu( 501 , "13 Jours" , 2 ) ,
				new Jeu( 502 , "Cogit" , 8 , 15 ) ,
				new Jeu( 503 , "Just One" , 4 ) ,
				new Jeu( 504 , "Jarnac" , 2 , 22 ) ,
				new Jeu( 505 , "Solitaire" , 1 , 3 )
			} ;
		
		
		System.out.println( "\n\n--------[ Question 4.3.4 ]--------\n" ) ;
		visualiserJeux( lesJeux ) ;
		
		System.out.println( "\n\n--------[ Question 4.3.5 ]--------\n" ) ;
		visualiserNomsJeux( lesJeux ) ;
		
		System.out.println( "\n\n--------[ Question 4.3.6 ]--------\n" ) ;
		visualiserNomsJeuxMaj( lesJeux ) ;
		
		System.out.println( "\n\n--------[ Question 4.3.7 ]--------\n" ) ;
		int nbJeuxRecommandes = calculerNombreJeuxRecommandes( lesJeux ) ;
		System.out.println( "Nombre de jeux recommandés : " + nbJeuxRecommandes ) ;
		
		System.out.println( "\n\n--------[ Question 4.3.8 ]--------\n" ) ;
		visualiserJeuLePlusRecommande( lesJeux ) ;
		
	}
	
	
	private static void visualiserJeux( Jeu [] lesJeux ){
		// Question 4.3.4 : Votre code ici
	}
	
	
	private static void visualiserNomsJeux( Jeu [] lesJeux ){
		// Question 4.3.5 : Votre code ici
	}
	
	private static void visualiserNomsJeuxMaj( Jeu [] lesJeux ){
		// Question 4.3.6 : Votre code ici
	}
	
	private static int calculerNombreJeuxRecommandes( Jeu [] lesJeux ){
		int nbJeux = 0 ;
		
		// Question 4.3.7 : Votre code ici
		
		return nbJeux ;
	}
	
	private static void visualiserJeuLePlusRecommande( Jeu [] lesJeux ){
		// Question 4.3.8 : Votre code ici
	}

}
