package com.schoolmanagement;

public class Main {
    public static void main(String[] args) {
        //Instantiate the StudenT Class
        Student student = new Student();
        //Instantiate the teacher Class
        Teacher teacher = new Teacher();



       School school = new School(student, teacher);
    }
}
