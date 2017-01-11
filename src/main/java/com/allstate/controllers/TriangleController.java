package com.allstate.controllers;

import org.springframework.web.bind.annotation.*;
import com.allstate.models.Triangle;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by localadmin on 11/01/17.
 */

@RestController
public class TriangleController {

    @RequestMapping(value = "/triangle/area", method = RequestMethod.POST)
    public Map<String, Double> area(@RequestBody List<Triangle> triangles){
        double result = Triangle.area(triangles);
        Map<String, Double> map = new HashMap<>();
        map.put("area", result);
        return map;
    }

}
