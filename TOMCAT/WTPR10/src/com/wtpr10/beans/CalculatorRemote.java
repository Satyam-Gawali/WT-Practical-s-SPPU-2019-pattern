package com.wtpr10.beans;

import javax.ejb.Remote;

@Remote
public interface CalculatorRemote {
    int add(int a, int b);
}
