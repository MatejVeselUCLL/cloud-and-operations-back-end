package com.argocdcloudoperations.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/status")
public class StatusController {
    @GetMapping
    public Map<String, String> getStatus() {
        return Map.of("message", "Demo API development v0.0.5-SNAPSHOT (dev)");
    }
}
