package com.fomkin.testspringapp.service;

public class TestBean {
    String name;

    public TestBean() {
    }

    public TestBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
