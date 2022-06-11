package com.schoolmanagement;

public class School {
    Student students;
    Teacher teachers;
    private int AmountEarned;
    private int AmountSpent;

    School(Student student , Teacher teacher){
        this.students = student;
        this.teachers = teacher;
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                ", teachers=" + teachers +
                ", AmountEarned=" + AmountEarned +
                ", AmountSpent=" + AmountSpent +
                '}';
    }
}
