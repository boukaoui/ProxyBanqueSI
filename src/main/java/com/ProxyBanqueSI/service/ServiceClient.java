package com.ProxyBanqueSI.service;

import com.ProxyBanqueSI.dao.Clientdao;
import com.ProxyBanqueSI.domaine.Client;

public class ServiceClient {

	// declaration de DAO de client
	Clientdao clientdao = new Clientdao();

	public void addClient(Client client) {
	//	clientdao.addClient(client);
	}
	public void suppClient(Client client) {
		clientdao.suppClient(client);
	}
	public void editClient(Client client) {
		clientdao.editClient(client);
	}
	public void viewClient(Client client) {
		clientdao.viewClient(client);
	}
	
	
}
