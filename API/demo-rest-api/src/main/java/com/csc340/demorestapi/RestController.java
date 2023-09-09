/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc340.demorestapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author romay
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {
    
    @GetMapping("/hello")
    public String hello(){
        return "Hello, World";
    }
    
    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "world") String name){
        return "Hello, " + name;
    }
    
    
}
