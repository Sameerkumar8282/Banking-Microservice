package com.eazybank.gatewayserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/fallback")
public class FallBackController {

    @GetMapping("contact-support")
    public Mono<String> contactSupport() {

        return Mono.just("Please try after some time or Contact Support");
    }

}
