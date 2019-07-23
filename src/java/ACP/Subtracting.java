/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACP;

/**
 *
 * @author Mason
 */
public class Subtracting extends CommandHandler {

    @Override
    public int execute(Integer firstNumber, Integer secondNumber){
        Integer subtraction = firstNumber - secondNumber;
        return subtraction;
    }
    
}
