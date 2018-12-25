package com.oyjy.feign.service.hystrixHallBack;

import com.oyjy.feign.service.HiService;
import org.springframework.stereotype.Component;

@Component
public class HiServiceHystric implements HiService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
