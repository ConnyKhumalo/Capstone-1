 class Cheetah extends Animal {
	 public Cheetah(int numTeeth,boolean spots,int weight) {
		 super(numTeeth,spots,weight);
	 }
	 public static int getNuTeeth(int numTeeth) {
		 return numTeeth;
		 
	 }
	 public String toString() {
		    String output = "Animal = Cheetah";
			output += "\nNumber of teeth ? " + getNumTeeth();
			output += "\nDoes the cheetah have spots ? " + getSpots();
			output += "\nHow much does the cheetah weigh ? " + getWeight() +"Kg";
			return output;
	 }

}
