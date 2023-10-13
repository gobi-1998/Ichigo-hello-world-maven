package hello;

import org.joda.time.LocalTime;
// V2
public class HelloWorld {
	public static void main(String[] args) {
		LocalTime currentTime = new LocalTime();
		System.out.println("v7 - The current local time: " + currentTime);
		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());
	}
}
