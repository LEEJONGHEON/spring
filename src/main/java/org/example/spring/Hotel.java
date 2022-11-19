package org.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hotel {
    private SuiteRoom room;
    private Restaurant restaurant;

    //클래스 내부에서 객체 할당 x -> 선언시 값 할당(외부에서 값할당)

    @Autowired //컨테이너에 있는 객체할당, 생성자 주입
    public Hotel(SuiteRoom room, Restaurant restaurant) {
        this.room = room;
        this.restaurant = restaurant;
    }

    public void service() {
        room.reserve();
        restaurant.order();
    }
}
