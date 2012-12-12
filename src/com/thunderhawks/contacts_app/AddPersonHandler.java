package com.thunderhawks.contacts_app;

import java.util.HashMap;

public class AddPersonHandler implements Handler{
	
	public void handleIt(HashMap<String, String> parameters) {
		// Add contact to contacts HashMap using parameters passed in, by method of ContactsModel class
		ContactsModel.theContactsModel.addPerson(parameters);
	}

}