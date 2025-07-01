package Behavioral.ChainOfResponsibility.impl.handler;

import Behavioral.ChainOfResponsibility.impl.Request;
import Behavioral.ChainOfResponsibility.interfaces.BaseHandler;

public class ValidationHandler extends BaseHandler {
    @Override
    public void handle(Request request) {
        if (request.payload == null || request.payload.trim().isEmpty()) {
            System.out.println("ValidationHandler: ❌ Invalid payload.");
            return;
        }
        System.out.println("ValidationHandler: ✅ Payload valid.");
        forward(request);
    }
}
