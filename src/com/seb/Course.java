package com.seb;

public class Course extends Person {

    private String courseName;
    private int courseID;

    public Course(){

        super();
        courseID = 101;
        courseName = "";
    }

    public Course(String courseName, int courseID){
        this.courseName = courseName;
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }


    public String getDescription(){
        return " Course Name: " + courseName + "\n" +
                " Course ID: " + courseID + ".";
    }
}
