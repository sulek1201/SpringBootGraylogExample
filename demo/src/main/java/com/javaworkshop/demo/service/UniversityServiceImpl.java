package com.javaworkshop.demo.service;

import com.javaworkshop.demo.dtos.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UniversityServiceImpl implements  UniversityService {
    @Autowired
    RestTemplate restTemplate;

    @Override
    public List<ResponseDto> getUniversityList(String countryName) {
        final String uri = "http://universities.hipolabs.com/search?country="+countryName;

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
