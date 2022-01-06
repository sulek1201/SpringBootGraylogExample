package com.javaworkshop.demo.controller;

import com.javaworkshop.demo.dtos.ResponseDto;
import com.javaworkshop.demo.service.UniversityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UniversityController {

    private UniversityService universityService;
    public UniversityController(UniversityService universityService){
        this.universityService = universityService;
    }

    @GetMapping("getUniversityList/{countryName}")
    ResponseEntity<List<ResponseDto>> getUniversityList(String countryName){
        return (ResponseEntity<List<ResponseDto>>) universityService.getUniversityList(countryName);
    }
    @RequestMapping("/hello")
    String getHello(){
        return "hello";
    }


}
