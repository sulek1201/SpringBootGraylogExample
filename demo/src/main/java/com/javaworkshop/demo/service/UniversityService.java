package com.javaworkshop.demo.service;


import com.javaworkshop.demo.dtos.ResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UniversityService {
    List<ResponseDto> getUniversityList(String countryName);
}
