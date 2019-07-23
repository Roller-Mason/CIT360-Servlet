/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACP;

import java.util.HashMap;

/**
 *
 * @author Mason
 */
public class ACP {
    
    	// implements HashMap
	public static HashMap<String, CommandHandler> commands = new HashMap<String, CommandHandler>();	
		
	public ACP() {
		
	}
	
	/* Instead of using a series of if statements a HashMap will manage delegating 
	 * the commands to the appropriate classes and returning the value back to the view layer.
	*/ 
	public static Integer handleCommand(String command, Integer firstNumber, Integer secondNumber) {
		
            commands.put("+", new Adding());
            commands.put("-", new Subtracting());
            commands.put("*", new Multiplying());
            commands.put("/", new Dividing());
            commands.put("%", new Modulo());

            CommandHandler handler = commands.get(command);

            Integer math= handler.execute(firstNumber, secondNumber);
            return math;
		
	}	
    
}
