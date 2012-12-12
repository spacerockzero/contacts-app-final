package com.thunderhawks.contacts_app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import android.util.Log;

public class ContactsModel {
	
	public static ContactsModel theContactsModel;
	private static final String TAG = "ContactsModel";
	// Real local contacts HashMap, will always be used
	public HashMap<String, PersonBean> contacts = new HashMap<String, PersonBean>();
	private List<PersonBean> contactsList;
	
	public ContactsModel() {
		// TODO Auto-generated constructor stub
	}
	
	// Returns the contacts PersonBeans in a List, ready to use in a layout adapter or other.
	public List<PersonBean> getContactsList() {
		Log.v(TAG, "contactsList = " + contacts.values());
		contactsList = new ArrayList<PersonBean>(contacts.values());
		return contactsList;
	}
	
	// Adds PersonBean to contacts HashMap, using parameters HashMap as attributes.
	public void addPerson(HashMap<String,String> parameters){
		PersonBean aPerson = new PersonBean();
		String uuid = new String(parameters.get("uuid"));
		aPerson.setId(uuid);
		aPerson.setFirstName(parameters.get("firstName"));
		aPerson.setLastName(parameters.get("lastName"));
		aPerson.setPhoneNumber(parameters.get("phoneNumber"));
		contacts.put(uuid, aPerson);
	}
	
	// Removes PersonBean from contacts HashMap with UUID key of uuid from parameters HashMap passed in.
	public void deletePerson(HashMap<String,String> parameters){
		contacts.remove(parameters.get("uuid"));
	}
	
	// Load the data into the local contacts HashMap, 
	// Will later implement File I/O, servers/sockets, and hibernate into this method
	public void loadData(){		
	//Static test data to be used until the data model implementations have been implemented
		//Add Static PersonBeans to contacts HashMmap
		
		// Create HashMap to store parameters in to process consistently
		HashMap<String,String> parameters = new HashMap<String,String>();
		
		//Get new UUID to be used as the key for the individual contact
		UUID idUUID = UUID.randomUUID();
		parameters.put("id", idUUID.toString());
		parameters.put("firstName", "Steve");
		parameters.put("lastName", "Steverson");
		parameters.put("phoneNumber", "555-555-0001");
		addPerson(parameters);

		parameters.clear();
		//Get new UUID value to be used as the key for the individual contact
		idUUID = UUID.randomUUID();
		parameters.put("id", idUUID.toString());
		parameters.put("firstName", "Bjorn");
		parameters.put("lastName", "Bjornssen");
		parameters.put("phoneNumber", "555-555-0002");
		addPerson(parameters);
		
		parameters.clear();
		//Get new UUID value to be used as the key for the individual contact
		idUUID = UUID.randomUUID();
		parameters.put("id", idUUID.toString());
		parameters.put("firstName", "Hedwig");
		parameters.put("lastName", "Svenson");
		parameters.put("phoneNumber", "555-555-0003");
		addPerson(parameters);
		//End static PersonBeans
		
	}
	
}
