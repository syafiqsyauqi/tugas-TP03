import java.util.Scanner;

public class Tugas3tp03 {
    
    public static void main(String agrs[]) {
        
	    Scanner nilai = new Scanner(System.in);
	    
	    System.out.print("jumlah permen = ");
	    int bilbul1 = nilai.nextInt();
	
	    System.out.print("jumlah teman dira termasuk dira = ");
	    int bilbul2 = nilai.nextInt();
	
	   
	    System.out.println("masing2 mendapatkan = " + (bilbul / bilbul2));
	    System.out.println("sisa permen = " + (bilbul & bilbul2));
	    
	}
}