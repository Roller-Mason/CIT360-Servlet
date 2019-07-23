/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threading;

/**
 *
 * @author Mason
 */
public class Threads extends Thread {
    
    int lifeSeconds;


    public Threads(int input){
        lifeSeconds = input;
    }

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + " has a life of " + lifeSeconds);
        for (int i = 0; i < lifeSeconds; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            try{
                Threads.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " finished!");
    }
    
    public static void main(String[] args){
        new Threads(5).start();
    }
    
    
}
