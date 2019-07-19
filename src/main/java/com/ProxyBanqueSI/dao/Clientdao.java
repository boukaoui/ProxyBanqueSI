package com.ProxyBanqueSI.dao;

import java.util.ArrayList;
import java.util.Scanner;

import com.ProxyBanqueSI.domaine.Client;
import com.ProxyBanqueSI.domaine.Conseiller;
import com.ProxyBanqueSI.domaine.Client.TypeClient;

public class Clientdao {
	
	ArrayList<Client> listclient = new ArrayList<Client>();
	
public void addClient (Conseiller conseiller) {
	Scanner scanner =new Scanner(System.in);
	if (conseiller.listclient.size() < 10) {
		int id = Client.getCount().incrementAndGet();
		System.out.println("Veuillez saisir le nom:");
		String nom = scanner.nextLine();
		System.out.println("Veuillez saisir le prenom:");
		String prenom = scanner.nextLine();
		System.out.println("Veuillez saisir l'adresse:");
		String adresse = scanner.nextLine();
		System.out.println("Veuillez saisir le code postal:");
		int code_postal = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Veuillez saisir la ville:");
		String ville = scanner.nextLine();
		System.out.println("Veuillez saisir le numero de tel:");
		int num_tel = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Veuillez choisir le type:");
	//	TypeClient t1 = TypeClient.(scanner);
	//	System.out.println(t1); 
		
		//listclient.add(new Client());
	  }
	}
public void suppClient (Client client) {


}
public void editClient (Client client) {


}
public void viewClient (Client client) {


}

}
