class Lion extends Animal {
	//Adding type as class attribute
	String type = "";

	public Lion(int numTeeth,boolean spots,int weight) {
		super(numTeeth,spots,weight);
			type(weight);
	}
	public String type(int weight) {
		super.setWeight(weight);
		if(getWeight() < 80) {
			type = "Cub";
		}
		if(getWeight() >= 120) {
			type = "Male";
		}
		if(getWeight() < 120 && getWeight() >= 80) {
			type = "Female";
		}
		return type;
	    }
		public String toString() {
			String output = "Animal = Lion";
			output += "\nNumber of teeth ? " + getNumTeeth();
			output += "\nDoes the lion have spots ? " + getSpots();
			output += "\nHow much does the lion weigh ? " + getWeight() +"Kg";
			output += "\nType of Lion ? " + type;
			return output;
		}
			

}
