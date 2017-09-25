/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.self.design.pattern.queue_load_leveling;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * @author ranjeet.kumar
 */
public class MessageQueue {

    private final BlockingQueue<Message> blockingQueue;

    public MessageQueue() {
        this.blockingQueue = new LinkedBlockingQueue<>();
    }

    public MessageQueue(BlockingQueue<Message> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    public void submitMsg(Message msg) {
        if (blockingQueue.remainingCapacity() > 0) {
            blockingQueue.add(msg);
        } else {
            throw new RuntimeException("Task queue is full, not adding task msg :" + msg.toString());
        }
    }

    public Message retrieveMsg() {
        if (blockingQueue.isEmpty()) {
            throw new RuntimeException("Task queue is empty");
        }

        return blockingQueue.poll();
    }

}
