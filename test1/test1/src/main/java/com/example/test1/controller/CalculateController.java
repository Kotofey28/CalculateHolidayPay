package com.example.test1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculateController {
    @GetMapping("/calculate")
    public String getCalculate(@RequestParam int avg_salary, @RequestParam int vacation, Model model){
        float holiday_pay = avg_salary / 29.3f * vacation;

        model.addAttribute("avg_salary", avg_salary);
        model.addAttribute("vacation", vacation);
        model.addAttribute("holiday_pay", holiday_pay);

        return "form";
    }
}
