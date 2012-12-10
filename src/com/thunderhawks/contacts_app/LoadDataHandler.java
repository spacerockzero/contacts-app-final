package com.thunderhawks.contacts_app;

import java.util.HashMap;

public class LoadDataHandler implements Handler{
	
	public void handleIt(HashMap<String, Handler> parameters) {
		
		//Instantiate new ContactsModel
	    ContactsModel theContactsModel = new ContactsModel();
        
	    //LoadData from Data Storage (static for now)
		theContactsModel.loadData();
		
	}

}
