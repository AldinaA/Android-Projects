package com.example.RetrofitJSONExample;

public class RecyclerData {
    // string variables for our data
    // make sure that the variable name
    // must be similar to that of key value
    // which we are getting from our json file.
    private String courseName;
    private String courseimg;
    private String courseMode;
    private String courseTracks;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseimg() {
        return courseimg;
    }

    public void setCourseimg(String courseimg) {
        this.courseimg = courseimg;
    }

    public String getCourseMode() {
        return courseMode;
    }

    public void setCourseMode(String courseMode) {
        this.courseMode = courseMode;
    }

    public String getCourseTracks() {
        return courseTracks;
    }

    public void setCourseTracks(String courseTracks) {
        this.courseTracks = courseTracks;
    }

    public RecyclerData(String courseName, String courseimg, String courseMode, String courseTracks) {
        this.courseName = courseName;
        this.courseimg = courseimg;
        this.courseMode = courseMode;
        this.courseTracks = courseTracks;
    }
}
