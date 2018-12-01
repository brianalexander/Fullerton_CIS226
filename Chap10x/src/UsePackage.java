// UsePackage.java
// Brian Alexander
// 11/30/2018



public class UsePackage {

	public static void main(String[] args) {
		//Packages
		Package pack1 = new Package(4, 'A');
		Package pack2 = new Package(10, 'T');
		Package pack3 = new Package(20, 'M');
		
		System.out.println("Packages:");
		pack1.display();
		pack2.display();
		pack3.display();
		
		InsuredPackage inPack1 = new InsuredPackage(4, 'A');
		InsuredPackage inPack2 = new InsuredPackage(10, 'T');
		InsuredPackage inPack3 = new InsuredPackage(20, 'M');
		
		System.out.println("Insured Packages:");
		inPack1.display();
		inPack2.display();
		inPack3.display();
	}

}
