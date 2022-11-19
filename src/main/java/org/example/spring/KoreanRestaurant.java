package org.example.spring;

public class KoreanRestaurant implements Restaurant {

    //OCP – 개방 폐쇄 원칙: 클래스내부에서 객체할당하지않음 ->수정에 불편함
    private Chef chef;

    public KoreanRestaurant(Chef chef) {
        this.chef = chef;
    }

    public void order() {
        System.out.println("한식을 주문합니다.");
        chef.cook();
    }
}
