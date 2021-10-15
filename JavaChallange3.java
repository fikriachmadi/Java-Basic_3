import java.util.Scanner;

public class JavaChallange3 {
    public static void main (String[] args){
        int tinggi, output = 1;
        Scanner input = new Scanner (System.in);
        System.out.print("Masukan Nilai Tinggi = ");
        tinggi = input.nextInt();
        input.close();


        for (int i = 1; i <= tinggi; i++){
            for (int s = tinggi-i; s>0; s--){
                System.out.print(" ");
            }

            for (int a = 1; a<=output; a++){
                System.out.print("*");
            }
            output += 2;
            System.out.print("\n");
        }
        
    }
    
}