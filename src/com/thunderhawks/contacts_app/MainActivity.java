package com.thunderhawks.contacts_app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.thunderhawks.contacts_app.R;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.app.Activity;

public class MainActivity extends Activity {
	
	public static final String TAG = "ContactManager";
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
//        // Initialize the Application Controller
//        ApplicationController theApplicationController = new ApplicationController();
//        
//        // Load the default handlers into it
//        theApplicationController.loadCommands();
//        
//        // Load Data into the app's contacts HashMap
//        theApplicationController.handleRequest("loadData", null);
//        
//        // Update/Instantiate the contacts view
//        theApplicationController.handleRequest("updateContactsView", null);
        
        ListView lv= (ListView)findViewById(R.id.listview);

        // create the grid item mapping
        String[] from = new String[] {"rowid", "firstName", "lastName", "phoneNumber"};
        int[] to = new int[] { R.id.deleteCheckBox, R.id.firstName, R.id.lastName, R.id.phoneNumber };

        // prepare the list of all records
        List<HashMap<String, String>> fillMaps = new ArrayList<HashMap<String, String>>();
        for(int i = 0; i < 10; i++){
        	HashMap<String, String> map = new HashMap<String, String>();
        	map.put("rowid", "" + i);
        	map.put("firstName", "Sven_" + i);
        	map.put("lastName", "Bjornssen_" + i);
        	map.put("phoneNumber", "555-000" + i);
        	fillMaps.add(map);
        }

        // fill in the grid_item layout
        SimpleAdapter adapter = new SimpleAdapter(this, fillMaps, R.layout.row, from, to);
        lv.setAdapter(adapter);
        
    }

}
