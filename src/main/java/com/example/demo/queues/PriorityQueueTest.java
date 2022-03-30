package com.example.demo.queues;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {

    public static void main(String[] args) {

        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(4);
        priorityQueue.offer(17);
        priorityQueue.offer(1);
        priorityQueue.offer(10);
        priorityQueue.offer(100);

        while (priorityQueue.peek()!=null){
            System.out.println("polled::"+priorityQueue.poll());
        }

    }
}
