package be.tripled.template;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    @Test
    public void hello() {
        final String response = HelloWorld.sayHello("Guido");
        assertEquals("Hello Guido", response);
    }
}