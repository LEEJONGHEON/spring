package org.example.inherit;

import org.example.encap.Dancer;
import org.example.encap.Grade;

public class StreetDancer extends Dancer {

    public StreetDancer(String crewName, Grade grade, String myName) {
        super(crewName, grade, myName);
    }

    @Override
    public void dance() {
        System.out.println("빙글빙글 돌면서 춤을 춥니다.");
    }
}








