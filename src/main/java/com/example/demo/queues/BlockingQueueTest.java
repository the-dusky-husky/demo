package com.example.demo.queues;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest {

    public static void main(String[] args) throws Exception{
        BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(5);
        Runnable producer = () -> {
            for (int i=0;i<10;i++){
                try {
                    Thread.sleep(100);
                    blockingQueue.put(i);
                    System.out.println("put::"+i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                blockingQueue.put(-1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable consumer = () -> {
           while (true){
                try {
                    Thread.sleep(1000);
                    Integer take = blockingQueue.take();
                    System.out.println("taken ::"+take);
                    if (take==-1)
                        break;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}