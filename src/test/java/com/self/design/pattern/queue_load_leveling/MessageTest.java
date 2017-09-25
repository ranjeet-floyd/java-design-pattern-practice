/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.self.design.pattern.queue_load_leveling;

import static org.testng.Assert.assertEquals;


/**
 *
 * @author ranjeet.kumar
 */
public class MessageTest {
    
    public MessageTest() {
    }
    

    /**
     * Test of getMsg method, of class Message.
     */
    @org.testng.annotations.Test
    public void testMessage() {
        System.out.println("com.self.design.pattern.queue_load_leveling.MessageTest.testMessage()");
        String msg = "this is test message";
        Message instance = new Message(msg);
        String expResult = msg;
        String result = instance.getMsg();
        assertEquals(expResult, result);
    }

    
}
