package com.example.demo.queues;

import java.util.LinkedList;
import java.util.Queue;

public class NormalQueueTest {

    public static void main(String[] args) {

        Queue<Integer> normalQueue = new LinkedList<>();
        normalQueue.offer(1);
        normalQueue.offer(5);
        normalQueue.offer(3);
        normalQueue.offer(7);
        normalQueue.offer(8);
        normalQueue.offer(-1);

        while (normalQueue.peek()!=-1){
            System.out.println("polled::"+normalQueue.poll());
        }
    }
}
