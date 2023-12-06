package com.optasia.microservicesexercise.controllers;


//  Here we can also add the Rules per service

import com.optasia.microservicesexercise.services.CustomersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class CustomersController {

    private final CustomersService customerService;


    public CustomersController(CustomersService customerService) {
        this.customerService = customerService;
    }


    public String checkCustomerId(Model model){

        model.addAttribute("id", customerService.getCustomerById());

        return "ids";

    }


}
