public class Staff extends Person {

    private String school = "";
    private double pay = 0.0;

    public Staff() {
    }

    public Staff(String name, String address) {
        this.school = school;
        this.pay = pay;
    }

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " Address: " + getAddress() + "Staff{" +
                "school='" + school + '\'' +
                ", pay=" + pay +
                '}';
    }
}
