package com.seb;

public class Teachers extends Person{

    private String teacherCourse;

    public Teachers(){
        super();
        teacherCourse = "";
    }

    public Teachers(String teacherCourse){
        this.teacherCourse = teacherCourse;
    }

    public String getTeacherCourse() {
        return teacherCourse;
    }

    public void setTeacherCourse(String teacherCourse) {
        this.teacherCourse = teacherCourse;
    }

    @Override
    public String getDescription(){
        return " Course Name: " + teacherCourse;
    }
}
