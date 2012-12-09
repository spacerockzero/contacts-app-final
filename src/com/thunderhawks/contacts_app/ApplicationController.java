package com.thunderhawks.contacts_app;

import java.util.HashMap;

public class ApplicationController {
	
	HashMap<String, Handler> handlerMap = new HashMap<String, Handler>();
	
	public ApplicationController() {
		
	}
	
	
	public void handleRequest(String command, HashMap<String, Handler> parameters){
		handlerMap.get(command).handleIt(parameters);
	}
	
	public void initializeHandler(String command, Handler aHandler){
		handlerMap.put(command, aHandler);
	}
	
	public void loadCommands(){
		String command = "loadData";
		Handler handler = new LoadDataHandler();
		initializeHandler(command, handler);
		
		command = "addPerson";
		handler = new AddPersonHandler();
		initializeHandler(command, handler);
		
		command = "deletePerson";
		handler = new DeletePersonHandler();
		initializeHandler(command, handler);
	}
	
}