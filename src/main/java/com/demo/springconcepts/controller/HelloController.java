package com.demo.springconcepts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController //http://localhost:8080/hello
public class HelloController {
    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    //used request  mapping to get the query in the form of name and display it
    //get request using query
    @RequestMapping(value = "/query") //http://localhost:8080/query?name=Diksha
    public String queryController(@RequestParam(value = "name") String name) {
        return "Hello " + name + "!";
    }

    // GET request using a Path Variable
    @RequestMapping(value = "/param/{name}") // http://localhost:8080/param/Diksha?name=Diksha
    public String pathVariableController(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz!";
    }

}