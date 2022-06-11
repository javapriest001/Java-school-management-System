package com.schoolmanagement;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
    private int id = 1000;
    private String Name;
    private int AmountPaid;
    private int AmountTotal;


    public Student(String name , int AmountPaid , int AmountTotal){
        id++;
        this.Name = name;
        this.AmountPaid = AmountPaid;
        this.AmountTotal = AmountTotal;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", AmountPaid=" + AmountPaid +
                ", AmountTotal=" + AmountTotal +
                '}';
    }
}
