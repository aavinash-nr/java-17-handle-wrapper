package helloworld;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Security;
import java.util.Optional;
import java.util.logging.Logger;

import com.amazonaws.services.lambda.runtime.Context;
import com.newrelic.java.HandlerWrapper;

public class HandlerAgent extends HandlerWrapper {
    private static final String DNS_CACHE_OFF = "0";
    private static final Logger logger = Logger.getLogger(HandlerAgent.class.getName());

    static {
        System.setProperty("javax.net.ssl.trustStore", "/var/task/truststore");
        var cacheTtl = Optional.ofNullable(System.getenv("DNS_CACHE_TTL")).orElse(DNS_CACHE_OFF);
        Security.setProperty("networkaddress.cache.ttl", cacheTtl);
    }
    public Object handleRequest(Object input, Context context) {
        // Log the "Hello World" message
        System.out.println("Hello World");
        // Return the "Hello World" message
        return "Hello World";
    }
   
}