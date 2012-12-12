package com.thunderhawks.contacts_app;

import java.util.HashMap;

public class LoadDataHandler implements Handler{
	
	public void handleIt(HashMap<String, String> parameters) {
		
	    //LoadData from Data Storage (static for now)
		ContactsModel.theContactsModel.loadData();
		
	}

}
