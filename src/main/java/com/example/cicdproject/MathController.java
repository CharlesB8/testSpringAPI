package com.example.cicdproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    //endpoint that adds two numbers in path
    // and returns sum... Get method?
    @GetMapping("/add/{x}/{y}")
        public int addIntegers(@PathVariable int x, @PathVariable int y){
        return x + y;
        }
}
