package org.example.spring;

import org.springframework.stereotype.Component;

@Component(value = "kkk") // spring 에 객체의 lifespan을 맡기기, value이름지정안하면, default값으로 class이름의 Camal case로 등록됨
public class KimChef implements Chef {

    public void cook() {
        System.out.println("김쉐프가 요리합니다.");
    }
}
