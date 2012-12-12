package com.thunderhawks.contacts_app;
import org.junit.Test;

import junit.framework.TestCase;


public class TestCases extends TestCase {
	
	
	
	protected void setUp() throws Exception {
		// Initialize the Application Controller
        ApplicationController theApplicationController = new ApplicationController();
        
        // Load the default handlers into it
        theApplicationController.loadCommands();
        
        // Load Data into the app's contacts HashMap
        theApplicationController.handleRequest("loadData", null);
		
		super.setUp();
	}

	@Test
    public void testAssertNotNull() {
        org.junit.Assert.assertNotNull("should not be null", ContactsModel.theContactsModel.contacts);
        org.junit.Assert.assertNotNull("should not be null", ContactsModel.theContactsModel.getContactsList());
        org.junit.Assert.assertNotNull("should not be null", ApplicationController.theApplicationController.handlerMap);
    }	
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}

}


