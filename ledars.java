package projectTask;

public abstract class ledars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		partTime d1=new partTime(1,"haya" ,5);
		partTime d2=new partTime(2,"moath" ,10);
		fullTime m1=new fullTime(1,"rashed" ,5);
		fullTime m2=new fullTime(2,"ahmad" ,10);
 
        System.out.println("Name of Employee:" +d1.getName()+"---"+"Salary:"+d1.getSalary());
        System.out.println("Name of Employee:" +d2.getName()+"---"+"Salary:"+d2.getSalary());
        System.out.println("Name of Employee:" +m1.getName()+"---"+"Salary:"+m1.getSalary());
        System.out.println("Name of Employee:" +m2.getName()+"---"+"Salary:"+m2.getSalary());

	}

}
