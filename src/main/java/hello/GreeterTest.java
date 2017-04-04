package hello;

/**
 * Created by MKE10580 on 2017-04-04.
 */

import  static org.hamcrest.CoreMatchers.containsString;
import  static org.junit.Assert.*;

import org.junit.Test;


public class GreeterTest {
    private Greeter greeter = new Greeter();

    @Test
    public void greeterSaysHello() {
        assertThat(greeter.sayHello(), containsString("Hello"));
    }
}
