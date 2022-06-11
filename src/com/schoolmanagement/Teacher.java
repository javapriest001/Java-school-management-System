package com.schoolmanagement;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teacher {
    private int id = 1000;
    private String Name;
    private int Salary;




    public Teacher(String Name, int salary){
        this.id = this.id++;
        this.Name = Name;
        this.Salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", NameTest='" + Name + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
