package com.thunderhawks.contacts_app;

import com.thunderhawks.contacts_app.R;

import android.os.Bundle;
import android.app.Activity;

public class MainActivity extends Activity {
	
	public static final String TAG = "ContactManager";
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        // Initialize the Application Controller
        ApplicationController theApplicationController = new ApplicationController();
        
        // Load the default handlers into it
        theApplicationController.loadCommands();
        
        // Load Data into the app's contacts HashMap
        theApplicationController.handleRequest("loadData", null);
        
        // Update/Instantiate the contacts view
        theApplicationController.handleRequest("updateContactsView", null);
        
    }

}
