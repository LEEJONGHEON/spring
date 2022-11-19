package org.example.spring;

public class DavidChef implements Chef{

    @Override
    public void cook() {
        System.out.println("데이빗쉐프가 요리합니다.");
    }
}
