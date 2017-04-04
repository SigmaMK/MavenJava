package hello;

/**
 * Created by MKE10580 on 2017-04-04.
 */

import org.joda.time.LocalTime;



public class HelloWorld {
    public static void main (String [] args){
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);
        Greeter greet = new Greeter();
        System.out.println(greet.sayHello());
    }
}
