package pl.sda.springboot101.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.sda.springboot101.model.Fruit;
import pl.sda.springboot101.service.FruitService;

@Controller
public class FruitController {
    @Autowired
    FruitService fruitService;

    @PostMapping(path = "addFruit")
    @ResponseBody
    public ResponseEntity addFruit(@RequestBody Fruit fruit) {
        return fruitService.addFruit(fruit);

    }
}