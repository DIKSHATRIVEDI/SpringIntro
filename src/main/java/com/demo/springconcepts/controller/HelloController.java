package com.demo.springconcepts.controller;

import com.demo.springconcepts.controller.dto.User;
import org.springframework.web.bind.annotation.*;

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

    // POST request using a User object
    @RequestMapping(value = "/post", method = RequestMethod.POST) // http://localhost:8080/post
    public String postController(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz!";
    }

    // **PUT Request: Path Variable (firstName) + Query Parameter (lastName)**
    @PutMapping("/put/{firstName}")  // http://localhost:8080/put/Diksha?lastName=Trivedi
    public String putController(@PathVariable String firstName,
                                @RequestParam(name = "lastName", required = true) String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz!";
    }

}