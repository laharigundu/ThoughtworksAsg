package tw.collections;

import java.util.HashSet;
import java.util.Scanner;

public class StudentRecord {
    HashSet<Student> studentHashSet = new HashSet<>();
    Scanner scan = new Scanner(System.in);
    void addStudent() {
        int studentRegNo;
        String studentName;
        int studentStandard;
        String studentSection;
        System.out.println("Enter regNo");
        studentRegNo = scan.nextInt();
        System.out.println("Enter name");
        studentName = scan.next();
        System.out.println("Enter standard");
        studentStandard = scan.nextInt();
        System.out.println("Enter section");
        studentSection = scan.next();
        boolean flag = false;
        for (Student student : studentHashSet) {
            if (student.getStudentRegNo() == studentRegNo) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            Student student = new Student(studentRegNo, studentName, studentStandard, studentSection);
            studentHashSet.add(student);
        } else {
            System.out.println("RegNo is already in the database");
        }
    }
    void removeStudent() {
        int studentRegNo;
        System.out.println("Enter regNo");
        studentRegNo = scan.nextInt();
        studentHashSet.removeIf(student -> student.getStudentRegNo() == studentRegNo);
    }
    void updateStudent() {
        int studentRegNoToCheck;
        int studentRegNo;
        String studentName;
        int studentStandard;
        String studentSection;
        System.out.println("Enter regNo");
        studentRegNoToCheck = scan.nextInt();
        System.out.println("Enter regNo");
        studentRegNo = scan.nextInt();
        System.out.println("Enter name");
        studentName = scan.next();
        System.out.println("Enter standard");
        studentStandard = scan.nextInt();
        System.out.println("Enter section");
        studentSection = scan.next();
        for (Student student : studentHashSet) {
            if (student.getStudentRegNo() == studentRegNoToCheck) {
                studentHashSet.remove(student);
                Student student1 = new Student(studentRegNo, studentName, studentStandard, studentSection);
                studentHashSet.add(student1);
                break;
            }
        }
    }
    void printStudentRecords() {
        for (Student student : studentHashSet) {
            System.out.println("student RegNo : " + student.getStudentRegNo() + " student Name : " + student.getStudentName()
                    + " student standard : " + student.getStudentStandard() + " student section : " + student.getStudentSection());
        }
    }
}
