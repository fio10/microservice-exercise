package com.optasia.microservicesexercise.services;


// Customers will be an Interface, with methods that will be further implemented from Customers Controller

import java.util.ArrayList;

public interface CustomersService {

//    What does the below do?!?! Is it the same as the method below?

    ArrayList<String> updateCustomer(ArrayList<String> customerDetails);
    /*

    public ArrayList<String> updateCustomer(ArrayList<String> customerDetails){

        ArrayList<String> updateCustomerDetails = new ArrayList<>();

        return updateCustomerDetails;
    }

     */


    String getCustomerByMsisdn();
    String getCustomerById();
    String blacklist();




}
