package com.thunderhawks.contacts_app;

import com.thunderhawks.contacts_app.R;

import android.app.Activity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.util.Log;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class UpdateContactsViewHandler implements Handler{
	
	private final Activity parent;
	
	// constructor
	public UpdateContactsViewHandler(Activity parent){
		this.parent = parent;
	}
	public void handleIt(HashMap<String, String> parameters) {
		
		Log.v("UpdateContactsViewHandler", "contactsList = ");
		
		ListView lv = (ListView)parent.findViewById(R.id.listview);

		// having issues getting theContactsModel instance in scope

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List contactList = new ArrayList(ContactsModel.theContactsModel.getContactsList());
	    
    	// create the grid item mapping
	    String[] from = new String[] {"delete", "firstName", "lastName", "phoneNumber"};
	    int[] to = new int[] { R.id.deleteCheckBox, R.id.firstName, R.id.lastName, R.id.phoneNumber };
	  
	    // Push previous items through adapter so it will match the listView (having issues with contactKeys type, it wants a list type from thekeys in our contacts HashMap)
	    // Still having a small issue with the type checking of contactList
		@SuppressWarnings("unchecked")
		SimpleAdapter adapter = new SimpleAdapter(parent, contactList, R.layout.row, from, to);
	    
	    // clear previous listView
	    lv.setAdapter(null);
	    
	    // Add the adapter to the listView
	    lv.setAdapter(adapter);
		
	}

}
