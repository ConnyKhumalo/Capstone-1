public class Secretary {
	//Attributes
	String gender;
	String name;
    String surname;
    int salary;
    int age;
    //Constructor
	public Secretary(String gender, String name, String surname, int salary, int age ) {
		this.gender = gender;
    	this.name = name;
    	this.surname = surname;
    	this.salary = salary;
    	this.age = age;	
	}
	public String getGender() {
		return gender;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public int getSalary() {
		return salary;
	}
	public int getAge() {
		return age;
	}
    public String toString() {
    	String work =  "Gender = " + gender;
    	work +=  "\nName = " + name;
    	work += "\nSurname = " + surname;
    	work += "\nSalary = " + salary;
    	work +=  "\nAge = " + age;
    	return work;
    }
    
}   

