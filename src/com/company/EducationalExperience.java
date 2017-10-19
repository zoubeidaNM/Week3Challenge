package com.company;

public class EducationalExperience {
    private String schoolName;
    private String yearCompletetion;
    private String degree;
    private String gpa;

    public EducationalExperience(String schoolName, String yearCompletetion, String degree, String gpa) {
        this.schoolName = schoolName;
        this.yearCompletetion = yearCompletetion;
        this.degree = degree;
        this.gpa = gpa;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getYearCompletetion() {
        return yearCompletetion;
    }

    public void setYearCompletetion(String yearCompletetion) {
        this.yearCompletetion = yearCompletetion;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "EducationalExperience{" +
                "schoolName='" + schoolName + '\'' +
                ", yearCompletetion='" + yearCompletetion + '\'' +
                ", degree='" + degree + '\'' +
                ", gpa='" + gpa + '\'' +
                '}';
    }

    public String write(){
        return degree + ",\n" +
                schoolName + ", " + yearCompletetion + "\n";
    }
}
