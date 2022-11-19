package org.example.spring;

import org.example.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    @DisplayName("스프링 없이 의존객체 주입하기")
    void hotelTest() {

        // 객체생성과 관리는 한곳에서 하고, 각 클래스는 객체생성을 지양함
        // 객체관리를 외부에서 관리
        // 객체관리에 용이함
        // 특정 객체에 의존하지않고 인터페이스로 제어한뒤에 원하는 객체를 할당함
        Container container = new Container();
        Hotel hotel = container.hotel();

        hotel.service();
    }

    @Test
    @DisplayName("스프링으로 의존객체 주입하기")
    void springTest() {
        // 스프링 컨테이너 불러오기
        // ctrl alt v : 객체 할당
        AnnotationConfigApplicationContext container
                = new AnnotationConfigApplicationContext(Main.class);

        //호텔 빈 꺼내기
        Hotel hotel = container.getBean(Hotel.class);

        hotel.service();
    }

}