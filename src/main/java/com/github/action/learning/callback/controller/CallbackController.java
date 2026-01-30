package com.github.action.learning.callback.controller;

import com.github.action.learning.callback.service.CallbackHandlerResolver;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/callback")
@AllArgsConstructor
public class CallbackController {

    private CallbackHandlerResolver resolver;

    @PostMapping("{apmName}/handle/{paymentId}")
    public String callbackHandle(@PathVariable  String apmName,
                       @PathVariable String paymentId) {
        return resolver.resolve(apmName).handle(paymentId);
    }

    @GetMapping("/ping")
    public void ping() {
        System.out.println("ping");
    }
}
