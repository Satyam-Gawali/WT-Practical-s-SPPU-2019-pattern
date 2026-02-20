package com.wtpr10.beans;

import javax.ejb.Stateless;

@Stateless
public class CalculatorBean implements CalculatorRemote {
    public int add(int a, int b) {
        return a + b;
    }
}
