package org.example.spring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    void hotelTest() {

        // 객체생성과 관리는 한곳에서 하고, 각 클래스는 객체생성을 지양함
        // 객체관리를 외부에서 관리
        // 객체관리에 용이함
        // 특정 객체에 의존하지않고 인터페이스로 제어한뒤에 원하는 객체를 할당함
        Container container = new Container();
        Hotel hotel = container.hotel();

        hotel.service();

    }

}