package employeeList;
public class PermanentEmployee extends Employee {
    private double basicPay;
    private double hra;
    private int experience;

    public double getBasicPay() {
        return basicPay;
    }
    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public double getHra() {
        return hra;
    }
    public void setHra(double hra) {
        this.hra = hra;
    }

    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    } 

    public void calculateSalary() {
        double variableComponent = 0.0;
        if(this.experience<3) {
            variableComponent = (this.basicPay*0)/100;
        } else if(this.experience>=3 && this.experience<5) {
            variableComponent = (this.basicPay*5)/100;
        } else if(this.experience>=5 && this.experience<10) {
            variableComponent = (this.basicPay*7)/100;
        } else if(this.experience>=10) {
            variableComponent = (this.basicPay*12)/100;
        }
        setSalary(variableComponent+basicPay+hra);
        System.out.println("Permanent Employee: Your salary is: "+getSalary());
    }
}
