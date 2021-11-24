package tw.collections;

import java.util.HashSet;
import java.util.Scanner;

public class StudentDatabaseAccess {
    public static void main(String[] args) {
        HashSet<Student> studentHashSet = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        int option;
        System.out.println("Are you admin or staff ? Press 1 if you are admin Press 2 if you are staff Press 3 if you want to exit");
        option = scan.nextInt();
        while (option != 3) {
            if (option == 1) {
                System.out.println("Press 1 if you want to add student \n Press 2 if you want to remove student \n Press 3 if you want to update student details");
                int operation = scan.nextInt();
                if (operation == 1) {
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
                } else if (operation == 2) {
                    int studentRegNo;
                    System.out.println("Enter regNo");
                    studentRegNo = scan.nextInt();
                    studentHashSet.removeIf(student -> student.getStudentRegNo() == studentRegNo);
                } else {
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
            } else {
                for (Student student : studentHashSet) {
                    System.out.println("student RegNo : " + student.getStudentRegNo() + " student Name : " + student.getStudentName()
                            + " student standard : " + student.getStudentStandard() + " student section : " + student.getStudentSection());
                }
            }
            System.out.println("Are you admin or staff ? Press 1 if you are admin Press 2 if you are staff Press 3 if you want to exit");
            option = scan.nextInt();
        }
    }
}
