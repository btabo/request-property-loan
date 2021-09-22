package com.ibmi.mortgage.domain.vo;

public class Csp {

    private int val;


    public Csp(int val) {
        this.val = val;
        // TODO : controler le champ des valeurs autorisées.
    }

    public int get() {
        return val;
    }
}
