package com.thunderhawks.contacts_app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.app.Activity;
import android.os.Bundle;

public class UpdateContactsViewHandler implements Handler{
		
	public void handleIt(HashMap<String, Handler> parameters) {
		
//		ListView lv = (ListView)findViewById(R.id.listview);
//
//		// having issues getting theContactsModel instance in scope
//		List<String> contactKeys = new ArrayList<String>(theContactsModel.contacts.keySet());
//	    
//    	// create the grid item mapping
//	    String[] columns = new String[] {"delete", "firstName", "lastName", "phoneNumber"};
//	    int[] rowMap = new int[] { R.id.deleteCheckBox, R.id.firstName, R.id.lastName, R.id.phoneNumber };
//	  
//	    // Push previous items through adapter so it will match the listView (having issues with contactKeys type, it wants a list type from thekeys in our contacts HashMap)
//	    SimpleAdapter adapter = new SimpleAdapter(this, contactKeys, R.layout.row, columns, rowMap);
//	    
//	    // clear previous listView
//	    lv.setAdapter(null);
//	    
//	    // Add the adapter to the listView
//	    lv.setAdapter(adapter);
		
	}

}
