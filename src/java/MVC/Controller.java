/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author Mason
 */
public class Controller {
    
    public void startSwingApp() throws Exception{
        new View();
    }
    
    public String getUserHobbies() {
        try {
            Model model = new Model();
            return model.getHobbies();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
