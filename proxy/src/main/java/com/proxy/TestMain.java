package com.proxy;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * @author Alex
 * @version 1.0
 * @date 2020/9/30 11:23
 */
public class TestMain {
    public static void main(String[] args) throws Exception {
        Flyable o = (Flyable) Proxy.newProxyInstance(Flyable.class, new MyInvocationHandler(new Bird()));
        o.fly();
    }
}
