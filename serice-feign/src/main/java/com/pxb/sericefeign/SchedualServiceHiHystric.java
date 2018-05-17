package com.pxb.sericefeign;


import org.springframework.stereotype.Component;


/**
 * 熔断器配置
 */
@Component
public class SchedualServiceHiHystric implements  SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
