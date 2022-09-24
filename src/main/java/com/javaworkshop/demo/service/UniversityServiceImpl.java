package com.javaworkshop.demo.service;

import com.javaworkshop.demo.dtos.ResponseDto;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UniversityServiceImpl implements  UniversityService {

    Logger logger = LogManager.getLogger(UniversityServiceImpl.class);

    @Autowired
    RestTemplate restTemplate;

    @Override
    public List<ResponseDto> getUniversityList(String countryName) {
        logger.info("getUniversityList is running with: " + countryName);
        final String uri = "http://universities.hipolabs.com/search?country="+countryName;

        ResponseEntity<List<ResponseDto>> responseEntity =
                restTemplate.exchange(
                        uri,
                        HttpMethod.GET,
                        null,
                        new ParameterizedTypeReference<List<ResponseDto>>() {
                        }
                );

        logger.info("response: " + responseEntity.toString());
        return responseEntity.getBody();
    }
}
