public class Student {
    private String name;
    private int credits;
    private double gpa;
    public Student(String name, int credits, double gpa) {
        this.name = name;
        this.credits = credits;
        this.gpa = gpa;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCredits() {
        return credits;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public void addCredits(int additionalCredits) {
        this.credits += additionalCredits;
    }
    public void updateGpa(double newGpa) {
        this.gpa = newGpa;
    }
    public boolean isHonors(){
        return this.gpa >= 3.5;
    }
    public String toString(){
        return "student{name='"+name+"',credits="+credits+",gpa="+gpa+"}";
    }
}
