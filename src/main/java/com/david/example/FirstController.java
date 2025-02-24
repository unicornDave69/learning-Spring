package com.david.example;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from controller1";
    }

    @PostMapping("/post")
    public String post(@RequestBody String message) {


        return "Request is ok and message is: " + message;
    }

    @PostMapping("/post-order")
    public String post(@RequestBody OrderDto order ) {


        return "Request is ok and order is: " + order.toString();
    }

    @PostMapping("/post-order-record")
    public String post(@RequestBody OrderRecord order ) {


        return "Request is ok and order is: " + order.toString();
    }
}
