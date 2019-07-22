/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URLHTTP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class URLHTTP {

    public static void main(String[] args){

        try {
            URLHTTP http = new URLHTTP();

            System.out.println("Test 1 - Get http from google.com");
            http.getURL("http://www.google.com");
            
            //this site doesn't exist so should throw an error
            System.out.println("Test 2 - Get http from xyzdemosite.com");
            http.getURL("http://www.xyzdemosite.com");
            
        } catch (Exception ex) {
            Logger.getLogger(URLHTTP.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void getURL(String url) {
        try{
            URL obj = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();

            int responseCode = connection.getResponseCode();
            if(responseCode != 200){
                return;
            }

            StringBuilder response;
        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()))) {
            String inputLine;
            response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
        }
            //print out the result
            System.out.println(response.toString());
        }
        catch(IOException e){
            Logger.getLogger(URLHTTP.class.getName()).log(Level.SEVERE, null, e);
        }

    }
    
}
