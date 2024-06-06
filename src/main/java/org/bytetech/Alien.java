package org.bytetech;

import org.springframework.beans.factory.annotation.Autowired;

public class Alien {
    private int age;
    private Computer com;

    public Alien() {
        System.out.println("Alien object Created");
    }

    public Alien(Computer com) {
        this.com = com;
    }

    public void code() {
        System.out.println("Im Coding..");
        com.compile();
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
