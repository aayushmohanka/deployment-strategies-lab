package com.deployment.strategies.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("APM1")
public class APM1 implements CallbackHandler {
    @Override
    public String handle(String input) {
        return "Handled by APM1";
    }
}
