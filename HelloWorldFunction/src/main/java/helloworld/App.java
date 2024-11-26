package helloworld;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class App  {
    public Object handleRequest(Object input, Context context) {
        // Log the "Hello World" message
        System.out.println("Hello World");
        // Return the "Hello World" message
        return "Hello World";
    }

}