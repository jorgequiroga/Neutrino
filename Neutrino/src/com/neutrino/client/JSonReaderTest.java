package com.neutrino.client;

import com.google.appengine.repackaged.org.json.JSONTokener;
import com.google.appengine.repackaged.org.json.JSONObject;

public class JSonReaderTest 
{

	    public static void main(String[] args) throws Exception {

	        String jsonTxt ="{'foo':'bar', 'coolness':2.0, 'altitude':39000, 'pilot':{'firstName':'Buzz','lastName':'Aldrin'}, 'mission':'apollo 11'}";
	        JSONTokener jst = new JSONTokener(jsonTxt);
	        
	        JSONObject json = new com.google.appengine.repackaged.org.json.JSONObject(jst);        
	        double coolness = json.getDouble( "coolness" );
	        int altitude = json.getInt( "altitude" );
	        JSONObject pilot = json.getJSONObject("pilot");
	        String firstName = pilot.getString("firstName");
	        String lastName = pilot.getString("lastName");
	        
	        System.out.println( "Coolness: " + coolness );
	        System.out.println( "Altitude: " + altitude );
	        System.out.println( "Pilot: " + firstName );
	        System.out.println( "Pilot: " + lastName );
	    }
	
}
