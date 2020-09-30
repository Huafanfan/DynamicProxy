package com.proxy;

import java.util.Random;

/**
 * @author Alex
 * @version 1.0
 * @date 2020/9/30 11:30
 */
public class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("Bird is flying...");
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
