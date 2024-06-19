package pl.sda.springboot101.controller;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.validation.Errors;
import pl.sda.springboot101.OrderForm;

@Controller
@RequestMapping("/orders")
public class OrderController {
    @GetMapping("/create")
    public String showOrderForm(final ModelMap modelMap) {
        modelMap.addAttribute("orderForm", new OrderForm());
        return "order";
    }

    @PostMapping("/create")
    public String handleNewOrder(@Valid
                                 @ModelAttribute("orderForm") final OrderForm orderForm,
                                 final Errors errors) {
        // handle new Order here
        if (errors.hasErrors()) {
            return "order";
        }
        return "redirect:/orders/create";
    }
}