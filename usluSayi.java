import java.util.Scanner;

public class usluSayi {
    public static void main(String[] args) {
        int k,m;
        Scanner inp = new Scanner(System.in);
        System.out.print("�ss� al�nacak say�  :  ");
        m = inp.nextInt();
        System.out.print("�s olacak  say�  :  ");
        k = inp.nextInt();
        int total = 1;


        for ( int i = 1; i <= k; i++){
            total *= m;}
        System.out.println(m+ " �ss� "+ k +" = "+total);





    }
}
