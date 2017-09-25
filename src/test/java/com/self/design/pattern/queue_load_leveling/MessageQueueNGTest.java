/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.self.design.pattern.queue_load_leveling;

import static org.testng.Assert.*;

/**
 *
 * @author ranjeet.kumar
 */
public class MessageQueueNGTest {
    
    public MessageQueueNGTest() {
    }

   
    /**
     * Test of submitMsg method, of class MessageQueue.
     */
    @org.testng.annotations.Test
    public void testSubmitMsg() {
        System.out.println("submitMsg");
        String taskMsg = "task 1";
        Message msg = new Message(taskMsg);
        MessageQueue instance = new MessageQueue();
        instance.submitMsg(msg);
        assertEquals(instance.retrieveMsg() , taskMsg);
    }

    /**
     * Test of retrieveMsg method, of class MessageQueue.
     */
    @org.testng.annotations.Test
    public void testRetrieveMsg() {
        System.out.println("retrieveMsg");
        MessageQueue instance = new MessageQueue();
        String taskMsg ="task 2";
        Message expResult = new Message(taskMsg);
        instance.submitMsg(expResult);
        Message result = instance.retrieveMsg();
        assertEquals(result, expResult);
    }
    
}
