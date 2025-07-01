package Behavioral.ChainOfResponsibility.impl.handler;

import Behavioral.ChainOfResponsibility.impl.Request;
import Behavioral.ChainOfResponsibility.interfaces.BaseHandler;

public class AuthHandler extends BaseHandler {
    @Override
    public void handle(Request request) {
        if (request.user == null) {
            System.out.println("AuthHandler: ❌ User not authenticated.");
            return;   // Stop the chain
        }
        System.out.println("AuthHandler: ✅ Authenticated.");
        forward(request);
    }
}
