package com.schoolmanagement;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
    private int id = 1000;
    private String Name;
    private int AmountPaid;
    private int AmountTotal;

    Scanner input = new Scanner(System.in);
    Student(){
        id++;
        try {
            System.out.print("Enter Student's Name: ");
            this.Name = input.nextLine();
            System.out.print("Enter Amount Paid By Student: ");
            this.AmountPaid = input.nextInt();
            System.out.print("Enter Student's Total: ");
            this.AmountTotal = input.nextInt();
        }catch (InputMismatchException e){
            System.out.println("You Entered A Wrong Input Format! ");
        }
        finally {
            input.close();
        }


        System.out.println(this);




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
