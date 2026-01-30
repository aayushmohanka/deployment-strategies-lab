package com.github.action.learning.callback;

import com.github.action.learning.callback.service.APM1;
import com.github.action.learning.callback.service.APM2;
import com.github.action.learning.callback.service.CallbackHandler;
import com.github.action.learning.callback.service.CallbackHandlerResolver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CallbackHandlerResolverTest {
    private CallbackHandlerResolver resolver;

    @BeforeEach
    void setUp() {
        Map<String, CallbackHandler> handlers = Map.of(
                "APM1", new APM1(),
                "APM2", new APM2()
        );
        resolver = new CallbackHandlerResolver(handlers);
    }

    @Test
    void shouldResolveApm1Handler() {
        CallbackHandler handler = resolver.resolve("APM1");

        String result = handler.handle("123");

        assertEquals("Handled by APM1", result);
    }

    @Test
    void shouldResolveApm2Handler() {
        CallbackHandler handler = resolver.resolve("APM2");

        String result = handler.handle("456");

        assertEquals("Handled by APM1", result);
    }
}
