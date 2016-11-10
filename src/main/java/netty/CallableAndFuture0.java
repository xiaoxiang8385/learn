package netty;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndFuture0 {
    public static void main(String[] args) {
    	
    	
    	long begin = System.currentTimeMillis();
    	
        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        
        List<Future<Integer>> list = new ArrayList<Future<Integer>>();
        
        for(int i = 1; i < 5; i++) {
        	final int taskID = i;
        	Future<Integer> future = threadPool.submit(new Callable<Integer>() {
                public Integer call() throws Exception {
                	
                	Thread.sleep(new Random().nextInt(10000));
                    return taskID;
                }
            });
        	list.add(future);
        }
        try {
            for(Future<Integer> future : list){
            	System.out.println(future.get());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        
        
        long end = System.currentTimeMillis();
        System.out.println("------------------------");
        System.out.println(end - begin);
    }
}
