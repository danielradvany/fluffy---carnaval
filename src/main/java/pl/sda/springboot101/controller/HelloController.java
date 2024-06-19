package pl.sda.springboot101.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pl.sda.springboot101.EmployeeDTO;
import pl.sda.springboot101.PersonDTO;


@Controller
@RequestMapping(path = "/first")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET, path = "/hello/{name}")
    @ResponseBody
    public String hello(@PathVariable(name = "name") final String name) {
        return "Hello " + name;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    @ResponseBody
    public String getWithRequestParam(@RequestParam(name = "lastName") final String lastName,
                                      @RequestParam(name = "firstName") final String firstName) {
        return "Hello " + firstName + "  " + lastName;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/hello")
    @ResponseBody
    public String helloToPerson(@RequestBody PersonDTO personDTO) {
        return "Hello " + personDTO.getFirstName() + " " + personDTO.getLastName();
    }

    @RequestMapping(method = RequestMethod.POST, path = "/hello2")
    public String hello() {
        return "welcome ";
    }

    private static final String MODEL_HELLO_MESSAGE_ATTRIBUTE_NAME = "helloMsg";

    @GetMapping("/helloWithText")
    public String showHello(final ModelMap modelMap) {
        modelMap.addAttribute(MODEL_HELLO_MESSAGE_ATTRIBUTE_NAME, "hello in thymeleaf from model map");
        return "welcome";
    }

    private static final String MODEL_HELLO_MESSAGE_ATTRIBUTE = "carMsg";

    @GetMapping("/carService/{carName}/{carOwner}")
    public String showCarOwner(final ModelMap modelMap,
                               @PathVariable(name = "carName") final String carName,
                               @PathVariable(name = "carOwner") final String carOwner) {
        modelMap.addAttribute(MODEL_HELLO_MESSAGE_ATTRIBUTE, "Am cautat masina " + carName + " a " + carOwner);
        return "car";
    }

    private static final String MODEL_HELLO_MESSAGE = "carOwn";

    @GetMapping("/carService")
    public String showOwner(final ModelMap modelMap,
                            @RequestParam(name = "carModel") final String carModel,
                            @RequestParam(name = "carOwner") final String carOwner) {
        modelMap.addAttribute(MODEL_HELLO_MESSAGE, "Am gasit masina " + carModel + " pentru proprietarul " + carOwner);
        return "owner";
    }

    private static final String MODEL_HELLO = "person";
    @PostMapping("/personData")
    public String person (final ModelMap modelMap,
                          @RequestBody EmployeeDTO employeeDTO ){
        modelMap.addAttribute(MODEL_HELLO, "Persoana cautata este  " + employeeDTO.getFirstName() + "  " + employeeDTO.getLastName());
        return "person";
    }
}
