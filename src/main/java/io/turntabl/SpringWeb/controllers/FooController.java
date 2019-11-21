package io.turntabl.SpringWeb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {
    @GetMapping("foo")
    public String getFoo(){
        return "foo";
    }
}
