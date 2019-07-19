package com.ProxyBanqueSI.presentation;

import java.util.HashMap;
import java.util.Scanner;

import com.ProxyBanqueSI.service.ServiceClient;

public class Application {

	public static void main(String[] args) {

		System.out.println("=======================Bienvenu sur votre application ProxyBanqueSI=======================");
		
		ServiceClient serviceclient = new ServiceClient() ;
		int choix1 =0;
		int choix2 =0;
		int choix3 =0;
		int choix4 =0;
	//HashMap<Integer, IControleur> controleurs = new HashMap();
		String valider="oui";
   
		// debut boucle 

		while(valider.equals("oui")) {
	
			System.out.println("=================Menu Principal=================");
			System.out.println("1- Gestion de client");
			System.out.println("2- Gestion de compte");
			System.out.println("3- Simulation de credit");
			System.out.println("Veillez choisir le type de traitement :");
			Scanner s=new Scanner(System.in);

			choix1 = s.nextInt() ;
	
		
	
	switch(choix1) {
	  case 1:
			System.out.println("=================Menu Gestion de client=================");
			System.out.println("1- Ajouter un client");
			System.out.println("2- Modifier un client");
			System.out.println("3- Voir les informations d'un client");
			System.out.println("4- Supprimer un client");

			System.out.println("Veillez choisir le type de traitement :");
			choix2 = s.nextInt() ;

						  switch(choix2) {
						  
						  case 1:
							  System.out.println("Ajouter un client");
							  
							   // serviceclient.addClient(client);
							    break;
						  case 2:
							  System.out.println("modifier un client");

							  //  serviceclient.editClient(client);
							    break;
						  case 3:
							//    serviceclient.suppClient(client);
							    break; 
						  case 4:
						///		    serviceclient.viewClient(client);
								    break;
			  
						  }
	    break;
	  case 2:
		  System.out.println("=================Menu Gestion de compte=================");
			System.out.println("1- Virement compte a compte");
			choix3 = s.nextInt() ;

					  switch(choix3) {

								  case 1:
									    //serviceclient.addClient(client);
									    break;
								  }
	    break;
	  case 3:
		  System.out.println("=================Menu Simulation de credit=================");
			System.out.println("1- Simulation d'un crédit consommation");
			System.out.println("2- Simulation d'un crédit immobilier ");


			System.out.println("Veillez choisir le type de traitement :");
			choix4 = s.nextInt() ;

					  switch(choix4) {
					  
					  case 1:
						    //serviceclient.addClient(client);
						    break;
					  case 2:
						    //serviceclient.addClient(client);
						    break;
					  }
		    break;
	  
	}

	System.out.println("vous voulez continuer ?oui/non");
	valider=s.next();
	
}

		}
	}



