package com.proxy;

import java.lang.Override;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Proxy$0 implements Flyable {
  private InvocationHandler handler;

  public Proxy$0(InvocationHandler handler) {
    this.handler = handler;
  }

  @Override
  public void fly() {
    try {
    	Method method = com.proxy.Flyable.class.getMethod("fly");
    	this.handler.invoke(this, method, null);
    } catch(Throwable e) {
    	e.printStackTrace();
    }
  }
}
