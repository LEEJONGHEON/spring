package org.example.inherit;

import org.example.encap.Dancer;
import org.example.encap.Grade;

public class IdolDancer extends Dancer {

    public IdolDancer(String crewName, Grade grade, String myName) {
        super(crewName, grade, myName);
    }

    @Override
    public void dance() {
//        super.dance();
        System.out.println("윙크를 갈깁니다~");
    }
}
