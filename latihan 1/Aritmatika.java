import java.util.Scanner;

public class Aritmatika {
    public static void main(String[] agrs) {
    
	
	    int bilbul1;
	    int bilbul2;
	
	
	    Scanner nilai = new Scanner(System.in);
	    
	    System.out.print("masukan bilangan bulat 1 : ");
	    bilbul1 = nilai.nextInt();
	     
	    System.out.print("masukan bilangan bulat 2 : ");
	    bilbul2 = nilai.nextInt();
	
	    System.out.print("masukan bilangan pecahan : ");
	    float pecahan = nilai.nexFloat();
	
	    System.out.print("masukan bilangan bolean 1 : ");
	    boolean kondisi1 = nilai.nextBoolean();
	
	    System.out.print("masukan bilangan bolean 2 : ");
	    boolean kondisi2 = nilai.nextBoolean();
		
		float hasil1;
		float hasil2;
		float hasil3;
		float hasil4;
		float hasil5;
		float hasil6;
		float hasil7;
		float hasil8;
		float hasil9;
		float hasil10;
		
		hasil1 = bilbul1 + bilbul2;
		System.out.print("hasil penjumlahan bilangan bulat = " + hasil);
		
		hasil2 = bilbul1 - bilbul2;
		System.out.print("hasil pengurangan bilangan bulat = " + hasil2);
		
		hasil3 = bilbul1 * bilbul2;
		System.out.print("hasil perkalian bilangan bulat = " + hasil3);
		
		hasil4 = bilbul1 / bilbul2;
		System.out.print("hasil pembagian bilangan bulat = " + hasil4);
		
		hasil5 = bilbul1 & bilbul2;
		System.out.print("hasil sisabagi bilangan bulat = " + hasil5);
		
		hasil6 = bilbul1 + pecahan;
		System.out.print("hasil penjumlahan bilangan bulat dengan pecahan = " + hasil6);
		
		hasil7 = bilbul1 - pecahan;
		System.out.print("hasil pengurangan bilangan bulat = " + hasil7);
		
		hasil8 = bilbul1 * pecahan;
		System.out.print("hasil perkalian bilangan bulat = " + hasil8);
		
		hasil9 = bilbul1 / pecahan;
		System.out.print("hasil pembagian bilangan bulat = " + hasil9);
		
		hasil10 = bilbul1 & pecahan;
		System.out.print("hasil sisabagi bilangan bulat = " + hasil10);
		
		
		System.out.print(!kondisi1);
		System.out.print(!kondisi2);
		System.out.print(!kondisi1 && kondisi2);
		System.out.print(!kondisi1 || kondisi2);
		System.out.print(!kondisi1 ^ kondisi2);
		
	}
}	