import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
       Scanner kuadrat = new Scanner(System.in);
       
       System.out.print("masukan nilai: ");
        int nilai = kuadrat.nextInt();
        
        int pangkat = nilai;
    

      System.out.println("Hasil : " + nilai * pangkat);
    }
}