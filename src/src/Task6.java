public class Task6 {

	public static void main(String[] args) {
		Secretary mpho = new Secretary("F","Mpho","Dlamini",8000,34);
		Secretary bobo = new Secretary("M","Bobo","Dlamini",5000,21);
		Secretary john = new Secretary("M","John","Muhle",9000,34);
		Teacher lihle = new Teacher("M","Lihle","Peterson",0457362526,45);
		Teacher don = new Teacher("M","Done","Peterson",04535662526,25);
		Teacher doris = new Teacher("F","Doris","Peterson",0455362526,25);
		
		System.out.println("Secretarys\n");
		System.out.println(mpho.toString() + "\n");
		System.out.println(bobo.toString() + "\n");
		System.out.println(john.toString() + "\n");
		System.out.println("Teachers\n");
		System.out.println(lihle.toString() + "\n");
		System.out.println(don.toString() + "\n");
		System.out.println(doris.toString());
	}
	

}
