package com.thunderhawks.contacts_app;

import java.util.HashMap;

public class DeletePersonHandler implements Handler{
	
	public void handleIt(HashMap<String, String> parameters) {
		// Delete contact from contacts HashMap, 
		// using UUID from parameters passed in, by method of ContactsModel class
		ContactsModel.theContactsModel.addPerson(parameters);
	}

}