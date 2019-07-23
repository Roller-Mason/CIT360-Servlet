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
public class Multiplying extends CommandHandler {

    @Override
    public int execute(Integer firstNumber, Integer secondNumber){
        Integer multiplying = firstNumber * secondNumber;
        return multiplying;
    }
}
