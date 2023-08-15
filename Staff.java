public class Staff extends Person {
    private String school;
    private double pay;

    Staff(String name, String address, String school, double pay){
        super.Person(name, address);
        this.school = school;
        this.pay = pay;
    }

    String getSchool() {
        return school;
    }

    void setSchool(String school) {
        this.school = school;
    }

    String getPay() {
        return school;
    }

    void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff[name = " +
                this.getName() +
                ", address = " +
                this.getAddress() +
                ", school = " +
                school +
                ", pay = " +
                pay +
                "]";
    }
}
