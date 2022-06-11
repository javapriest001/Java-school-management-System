package com.schoolmanagement;

import java.util.Scanner;

public class Main {
    static Student student;
    static Teacher teacher;
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

//       Teacher teacher1 = new Teacher("Vincent" , 20000);
//
//       Student student1 = new Student("Student student" , 2333, 2332);
//
////        System.out.println(teacher1);
//        School school = new School(student1 , teacher1);
//        System.out.println(school);


        int num;
        do {
            System.out.print("Number Of Users (Number Must be Greater Than 1) : ");
             num = scanner.nextInt();
        }while( num < 2);
        for (int n = 0; n < num; n++){
            createUser();
        }

        School school = new School(student, teacher);

    }

    public static void  createUser(){
        System.out.print("Create A User(Select 1  for Student || Select 2  for Teacher): ");
        int user = scanner.nextInt();
        if(user == 1){
            System.out.print("Name Of Student: ");
            String studentName = scanner.nextLine();
            scanner.nextLine();
            System.out.print("Amount Paid By Student: ");
            int AmtPaid = scanner.nextInt();
            System.out.print("Total Amount: ");
            int totalAmt = scanner.nextInt();
            student = new Student(studentName ,AmtPaid , totalAmt);
        } else if (user == 2) {
            System.out.print("Name Of Teacher: ");
            String teacherName = scanner.nextLine();
            scanner.nextLine();

            System.out.print("Teacher's Salary: ");
            int salary = scanner.nextInt();


            teacher = new Teacher(teacherName ,salary);
        } else {
            System.out.println("This User Cannot be Created");
        }


    }


    }

