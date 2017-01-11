package com.allstate.controllers;

import com.allstate.models.Maths;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;

/**
 * Created by localadmin on 11/01/17.
 */

@RestController
public class MathController {
    @RequestMapping(value = "/math/square/{x}")
    public Map<String, Integer> square(@PathVariable int x){
        Map<String , Integer> map = new HashMap<>();
        map.put("square", x*x);
        return map;

    }

    @RequestMapping(value = "/math/factorial/{x}")
    public Map<String, Integer> factorial(@PathVariable int x){
        Map<String , Integer> map = new HashMap<>();
        map.put("factorial", Maths.factorial(x));
        return map;

    }

    @RequestMapping(value = "/math/fibinocci/{x}")
    public Map<String, Integer> fibinocci(@PathVariable int x){
        Map<String , Integer> map = new HashMap<>();
        map.put("fibinocci", Maths.fibinocci(x));
        return map;

    }

}
