package helloworld;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class App implements RequestHandler<Object, Object> {
    private final HandlerAgent handlerAgent = new HandlerAgent();

    @Override
    public Object handleRequest(Object input, Context context) {
        return handlerAgent.handleRequest(input, context);
    }
}