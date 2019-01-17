package com.adonayg.demo;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldImpl implements HelloWorldService {
    /* (non-Javadoc)
	 * @see com.adonayg.demo.HelloWorldService#sayHello()
	 */
    @Override
	public void sayHello(){
        System.out.println("Hello World!");
    }
}
