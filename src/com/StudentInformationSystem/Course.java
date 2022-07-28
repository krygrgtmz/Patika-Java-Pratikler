package com.StudentInformationSystem;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int grade;
    int verbalGrade;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int grade = 0;
        int verbalGrade = 0;
    }

    void addTeacher(Teacher teacher) {
        if (this.prefix.equals(teacher.branch)) {
            this.courseTeacher = teacher;
            System.out.println("Assignment is successful.");
        } else {
            System.out.println("Assignment is NOT successful due to incompatible input. Please try again.");
        }
    }

    void printTeacher() {
        if (courseTeacher != null) {
            System.out.println("Course : " + this.name + " , " + "Instructor : " + courseTeacher.name);
        } else {
            System.out.println("Course : " + this.name + " , " + "Instructor : None");
        }
    }




}
