package com.example.SpeakingClock.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpeakingClock.Services.ClockService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "Time Conversion API" , description="")
@RestController
@RequestMapping("/api")
public class ClockController {
   
    @Autowired
    private ClockService clockService;
   

    @ApiOperation(value = "View a list of available products", response = Iterable.class)
   
    @GetMapping("/time/{inputTime}")
    public String convertTimeToWords(@PathVariable String inputTime) {
       
        return clockService.convertToWords(inputTime);
    }



    //  @GetMapping("/")
    //    public String Words() {
    //      return "HI ROSHAN";
    // }
}
