package salary;

public abstract class worke {

	    int employeeId;
	    String employeeName;
	    double salary;
	 
	    public worke(int employeeId, String employeeName, double salary) {
	        super();
	        this.employeeId = employeeId;
	        this.employeeName = employeeName;
	        this.salary = salary;
	    }
	 
	    public int getEmployeeId() {
	        return employeeId;
	    }
	    public void setEmployeeId(int employeeId) {
	        this.employeeId = employeeId;
	    }
	    public String getEmployeeName() {
	        return employeeName;
	    }
	    public void setEmployeeName(String employeeName) {
	        this.employeeName = employeeName;
	    }
	    public double getSalary() {
	        return salary;
	    }
	    public void setSalary(double salary) {
	       this.salary = salary;
	    }
	}
	 
