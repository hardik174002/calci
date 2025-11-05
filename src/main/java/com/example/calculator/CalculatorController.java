package com.example.calculator;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class CalculatorController {
    
    @GetMapping("/")
    public String getMethodName() {
        return new String("Hello From Calculator");
    }
    
}
