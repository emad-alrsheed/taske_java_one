package projectTask;

public class employee {
	private  String name;
	private int id;
	
	
	
	public employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}



	protected employee(int id2, String name2, double salary1) {
		// TODO Auto-generated constructor stub
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}

}
