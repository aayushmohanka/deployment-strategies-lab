package com.github.action.learning.callback.infrastructure.external;

public class APM1External implements ExternalClient{

    @Override
    public void send(String input) {
        System.out.println("APM1External send: " + input);
    }
}
