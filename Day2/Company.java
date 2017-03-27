class Employee{
	private String name;
	private String skill;
	private  int exp;
	public Employee(){
	}
	public Employee(String name , String skill , int exp){
		this.name = name;
		this.skill = skill;
		this.exp = exp;
	}
	public String getName(){
		return name;
	}
    public void setName(String name){
    	this.name = name;
 }   
    public String getSkill(){
		return skill;
	}
    public void setSkill(String skill){
    	this.skill = skill;
    }
    public int getExp(){
		return exp;
	}
    public void setExp(int exp){
    	this.exp = exp;
    }
    public String toString(){
    	//return name+ "\n"+ skill+ "\n"+ exp;
    	return "name : "+ name+ "\n"+ "skill : "+ skill+ "\n"+"experience : "+ exp;


    }
}

class Company{
	public static void main(String args[]){

		Employee emp1 = new Employee("smiriti", "software engineer", 1);
		Employee emp2 = new Employee("aditi", "production support", 2);
		System.out.println(emp1);
		Employee emp3 = new Employee();
		emp3.setName("sanju");
		emp3.setSkill("aps");
		emp3.setExp(3);
		System.out.println(emp3);


	}
}
