package org.tfa.test.helloworld;

public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(hello("cat"));
	}
	
	public static String hello(String name){
		return "hello "+name;
	}

}
