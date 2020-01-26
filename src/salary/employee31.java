package salary;


public abstract class employee31 {
	 
	  public static void main(String[] args) {
	        fullTime d1=new fullTime(1,"haya" ,30);
	        fullTime d2=new fullTime(2,"rashed" ,30);
	        partTime m1=new partTime(1,"muath" ,48);
	        partTime m2=new partTime(2,"ahmad" ,48);
	 
	        System.out.println("Name of Employee:" +d1.getEmployeeName()+"---"+"Salary:"+d1.getSalary());
	        System.out.println("Name of Employee:" +d2.getEmployeeName()+"---"+"Salary:"+d2.getSalary());
	        System.out.println("Name of Employee:" +m1.getEmployeeName()+"---"+"Salary:"+m1.getSalary());
	        System.out.println("Name of Employee:" +m2.getEmployeeName()+"---"+"Salary:"+m2.getSalary());
	    }
	}
