package io.turntabl.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathsController{

    @GetMapping("add")
    public Numbers add(
            @RequestParam(name = "a", defaultValue = "0")
            int a,

            @RequestParam(name = "b", defaultValue = "0")
            int b
    )
    {
            Integer num1 = Integer.parseInt(String.valueOf(a));
            Integer num2 = Integer.parseInt(String.valueOf(b));

            Numbers total = new Numbers();
            total.setValue(num1 + num2);
        return total;

    }



    @GetMapping("subtract")
    public Numbers subtract(
            @RequestParam(name = "a", defaultValue = "0")
                    int a,

            @RequestParam(name = "b", defaultValue = "0")
    int b
    )
    {
        Integer num1 = Integer.parseInt(String.valueOf(a));
        Integer num2 = Integer.parseInt(String.valueOf(b));

        Numbers total = new Numbers();
        total.setValue(num1 - num2);
        return total;

    }


}