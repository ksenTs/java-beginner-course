package com.beginner.oop.polymorphism;


import com.beginner.oop.inheritance.JavaProgrammer;
import com.beginner.oop.inheritance.Programmer;

public class Google {

    public static void recruitProgrammer(Programmer programmer) {
        System.out.println("Вы приняты на работу!");
        System.out.println("Меня зовут " + programmer.getName());
        System.out.println(programmer.writeCode());
    }

    public static void main(String[] args) {
        Programmer javaProgrammer = new JavaProgrammer("Степа", "Java", 8);
        recruitProgrammer(javaProgrammer);
    }

}
