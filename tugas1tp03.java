import java.util.Scanner;

public class TugaTP03 {
    public static void main(String agrs[]) {
	    Scanner nilai = new Scanner(System.in);
	
	    System.out.print("Uang masukan/hari : ");
	    int bilbul = nilai.nextInt();
	
	    System.out.print("waktu menabung/hari : ");
	    int bilbul2 = nilai.nextInt();
	
	   
	    System.out.println("Jumlah uang dira = " + (bilbul * bilbul2));
	    
	}
}
