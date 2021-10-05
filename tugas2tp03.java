import java.util.Scanner;

public class TugaTP03 {
    
    public static void main(String agrs[]) {
        
	    Scanner data = new Scanner(System.in);
	    
	    System.out.print("Nama = ");
	    String Nama = data.next();
	
	    System.out.print("Umur = ");
	    int Umur = data.nextlnt();
	
	   
	    System.out.println("Halo" + Nama + "." );
	     System.out.println("Ternyata usia kamu baru" + Umur + "ya");
	    
	}
}
