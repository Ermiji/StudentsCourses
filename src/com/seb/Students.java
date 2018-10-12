package com.seb;

public class Students extends Person{

    private String studentCourse;

    public Students(){
        super();
        studentCourse = "";

    }

    public Students(String studentCourse){
        this.studentCourse = studentCourse;
    }

    public String getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(String courseTaking) {
        this.studentCourse = studentCourse;
    }

    @Override
    public String getDescription(){
        return " Course Name: " + studentCourse;
    }

}
