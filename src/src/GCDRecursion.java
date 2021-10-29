public class GCDRecursion {

	public static void main(String[] args) {
		int x = 366;
		int y = 60;
		int gdc = gdc(x,y);
		System.out.println("The GDC of "+ x  +" and "+ y +" is " + gdc );
	}
	//Calculating the GDC of two numbers using a loop
	public static int gdc(int x,int y) {
		if(y != 0) 
			return gdc(y,x % y);
		else
			return x;
	}

}
