package com.javaworkshop.demo.dtos;

import lombok.Data;

import java.util.List;

@Data
public class ResponseDto {
    private String country;
    private String name;
    private String state_province;
    private String alpha_two_code;
    private List<Domain> domains;
    private List<WebPage> web_pages;

}
