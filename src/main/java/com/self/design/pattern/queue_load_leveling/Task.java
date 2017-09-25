/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.self.design.pattern.queue_load_leveling;

/**
 *
 * @author ranjeet.kumar
 */
@FunctionalInterface
public interface Task {

    void sumbit(Message msg);

}
