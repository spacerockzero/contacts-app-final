package com.thunderhawks.contacts_app;

import java.util.HashMap;
import java.util.UUID;

public class ContactsModel {

	//Real local contacts HashMap, will always be used
	public HashMap<String, PersonBean> contacts = new HashMap<String, PersonBean>();
	
	public ContactsModel() {
		// TODO Auto-generated constructor stub
		
	}
			
	//Load the data into the local contacts HashMap
	public void loadData(){
				
	//Static test data to be used until the data model implementations have been implemented
		//Static PersonBeans
		PersonBean person1 = new PersonBean();
		person1.setFirstName("Steve");
		person1.setLastName("Steverson");
		person1.setPhoneNumber("555-555-0001");
		
		PersonBean person2 = new PersonBean();
		person1.setFirstName("Bjorn");
		person1.setLastName("Bjornssen");
		person1.setPhoneNumber("555-555-0002");
		
		PersonBean person3 = new PersonBean();
		person1.setFirstName("Hedwig");
		person1.setLastName("Svenson");
		person1.setPhoneNumber("555-555-0003");
		//End static PersonBeans
		
	//create UUID keys for static persons, then put them in the contacts HashMap
		//Get new UUID to be used as the key for the individual contact
		UUID uuid1 = UUID.randomUUID();
		//Stringify it
		String uuidString1 = uuid1.toString();
		//Put PersonBean into the local contacts HashMap
		contacts.put(uuidString1, person1);
		
		//Get new UUID to be used as the key for the individual contact
		UUID uuid2 = UUID.randomUUID();
		//Stringify it
		String uuidString2 = uuid2.toString();
		//Put PersonBean into the local contacts HashMap
		contacts.put(uuidString2, person2);
		
		//Get new UUID to be used as the key for the individual contact
		UUID uuid3 = UUID.randomUUID();
		//Stringify it
		String uuidString3 = uuid3.toString();
		//Put PersonBean into the local contacts HashMap
		contacts.put(uuidString3, person3);
	}

	
}
