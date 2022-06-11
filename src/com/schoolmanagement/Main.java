package com.schoolmanagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       School school = new School(createStudent(scanner), createTeacher(scanner));


    }

    public static Student createStudent(Scanner scanner){
        System.out.print("Name Of Student: ");
        String studentName = scanner.nextLine();

        System.out.print("Amount Paid By Student: ");
        int AmtPaid = scanner.nextInt();

        System.out.print("Total Amount: ");
        int totalAmt = scanner.nextInt();
        return new Student(studentName ,AmtPaid , totalAmt);

    }
    public static Teacher createTeacher(Scanner scanner){
        System.out.print("Name Of Teacher: ");
        String teacherName = scanner.nextLine();

        System.out.print("Teacher's Salary: ");
        int salary = scanner.nextInt();


        return new Teacher(teacherName ,salary);
    }



}
