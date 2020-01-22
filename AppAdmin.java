package fr.awa.admin ;

public class AppAdmin {

	public static void main(String[] args) {
		
		Repas [] lesRepas = {
				new Repas( 501 , "Oriental" , 2 ) ,
				new Repas( 502 , "Asiatique" , 8 , true ) ,
				new Repas( 503 , "Turc" , 4 , true ) ,
				new Repas( 504 , "Oriental" , 2 ) ,
				new Repas( 505 , "Oriental" , 4 , true )
			} ;
		
		
		System.out.println( "\n\n--------[ Question 4.3.4 ]--------\n" ) ;
		visualiserRepas( lesRepas ) ;
		
		System.out.println( "\n\n--------[ Question 4.3.5 ]--------\n" ) ;
		visualiserSpecialiteRepas( lesRepas ) ;
		
		System.out.println( "\n\n--------[ Question 4.3.6 ]--------\n" ) ;
		visualiserSpecialiteRepasMaj( lesRepas ) ;
		
		System.out.println( "\n\n--------[ Question 4.3.7 ]--------\n" ) ;
		int nbRepasVegetariens = calculerNombreRepasVegetariens( lesRepas ) ;
		System.out.println( "Nombre de repas végétariens : " + nbRepasVegetariens ) ;
		
		System.out.println( "\n\n--------[ Question 4.3.8 ]--------\n" ) ;
		visualiserNbMaxCouverts( lesRepas ) ;
		
	}
	
	
	private static void visualiserRepas( Repas [] lesRepas ){
		// Question 4.3.4 : Votre code ici
	}
	
	
	private static void visualiserSpecialiteRepas( Repas [] lesRepas ){
		// Question 4.3.5 : Votre code ici
	}
	
	private static void visualiserSpecialiteRepasMaj( Repas [] lesRepas ){
		// Question 4.3.6 : Votre code ici
	}
	
	private static int calculerNombreRepasVegetariens( Repas [] lesRepas ){
		int nbRepasVegetariens = 0 ;
		
		// Question 4.3.7 : Votre code ici
		
		return nbRepasVegetariens ;
	}
	
	private static void visualiserNbMaxCouverts( Repas [] lesRepas ){
		// Question 4.3.8 : Votre code ici
	}

}
