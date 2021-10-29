public class Teacher {
	//Attributes
	String gender;
	String name;
	String surname;
	long cellnumber;
	int age;
	//Constructor
	public Teacher(String gender,String name,String surname,long cellnumber,int age) {
		this.gender = gender;
		this.name = name;
		this.surname = surname;
		this.cellnumber = cellnumber;
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
	public Long getCellnumber() {
		return cellnumber;
	}
	public int getAge() {
		return age;
	}
    public String toString() {
    	String work =  "Gender = " + gender;
    	work +=  "\nName = " + name;
    	work += "\nSurname = " + surname;
    	work += "\nCellnumber = " + cellnumber;
    	work +=  "\nAge = " + age;
    	return work;
    }

}	