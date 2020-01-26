package salary;

public class fullTime extends worke{ 
    public static final double huors=5;
 
    public fullTime(int employeeId, String employeeName, double salary) {
        super(employeeId, employeeName, salary);        
    }
 
    public double getSalary() {
 
        return salary+salary*huors;
    }
}

