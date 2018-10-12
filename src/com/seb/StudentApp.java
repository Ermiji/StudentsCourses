package com.seb;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {

        ArrayList<Students> pupillist = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        int idNumber;
        String fName;
        String lName;
        String response = "n";
        String eAddress;
//        String courseName;

        do{
            System.out.print("Work line of (Students, Teachers): ");
            String workline = scan.nextLine();

            switch(workline){
                case "Students":
                    System.out.print("Enter Student's ID number: ");
                    idNumber = scan.nextInt();
                    System.out.print("Enter Student's first name: ");
                    fName = scan.nextLine();
                    scan.nextLine();

                    System.out.print("Enter Studdent's last name: ");
                    lName = scan.nextLine();
                    System.out.print("Enter Student's Email name: ");
                    eAddress = scan.nextLine();

                    System.out.print("Enter the course that a student takes: ");
                    String studentCourse = scan.nextLine();

                    System.out.println("Student: ");
                    Students s = new Students(studentCourse);
                    s.setIdNumber(idNumber);
                    s.setfName(fName);
                    s.setlName(lName);
                    s.seteAddress(eAddress);


                    pupillist.add(s);
                    System.out.println(s);

                    break;


                case "Teachers":
                    System.out.print("Enter Teacher's ID number: ");
                    idNumber = scan.nextInt();
                    System.out.print("Enter Teacher's first name: ");
                    fName = scan.nextLine();
                    scan.nextLine();

                    System.out.print("Enter Teacher's last name: ");
                    lName = scan.nextLine();
                    System.out.print("Enter Teacher's Email name: ");
                    eAddress = scan.nextLine();
                    System.out.print("Enter the course that a teacher teaches: ");
                    String teacherCourse = scan.nextLine();

                    System.out.println("Teachers: ");
                    Teachers ts = new Teachers(teacherCourse);
                    ts.setIdNumber(idNumber);
                    ts.setfName(fName);
                    ts.setlName(lName);
                    ts.seteAddress(eAddress);

//                    pupillist.add(ts);
                    System.out.println(ts);

                    break;

                default:
                    System.out.println("Irrelevant Subject");
                    break;


            }

            System.out.println("Do you want to enter another Student/Teacher? (y/n): ");
            response = scan.nextLine();
        }while(response.equalsIgnoreCase("y"));

        for(int i = 0; i < pupillist.size(); i++){
            System.out.println(pupillist.get(i));

        }
    }
}
