package se.wesource.otherspringbootservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.wesource.otherspringbootservice.model.Other;
import se.wesource.otherspringbootservice.service.OtherService;

@RestController
public class OtherController {
    @Autowired
    private OtherService otherService;

    @RequestMapping(value="/other/{name}")
    public Other findCustomerByName(@PathVariable("name")String name){

        Other other = otherService.findOtherByName(name);

        return other;
    }
}
