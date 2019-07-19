package com.ProxyBanqueSI.domaine;

import java.util.Date;

public class CompteBancaire {

		private int id;
		private int num_compte;
		public float solde;
		private Date date_ouverture;
		
	// Getters and Setters

		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getNum_compte() {
			return num_compte;
		}
		public void setNum_compte(int num_compte) {
			this.num_compte = num_compte;
		}
		public float getSolde() {
			return solde;
		}
		public void setSolde(float solde) {
			this.solde = solde;
		}
		public Date getDate_ouverture() {
			return date_ouverture;
		}
		public void setDate_ouverture(Date date_ouverture) {
			this.date_ouverture = date_ouverture;
		}
	// Constructors
		
		public CompteBancaire(int id, int num_compte, float solde, Date date_ouverture) {
			super();
			this.id = id;
			this.num_compte = num_compte;
			this.solde = solde;
			this.date_ouverture = date_ouverture;
		}
	public CompteBancaire() {
		super();
	}
	public CompteBancaire(float solde) {
		super();
		this.solde = solde;
	}
		
		
		
		
}
