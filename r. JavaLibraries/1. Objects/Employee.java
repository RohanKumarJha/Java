public class Employee {
    private int empNo;
    private String empName;
    
    Employee(int empNo,String empName) {
        super();
        this.empNo = empNo;
        this.empName = empName;
    }

    public String toString() {
        return "EmpNo : "+empNo+", EmpName : "+empName;
    }

    public int hashCode() {
        return empNo;
    }

    public boolean equals(Employee obj) {
        if(empNo == obj.empNo) {
            if(empName == obj.empName) {
                return true;
            }
        } return false;
    }
}