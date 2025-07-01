package Behavioral.ChainOfResponsibility.impl.handler;

import Behavioral.ChainOfResponsibility.impl.Request;
import Behavioral.ChainOfResponsibility.interfaces.BaseHandler;

public class BusinessLogicHandler extends BaseHandler {
    @Override
    public void handle(Request request) {
        System.out.println("BusinessLogicHandler: 🚀 Processing request...");
        // Core application logic goes here
    }
}
