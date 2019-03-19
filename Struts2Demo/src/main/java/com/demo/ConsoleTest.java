package com.demo;

import com.demo.models.StudentModel;

public class ConsoleTest {
    public static void main(String[] args) {
        StudentModel studentModel = new StudentModel();
//        studentModel.findAll().forEach(student -> System.out.println(student));

        System.out.println(studentModel.findByUsername("student01"));
    }
}
