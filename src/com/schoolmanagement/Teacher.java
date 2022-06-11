package com.schoolmanagement;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teacher {
    private int id = 1000;
    private String Name;
    private int Salary;
    Scanner input;



    public Teacher(String name, int salary){
        this.id = id++;
        this.Name = name;
        this.Salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
