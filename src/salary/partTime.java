package salary;

public class partTime extends worke{
	 
    public static final double day=15;
    public partTime(int employeeId, String employeeName, double salary) {
        super(employeeId, employeeName, salary);
    }
    public double getSalary() {
        return salary+salary*day;
    }
}
