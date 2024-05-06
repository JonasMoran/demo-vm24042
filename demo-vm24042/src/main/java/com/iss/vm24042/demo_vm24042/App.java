package com.iss.vm24042.demo_vm24042;

/**
 * Hello world!
 *
 */
public class App 
{
    public String Hello() {
    	return "Hello World";
    }
    
    public static void main(String [] args)
    {
    	App hw = new App();
    	System.out.println(hw.Hello());
    }
}
