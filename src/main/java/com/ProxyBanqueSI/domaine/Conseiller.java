package com.ProxyBanqueSI.domaine;

import java.util.ArrayList;

public class Conseiller extends Employe {
	
	private int nombre_client;
	public ArrayList<Client> listclient;


	
	//Employe constructors
		public Conseiller(int id, String nom, String prenom) {
		super(id, nom, prenom);
		// TODO Auto-generated constructor stub
	}


		// Getters and Setters
		public int getNombre_client() {
			return nombre_client;
		}



		public void setNombre_client(int nombre_client) {
			this.nombre_client = nombre_client;
		}

		// Constructors

		public Conseiller(int id, String nom, String prenom, int nombre_client) {
			super(id, nom, prenom);
			this.nombre_client = nombre_client;
		}

}
