public class Persons {
	//Attributes
		String name;
		long telephone;
		String email_address;
		String physical_address;
		//Constructors
		public Persons(String name,long telephone,String email_address,String physical_address)  {
			
			this.name = name;
			this.telephone = telephone;
			this.email_address = email_address;
			this.physical_address = physical_address;
		}
		//Methods
		public String getName() {
			return name;
		}
		public long getTelephone() {
			return telephone;
		}
		public String getEmailAddress() {
			return email_address;
		}
		public String getPhysicalAddress() {
			return physical_address;
		}
		public String toString() {
			String info =  "Name = " + name;
			info +=  "\nTelephone = " + telephone;
			info += "\nEmail address = " + email_address;
			info += "\nPyhsical address = " + physical_address;
			return info;
		}
	}





