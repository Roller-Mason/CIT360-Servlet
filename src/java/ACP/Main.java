/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACP;

import java.util.Scanner;

/**
 *
 * @author Mason
 */
public class Main {
    
    	public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            System.out.println("Enter your first number to do math on: ");
            Integer firstNumber = Integer.parseInt(in.nextLine());
            System.out.println("Enter a command(+, -, /, *, %) to do between your two numbers: ");
            String command = in.nextLine();
            System.out.println("Enter another number: ");
            Integer secondNumber = Integer.parseInt(in.nextLine());

            Integer handleCommand = ACP.handleCommand(command, firstNumber, secondNumber);
            System.out.print("Your formula: " + firstNumber + " " + command + " " + secondNumber + " = " + handleCommand);
                
		
	}
    
}
