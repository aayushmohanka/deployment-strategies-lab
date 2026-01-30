package com.deployment.strategies.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.Map;


@Component
@RequiredArgsConstructor
public class CallbackHandlerResolver {

    private final Map<String, CallbackHandler> handlers;

    public CallbackHandler resolve(String apmName) {
        CallbackHandler handler = handlers.get(apmName.toUpperCase());
        if (handler == null) {
            throw new IllegalArgumentException("Unsupported APM: " + apmName);
        }
        return handler;
    }
}