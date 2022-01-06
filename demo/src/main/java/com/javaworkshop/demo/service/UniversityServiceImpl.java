package com.javaworkshop.demo.service;

import com.javaworkshop.demo.dtos.ResponseDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class UniversityServiceImpl implements  UniversityService {
    @Override
    public List<ResponseDto> getUniversityList(String countryName) {
        final String uri = "http://universities.hipolabs.com/search?country="+countryName;

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<ResponseDto>> responseEntity =
                restTemplate.exchange(
                        uri,
                        HttpMethod.GET,
                        null,
                        new ParameterizedTypeReference<List<ResponseDto>>() {
                        }
                );
        return responseEntity.getBody();
    }
}
