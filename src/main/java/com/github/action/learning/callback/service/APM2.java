package com.github.action.learning.callback.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("APM2")
public class APM2 implements CallbackHandler {
    @Override
    public String handle(String input) {
        return "Handled by APM1";
    }
}
