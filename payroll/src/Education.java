public class Education {
    public Education(){}

    public Education(string degree, string major int research){
        this.degree = degree;
        this.mojor = major;
        this.reserch = research;

    }
    public Education(Education education){
        this.degree = education.degree;
        this.major = education.major;
        this.reserch = education.resarch;
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

    public void setResrarch(int research) {
        this.research = research;
    }

    private String degree;
    private String major;
    private int research;
}
