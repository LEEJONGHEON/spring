package org.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FrenchRestaurant implements Restaurant{

    private Chef chef;

    @Autowired //동일한 타입을 여러개 컴포넌트 지정해놓으면 자동할당안되므로, Qualifier로 특정 객체지정해줘야함
    public FrenchRestaurant(@Qualifier("kkk") Chef chef) {
        this.chef = chef;
    }

    public void order() {
        System.out.println("프랑스 요리를 주문합니다.");
        chef.cook();
    }
}
