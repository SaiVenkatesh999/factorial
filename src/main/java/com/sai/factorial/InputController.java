package com.sai.factorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputController {

    @Autowired
    private FactorialService factorialService;

    @GetMapping("/")
    public String showForm() {
        return "inputForm";  // Renders inputForm.html
    }

    @PostMapping("/submit")
    public String submitForm(@RequestParam("inputValue") int inputValue, Model model) {
        int factorialResult = factorialService.calculateFactorial(inputValue);
        model.addAttribute("inputValue", inputValue);
        model.addAttribute("factorialResult", factorialResult);
        return "result";  // Renders result.html
    }
}
