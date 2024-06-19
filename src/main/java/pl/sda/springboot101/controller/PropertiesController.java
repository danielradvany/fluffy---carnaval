package pl.sda.springboot101.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;


@RestController
public class PropertiesController {

    @Value("${pl.sdacademy.example}")
    private String injectedValue;
    @RequestMapping(method = RequestMethod.GET, path = "/value")
    public String getProperty() {
        return injectedValue;
    }

}
