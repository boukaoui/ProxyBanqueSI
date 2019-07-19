package com.ProxyBanqueSI.domaine;

import java.util.concurrent.atomic.AtomicInteger;

public class Client {
	  	
		private static AtomicInteger count = new AtomicInteger(0); 
		private int id ;
		private String nom;
		private String prenom;
		private String adresse;
		private int code_postal;
		private String ville;
		private String num_tel;
		private TypeClient type;
		
	// Declaration enumeration	
		public enum TypeClient {
			  PARTICULIER,
			  ENTREPRISE;
			 
			}
		
	// Getters and Setters
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getPrenom() {
			return prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		public String getAdresse() {
			return adresse;
		}

		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}

		public int getCode_postal() {
			return code_postal;
		}

		public void setCode_postal(int code_postal) {
			this.code_postal = code_postal;
		}

		public String getVille() {
			return ville;
		}

		public void setVille(String ville) {
			this.ville = ville;
		}

		public String getNum_tel() {
			return num_tel;
		}

		public void setNum_tel(String num_tel) {
			this.num_tel = num_tel;
		}

		public TypeClient getType() {
			return type;
		}

		public void setType(TypeClient type) {
			this.type = type;
		}

		public static AtomicInteger getCount() {
			return count;
		}
	
	// constructors

		public Client( String nom, String prenom, String adresse, int code_postal, String ville, String num_tel,
				TypeClient type) {
			super();
			this.id = count.incrementAndGet();
			this.nom = nom;
			this.prenom = prenom;
			this.adresse = adresse;
			this.code_postal = code_postal;
			this.ville = ville;
			this.num_tel = num_tel;
			this.type = type;
		}
	 // ToString Methode

		@Override
		public String toString() {
			return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse
					+ ", code_postal=" + code_postal + ", ville=" + ville + ", num_tel=" + num_tel + ", type=" + type
					+ "]";
		}
 
		
		

	
		
	
		
}
