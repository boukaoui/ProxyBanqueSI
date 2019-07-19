package com.ProxyBanqueSI.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.ProxyBanqueSI.dao.ServiceClientDao;
import com.ProxyBanqueSI.domaine.Client;
import com.ProxyBanqueSI.domaine.Conseiller;
import com.ProxyBanqueSI.domaine.Client.TypeClient;

public class ServiceClient {
	
	
	
	
	public ArrayList<Client> listClient(ServiceClientDao serviceDao) {
		
		return serviceDao.listClient();
	}
	
	
	
	
	
	
	
	public void addClient(Conseiller Conseiller) {
		
		ArrayList<Client> listClient = new ArrayList<Client>();
		
		if(listClient.size() <= 10) {
		
			Scanner scan = new Scanner(System.in); 
			
			
			
			System.out.println("Veuillez entrer un nom :");
			String nom = scan.nextLine();
			
            
			System.out.println("Veuillez entrer un prénom :");
			String prenom = scan.nextLine();
			
            
			System.out.println("Veuillez entrer une adresse : ");
			String adresse = scan.nextLine();
			
			System.out.println("Veuillez entrer le Code Postal: ");
			int code_postal = scan.nextInt();
			
			System.out.println("Veuillez entrer la ville :");
			String ville = scan.nextLine();
			
			System.out.println("Veuillez entrer le Téléphone :");
			String num_tel  = scan.nextLine();
			
			System.out.println("Le client est-il un particulier ? :");
			String typeEnum = scan.nextLine();
			String key = "";
			if(typeEnum.equals("O")) 
				key = "PARTICULIER" ;
			
			else 
				key = "ENTREPRISE" ;
					
			Client nouveauClient = new Client( nom, prenom, adresse, code_postal, ville, num_tel, TypeClient.valueOf(key));
			listClient.add(nouveauClient);
			
			System.out.println(nouveauClient.getNom()+" "+nouveauClient.getPrenom()+" Vient d'etre rajouté ");
			
		} else {
			
			System.out.println("Vous ne pouvez pas ajouter un autre client Vous avez atteint le nombre maximal");
		}
		
	}
	
	
	
//	public void afficherClient(Conseiller monConseiller) {
//		
//		System.out.println("Veuillez selctionner le client que vous souhaitez afficher");
//		
//		ArrayList<Client> listClient = monConseiller.getListClient();
//		
//		for(int i = 0; i < listClient.size(); i++) {
//			
//			System.out.println(i + " " + listClient.get(i));
//			
//		}
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int selectionClient = sc.nextInt();
//		
//		if(selectionClient > listClient.size()) {
//			System.out.println("Ce nombre est invalide");
//		} else {
//			Client clientSel = listClient.get(selectionClient);
//			
//			System.out.println("Voici les informations du Client");
//
//			System.out.println(clientSel.infosClient());
//			System.out.println(clientSel.infosComptes());
//			
//		}
//		
//		
//			
//	}
//	
//	
//	public void modifierClient(Conseiller monConseiller) {
//		System.out.println("Veuillez selctionner le client que vous souhaitez modifier");
//		
//		ArrayList<Client> listClient = monConseiller.getListClient();
//		
//		for(int i = 0; i < listClient.size(); i++) {
//			
//			System.out.println(i + " " + listClient.get(i));
//			
//		}
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int selectionClient = Integer.parseInt(sc.nextLine());
//		
//		if(selectionClient > listClient.size()) {
//			System.out.println("Ce nombre est invalide");
//		} else {
//			Client clientSel = listClient.get(selectionClient);
//			System.out.println("Vous avez selectionner ce client " + clientSel);
//			
//			String reponse = "O";
//			
//			
//			do {
//				
//				System.out.println("Selectionner le champ que vous souhaitez modifier");
//				
//				
//				System.out.println( "0-Nom" + "\n" + "1-Prenom"+ "\n" +"2-Adresse"+ "\n"+ "3-CodePostal"+ "\n"+ "4-Ville" +"\n" +"5-Telephone");	
//				
//				int champSel = Integer.parseInt(sc.nextLine());
//				
//				switch(champSel) {
//					case 0 : 
//						System.out.println("Introduiser un nouveau nom");
//						String nom = sc.nextLine();
//						clientSel.setNom(nom);
//						break;
//					case 1 : 
//						System.out.println("Introduiser un nouveau prenom");
//						String prenom = sc.nextLine();
//						clientSel.setPrenom(prenom);
//						break;
//						
//					case 2 : 
//						System.out.println("Introduiser une nouvelle adresse");
//						String adresse = sc.nextLine();
//						clientSel.setAdresse(adresse);
//						break;
//					case 3 : 
//						System.out.println("Introduiser un nouveau code postal");
//						String codePostal = sc.nextLine();
//						clientSel.setCodePostale(codePostal);
//						break;
//					case 4 : 
//						System.out.println("Introduiser une nouvelle ville");
//						String ville = sc.nextLine();
//						clientSel.setVille(ville);
//						break;
//					case 5 : 
//						System.out.println("Introduiser un nouveau numero de telephone");
//						String telephone = sc.nextLine();
//						clientSel.setTelephone(telephone);
//						break;
//						
//					default: 
//						System.out.println("Vous avez entrer un numero invalide");
//						
//						
//				}
//			
//			
//				System.out.println("Vous voulez modifier un autre champ ? [O/N]");
//				reponse = sc.nextLine();
//				
//				
//			}while(reponse.equals("O"));
//			
//				
//				System.out.println("Des modification on été faites \n" + clientSel.infosClient() + "\n" + clientSel.infosComptes());
//				
//			
//		}
//		
//		
//		
//	
//		
//		
//		
//		
//	}
//	
//	
//	public void supprimerClient(Conseiller monConseiller) {
//		
//		
//		ArrayList<Client> listClient = monConseiller.getListClient();
//		
//		if(listClient.isEmpty()) {
//			System.out.println("Vous n'avez pas de client");
//		} else {
//			System.out.println("Veuillez selctionner le client que vous souhaitez supprimer :");
//			
//			
//			for(int i = 0; i < listClient.size(); i++) {
//				System.out.println(i + " " + listClient.get(i));
//			}
//			
//			Scanner sc = new Scanner(System.in);
//			
//			int selectionClient = sc.nextInt();
//			sc.nextLine();
//			
//			if(selectionClient > listClient.size()) {
//				System.out.println("Ce nombre est invalide");
//			} else {
//				Client clientSel = listClient.get(selectionClient);
//				System.out.println("Vous avez selectionner ce client " + clientSel);
//				System.out.println("Vous etes sur de vouloir le supprimer?  [O/N]");
//				String reponse = sc.nextLine();
//				
//				if(reponse.equals("O")) {
//					System.out.println("Le client " + clientSel + "vient d'etre supprimé");
//					listClient.remove(clientSel);
//				}
//				
//			}
//			
//			
//			
//		}
//		
	}
	
	
//}
