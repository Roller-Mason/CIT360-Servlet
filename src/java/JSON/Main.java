/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSON;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {

        try{
            //Object to Json
            Gson gson = new Gson();
            User user = createUserJson();
            String json = gson.toJson(user);
            System.out.println(json);

            //Json to Object, going to convert the json we just made back into the object
            User userObject = gson.fromJson(json, User.class);
            System.out.println("User username: " + userObject.getUserName());
            System.out.println("User password: " + userObject.getPassword());
            System.out.println("User userid: " + userObject.getUserID());
            System.out.println("User hobbies: " + userObject.getHobbies());
        } catch(JsonParseException e){
            e.printStackTrace();
        }

    }

    private static User createUserJson() {

        User user = new User();

        user.setUserName("Testing");
        user.setPassword("Testing1!");
        user.setUserID(50);
        user.setHobbies(Arrays.asList("programming", "gaming", "swimming", "soccer"));

        return user;

    }
    
}
