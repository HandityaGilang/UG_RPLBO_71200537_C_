import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Mobil M_71200537 = new Mobil();

        PejalanKaki P_71200537 = new PejalanKaki();
    
        Scanner inp = new Scanner(System.in);
        System.out.println("Kode lampu lalu lintas saat ini: ");
        int kodeLampu = inp.nextInt();
    
        switch (kodeLampu) {
            case 1 -> M_71200537.jalan();

            case 2 -> {
                M_71200537.kurangiKecepatan();
                P_71200537.bersiap();
            }
            case 3 -> {
                M_71200537.berhenti();
                P_71200537.menyebrang();
            }
            
        }
    }
    
   

}