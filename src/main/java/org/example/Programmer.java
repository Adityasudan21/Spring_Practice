package org.example;

import java.beans.ConstructorProperties;

public class Programmer {
    private int age;
    private Computer cmp;
    public Programmer(){
        System.out.println("This is the Programmer Constructor");
    }
    //This is to define the name tag of constructor-arg
    @ConstructorProperties({"age","cmp"})
    public Programmer(int age,Computer comp){
        System.out.println("Para Constructor called");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCmp() {
        return cmp;
    }

    public void setCmp(Computer cmp) {
        this.cmp = cmp;
    }

    public void code(){
        System.out.println("Coding");
        cmp.compile();
    }
}
