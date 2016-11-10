package netty;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 用CompletionService
 * @author: xiaoxiang
 * @date: 2016年11月2日
 */
public class CallableAndFuture {
    public static void main(String[] args) {
    	
    	
    	
    	long begin = System.currentTimeMillis();
    	
        ExecutorService threadPool = Executors.newCachedThreadPool();
        CompletionService<Integer> cs = new ExecutorCompletionService<Integer>(threadPool);
        for(int i = 1; i < 5; i++) {
            final int taskID = i;
            cs.submit(new Callable<Integer>() {
                public Integer call() throws Exception {
                	
                	Thread.sleep(new Random().nextInt(10000));
                    return taskID;
                }
            });
        }
        // 可能做一些事情
        for(int i = 1; i < 5; i++) {
            try {
                System.out.println(cs.take().get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        
        long end = System.currentTimeMillis();
        System.out.println("------------------------");
        System.out.println(end - begin);
    }
} 
