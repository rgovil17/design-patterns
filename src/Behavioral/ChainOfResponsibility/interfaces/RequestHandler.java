package Behavioral.ChainOfResponsibility.interfaces;

import Behavioral.ChainOfResponsibility.impl.Request;

public interface RequestHandler {
    void setNext(RequestHandler next);
    void handle(Request request);
}
