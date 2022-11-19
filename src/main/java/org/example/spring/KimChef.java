package org.example.spring;

import org.springframework.stereotype.Component;

@Component // spring 에 객체의 lifespan을 맡기기
public class KimChef implements Chef {

    public void cook() {
        System.out.println("김쉐프가 요리합니다.");
    }
}
