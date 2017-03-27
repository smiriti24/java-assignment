
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
    	return "name : "+ name+ "\n"+ "skill : "+ skill+ "\n"+"experience : "+ exp;


    }
}

class HrEmployee extends Employee{
	private String department;
	public HrEmployee(){

	}
	public HrEmployee(String name , String skill, int exp, String department){
		super(name, skill, exp);
		this.department = department;

	}
	public String toString(){
    	return "name : "+ getName()+ "\n"+ "skill : "+ getSkill()+ "\n"+"experience : "+ getExp()+"\n"+"department : "+ department;


    }

}
class InheritanceExample{
	  public static void main( String args[]){
HrEmployee emp1 = new HrEmployee("smiriti", "software",2, "HR");
System.out.println(emp1);


	  }



}

