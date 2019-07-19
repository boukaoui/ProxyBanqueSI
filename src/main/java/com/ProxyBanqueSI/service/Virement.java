package com.ProxyBanqueSI.service;

import com.ProxyBanqueSI.domaine.CompteBancaire;

public class Virement {
	
	public void virement () {
	
		float X = 0 ;
		
		CompteBancaire comptebancaire1 = new CompteBancaire( ) ;
		CompteBancaire comptebancaire2 = new CompteBancaire( ) ;

		comptebancaire1.solde = comptebancaire1.solde - X ;
		comptebancaire2.solde = comptebancaire2.solde + X ;
		
	}
	
	
}