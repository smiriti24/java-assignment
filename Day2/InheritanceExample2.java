class Address{
String city;
String area;
String pincode;

public Address( String city, String area, String pincode){
	this.city = city;
		this.area = area;
		this.pincode = pincode;

}
public String getCity(){
		return city;
	}
    public void setCity(String city){
    	this.city = city;
 }   
    public String getArea(){
		return area;
	}
    public void setArea(String area){
    	this.area= area;
    }
    public String getPincode(){
		return pincode;
	}
    public void setPincode(String pincode){
    	this.pincode = pincode;
    }
    public String toString(){
    	return "["+area+" ,"+city+" ,"+pincode+" ]";


    }


}
class Employee{
	private String name;
	private String skill;
	private  int exp;
	private Address address;
	public Employee(){
	}
	public Employee(String name , String skill , int exp){
		this.name = name;
		this.skill = skill;
		this.exp = exp;
	}
	public Employee(String name , String skill , int exp , Address address){
		this.name = name;
		this.skill = skill;
		this.exp = exp;
		this.address= address;
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
    public Address getAddress(){
		return address;
	}
    public void setAddress(Address address){
    	this.address = address;
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
	public HrEmployee(String name , String skill, int exp, String department, Address address){
		super(name, skill, exp, address);
		this.department = department;


	}
	public String toString(){
    	return "name : "+ getName()+ "\n"+ "skill : "+ getSkill()+ "\n"+"experience : "+ getExp()+"\n"+"department : "+ department+"\n"+"Address : "+ getAddress();


    }

}
class InheritanceExample2{
	  public static void main( String args[]){
	  	Address add1 = new Address("delhi","janakpuri","110058");  
HrEmployee emp1 = new HrEmployee("smiriti", "software",2, "HR", add1);
System.out.println(emp1);


	  }



}

