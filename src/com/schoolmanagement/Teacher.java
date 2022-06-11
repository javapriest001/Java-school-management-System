package com.schoolmanagement;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teacher {
    private int id = 1000;
    private String Name;
    private int Salary;
    Scanner input = new Scanner(System.in);

    Teacher(){
        this.id++;
        try{
            System.out.print("Enter Teacher's Name: ");
            this.Name = input.nextLine();
            System.out.print("Enter Teacher's Salary: ");
            this.Salary = input.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("You Have Entered A wrong Input!");
        }finally {
            input.close();
        }
        System.out.println(this);

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
