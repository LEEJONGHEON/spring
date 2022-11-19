package org.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FrenchRestaurant implements Restaurant{

    private Chef chef;

    @Autowired
    public FrenchRestaurant(Chef chef) {
        this.chef = chef;
    }

    public void order() {
        System.out.println("프랑스 요리를 주문합니다.");
        chef.cook();
    }
}
