package projectTask;

public class fullTime {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}
    public static final double day=5;
    
    public fullTime(int id, String name,double salary1) {
        super(id, name, salary1);        
    }
 
    public double getSalary() {
 
        double salary1 =15;
		return salary1+salary1*day;
    }
}
