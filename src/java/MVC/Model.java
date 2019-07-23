/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.util.Arrays;

/**
 *
 * @author Mason
 */
public class Model {

    String getHobbies() {
        //create new user here so we can return their hobbies
        User user = new User();
        
        user.setUserName("Testing");
        user.setPassword("Testing1!");
        user.setUserID(50);
        user.setHobbies(Arrays.asList("programming", "gaming", "swimming", "soccer"));
        
        //get the hobbies into one string to send back
        String returnString = "Hobbies: ";
        int counter = 0;
        for(String hobby : user.getHobbies()){
            if(counter == 0){
                returnString = returnString + " " +  hobby;
            }
            else{
                returnString = returnString + ", " +  hobby;
            }
            counter++;
        }

        return returnString;

    }
    
}
