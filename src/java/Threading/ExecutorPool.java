/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threading;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 *
 * @author Mason
 */
public class ExecutorPool {
    
    public static void main(String[] args) {
        Executor pooler = Executors.newCachedThreadPool();
        for(int i = 0; i < 3; i++){
            Runnables runner = new Runnables();
            pooler.execute(runner);
            }
        
        try {
            Thread.sleep(1000);
            for(int j = 0; j < 3; j++){
                Runnables runner = new Runnables();
                pooler.execute(runner);
            }
        } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
    
}
