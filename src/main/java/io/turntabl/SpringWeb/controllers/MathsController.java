package io.turntabl.SpringWeb.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
public class MathsController{
    @Autowired
    private Maths operation;

    @ApiOperation("Addition")
    @GetMapping("add")
    public Numbers add(
            @RequestParam(name = "a", defaultValue = "0")
            String a,

            @RequestParam(name = "b", defaultValue = "0")
            String b
    )
    {
            Integer num1 = Integer.parseInt(String.valueOf(a));
            Integer num2 = Integer.parseInt(String.valueOf(b));

            Numbers total = new Numbers();
            total.setValue(num1 + num2);
        return total;

    }


    @ApiOperation("Subtraction")
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