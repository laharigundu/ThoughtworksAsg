package tw.collections;

import java.util.Scanner;

public class StudentDatabaseAccess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudentRecord studentRecord = new StudentRecord();
        int option;
        System.out.println("Are you admin or staff ? Press 1 if you are admin Press 2 if you are staff Press 3 if you want to exit");
        option = scan.nextInt();
        while (option != 3) {
            if (option == 1) {
                System.out.println("Press 1 if you want to add student \n Press 2 if you want to remove student \n Press 3 if you want to update student details");
                int operation = scan.nextInt();
                if (operation == 1) {
                    studentRecord.addStudent();
                } else if (operation == 2) {
                    studentRecord.removeStudent();
                } else {
                    studentRecord.updateStudent();
                }
            }
            else {
                studentRecord.printStudentRecords();
            }
            System.out.println("Are you admin or staff ? Press 1 if you are admin Press 2 if you are staff Press 3 if you want to exit");
            option = scan.nextInt();
        }
    }
}
