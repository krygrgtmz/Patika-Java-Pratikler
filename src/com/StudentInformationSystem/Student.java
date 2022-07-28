package com.StudentInformationSystem;

public class Student {
    Course math;
    Course dataStructures;
    Course oop;
    String name;
    String studentNo;
    int classes;
    double average;
    boolean isPass;

    Student(String name, String studentNo, int classes, Course math, Course dataStructures, Course oop) {
        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.math = math;
        this.dataStructures = dataStructures;
        this.oop = oop;
        calcAverage();
        this.isPass = false;
    }

    public void addBulkVerbalGrade(int mathVerbal, int dataStructuresVerbal, int oopVerbal){
        if (mathVerbal >= 0 && mathVerbal <= 100) {
            this.math.verbalGrade = mathVerbal;
        }
        if (dataStructuresVerbal >= 0 && dataStructuresVerbal <= 100) {
            this.dataStructures.verbalGrade = dataStructuresVerbal;
        }
        if (oopVerbal >= 0 && oopVerbal <= 100) {
            this.oop.verbalGrade = oopVerbal;
        }
    }

    void addBulkFinalGrade(int mathGrade, int dataStructuresGrade, int oopGrade) {
        if(mathGrade >= 0 && mathGrade <= 100){
            this.math.grade = mathGrade;
        }
        if(dataStructuresGrade >= 0 && dataStructuresGrade <= 100){
            this.dataStructures.grade = dataStructuresGrade;
        }
        if(oopGrade >= 0 && oopGrade <= 100){
            this.oop.grade = oopGrade;
        }
    }

    public void calcAverage() {
        double mathAverage = this.math.grade * 0.8 + this.math.verbalGrade * 0.2;
        double dataStructuresAverage = this.dataStructures.grade * 0.8 + this.dataStructures.verbalGrade * 0.2;
        double oopAverage = this.oop.grade * 0.8 + this.oop.verbalGrade * 0.2;
        double GPA = (mathAverage + dataStructuresAverage + oopAverage) / 3;
        this.average = Math.round(GPA * 100) / 100d;
    }

    public boolean isCheckPass(){
        calcAverage();
        return this.average > 55;
    }

    void isPass() {
        if(this.math.grade == 0 || this.dataStructures.grade == 0 || this.oop.grade == 0) {
            System.out.println("Please complete the missing grades.");
        } else {
            this.isPass = isCheckPass();
            printGrade();
            System.out.println("Average : " + this.average);
            if(this.isPass){
                System.out.println("Class is passed.");
            }else{
                System.out.println("Class is failed.");
            }
        }
    }

    void printGrade() {
        System.out.println("===================================");
        System.out.println("Student Name : " + this.name);
        System.out.println("Student Number : " + this.studentNo);
        System.out.println("Student Class : " + this.classes);
        System.out.println(this.math.name + " Final Grade : " + this.math.grade);
        System.out.println(this.math.name + " Verbal Grade : " + this.math.verbalGrade);
        System.out.println(this.dataStructures.name + " Final Grade : " + this.dataStructures.grade);
        System.out.println(this.dataStructures.name + " Verbal Grade : " + this.dataStructures.verbalGrade);
        System.out.println(this.oop.name + " Final Grade : " + this.oop.grade);
        System.out.println(this.oop.name + " Verbal Grade : " + this.oop.verbalGrade);
    }

}
