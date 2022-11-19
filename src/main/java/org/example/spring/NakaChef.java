package org.example.spring;

public class NakaChef implements Chef{
    @Override
    public void cook() {
        System.out.println("NakaChef 가 요리합니다.");
    }
}
