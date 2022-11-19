package org.example;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "org.example") // 의존객체 검색
public class Main {
    public static void main(String[] args) {
        System.out.println("안녕하세요!");
    }



}
// Ctrl + E : 최근 열람 목록 나옴