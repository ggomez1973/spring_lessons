package com.example.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
    //@Autowired
    private Address address;

    public Address getAddress() {
        return address;
    }

    public Company(Address address) {
        this.address = address;
    }


    public void setAddress(Address address) {
        this.address = address;
    }
  /*
    @Autowired
    public void weirdMethod(Address address){
        this.address = address;
    }*/
}
