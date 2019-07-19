package com.ProxyBanqueSI.dao;
import java.util.ArrayList;
import java.util.Scanner;

import com.ProxyBanqueSI.domaine.Client;
import com.ProxyBanqueSI.domaine.Client.TypeClient;
import com.ProxyBanqueSI.domaine.Conseiller;

public class ServiceClientDao {
	
	
	public ArrayList<Client> listClient() {
		ArrayList<Client> listClient = new ArrayList<Client>();	
		
       String key= " ";
	listClient.add(new Client( "Youssef", "Boukaoui", "2Mars", 20300, "Casablanca", "0660534947", TypeClient.valueOf(key)));
       listClient.add(new Client( "mohamed", "bourkha", "maarif", 20300, "Rabat", "066056858",  TypeClient.valueOf(key)));
       listClient.add(new Client( "faouzi", "Oussama", "california", 20300, "Casablanca", "0660534947",  TypeClient.valueOf(key)));
       listClient.add(new Client( "Youssef", "Boukaoui", "2Mars", 20300, "Casablanca", "0660534947",  TypeClient.valueOf(key)));

		
		return listClient;
		
		
		
	}
	
	
	
	
	
	

	
	
	
	
	
	
}
