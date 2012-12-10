package com.thunderhawks.contacts_app;

import java.util.HashMap;

public class LoadDataHandler implements Handler{
	
	//Instantiate new ContactsModel
    ContactsModel theContactsModel = new ContactsModel();
	
	public void handleIt(HashMap<String, Handler> parameters) {
		
        //LoadData from Data Storage (static for now)
		theContactsModel.loadData();
	}

}
