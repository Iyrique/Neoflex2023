package ru.neoflex.neostudy.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalculatorVacation {

    @GetMapping("/calculate")
    @ResponseBody
    public String calculateVacation(@RequestParam double salary, @RequestParam int vacationDays) {
        double vacationPay = salary * vacationDays / 365;
        return "Your vacation pay is RUB:" + vacationPay;
    }
}

