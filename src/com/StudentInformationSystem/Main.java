package com.StudentInformationSystem;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Hande Türkmen" , "11111" , "MAT");
        Teacher t2 = new Teacher("Elif Aksakal" , "22222" , "DTS");
        Teacher t3 = new Teacher("Tolga Özhan" , "33333" , "OOP");

        Course math = new Course("Mathematics I" , "101" , "MAT");
        Course dataStructures = new Course("Data Structures" , "102" , "DTS");
        Course oop = new Course("Object Oriented Programming" , "103" , "OOP");

        math.addTeacher(t1);
        dataStructures.addTeacher(t2);
        oop.addTeacher(t3);

        Student s1 = new Student("Koray Gerigitmez", "101226", 4, math, dataStructures, oop);
        s1.addBulkFinalGrade(100, 90, 80);
        s1.addBulkVerbalGrade(100,100,100);
        s1.isPass();

        Student s2 = new Student("Koray Gerigider", "101227", 2, math, dataStructures, oop);
        s2.addBulkFinalGrade(20, 10, 30);
        s2.addBulkVerbalGrade(50,50,20);
        s2.isPass();

        Student s3 = new Student("Koray Gerigötürmez", "101228", 3, math, dataStructures, oop);
        s3.addBulkFinalGrade(80, 60, 40);
        s3.addBulkVerbalGrade(100,70,0);
        s3.isPass();

    }
}
