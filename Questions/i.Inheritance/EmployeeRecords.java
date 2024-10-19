import employeeList.*;
public class EmployeeRecords {
    public static void main(String[] args) {
        PermanentEmployee emp1 = new PermanentEmployee();
        emp1.setName("Anil");
        emp1.setEmpId(101);
        emp1.setBasicPay(10000);
        emp1.setHra(1500);
        emp1.setExperience(3);
        emp1.calculateSalary();

        ContractEmployee emp2 = new ContractEmployee();
        emp2.setName("Ankit");
        emp2.setEmpId(102);
        emp2.setWages(500);
        emp2.setHours(10);
        emp2.calculateSalary();
    }
}