package org.example;

public class Education {

    public Education(String degree, String major, int research){
        this.degree = degree;
        this.major = major;
        this.research = research;
    }

    public Education(Education education){
        this.degree = education.degree;
        this.major = education.major;
        this.research = education.research;
    }


    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getResearch() {
        return research;
    }

    public void setResearch(int research) {
        this.research = research;
    }

    private String degree;
    private String major;
    private int research;
}
