package com.vsm.enroller;

import com.vsm.enroller.Course.Courses;
import com.vsm.enroller.Person.Gender;

public class Main {
    public static void main(String[] args) {
        EnrolleeManager manager = new EnrolleeManager();

        Student student1 = new Student(
            "WKWKKWKKWWKKW", Gender.Female,
            2, 9, 2004,
            "Roxas City", "WKKWKWWKKW@example.com", "0917-123-4567",
            Courses.BSCE, 3
        );

        Student student2 = new Student(
            "Chris Jhon", Gender.Male,
            18, 1, 2003,
            "Kalibo", "cj@example.com", "0920-987-6543",
            Courses.BSIT, 2
        );

        manager.addEnrollee(student1);
        manager.addEnrollee(student2);

        for (Enrollee enrollee : manager.enrollees) {
            if (enrollee instanceof Student student) {
                System.out.println("===================================");
                System.out.println("Name: " + student.getName());
                System.out.println("Gender: " + student.getGender());
                System.out.println("Birthday: " + student.getBirthday());
                System.out.println("Age: " + student.getAge());
                System.out.println("Address: " + student.getAddress());
                System.out.println("Email: " + student.getEmail());
                System.out.println("Phone: " + student.getPhone());
                System.out.println("Enrollment Status: " + student.getEnrollmentStatus());
                student.showRole();
            }
        }

        int idToRemove = student1.getEnrollmentID();
        manager.removeEnrollee(idToRemove);
        System.out.println("\nStudent with ID " + idToRemove + " removed.");

        Enrollee removed = manager.getEnrollee(idToRemove);
        if (removed == null) {
            System.out.println("Verified: Student not found in the list.");
        }
    }
}
