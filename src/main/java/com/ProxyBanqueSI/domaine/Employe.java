package com.ProxyBanqueSI.domaine;

public class Employe {
	
	private int id;
	private String nom;
	private String prenom;
	
	
	
	/// Getters and Setters
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
	/// Constructors 
	/**
	 * @param id
	 * @param nom
	 * @param prenom
	 */
	public Employe(int id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	
	

}
