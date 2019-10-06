package com.hank.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
//        userInput();
        Student stu = new Student("Tom",77,99);
        stu.print();
        System.out.println("hight score"+"\t"+stu.hight());
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter syudent's name:");
        String name = scanner.next();
        System.out.println("Please enter syudent's english:");
        int engilsh = scanner.nextInt();
        System.out.println("Please enter syudent's math:");
        int math = scanner.nextInt();
        Student stu = new Student(name,engilsh,math);
        stu.print();
        System.out.println("hight score"+"\t"+stu.hight());
    }
}
