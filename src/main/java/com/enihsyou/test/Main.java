package com.enihsyou.test;

public class Main {

    private int offset;

    public Main(int offset) {this.offset = offset;}

    public int add(int a, int b) {
        return a + b + offset;
    }
}
