package com.javaworkshop.demo.dtos;

import lombok.Data;

import java.util.List;

@Data
public class ResponseDto {
    private String country;
    private String name;
    private String alpha_two_code;
    private List<String> domains;
    private List<String> web_pages;

}
