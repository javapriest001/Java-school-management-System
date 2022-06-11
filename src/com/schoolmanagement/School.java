package com.schoolmanagement;

public class School {
    Student students;
    Teacher teachers;
    private int AmountEarned;
    private int AmountSpent;

    School(Student student , Teacher teacher){
        this.students = student;
        this.teachers = teacher;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                ", teachers=" + teachers +
                '}';
    }
}
