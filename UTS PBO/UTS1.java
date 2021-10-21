import java.util.Scanner;
public class UTS1{
    public static void main(String[] args) {

    int jam;
    int menit; 
    int detik;

    Scanner Input = new Scanner(System.in);
        System.out.print("Jam = ");
        jam = Input.nextInt();
        System.out.print("Menit = ");
        menit =  Input.nextInt();
        System.out.print("detik =  ");
        detik = Input.nextInt();
        
        int jam1 =  jam * 3600;
        int menit1 = menit * 60;

        int twaktu = jam1 + menit1 + detik;
        int pulsa = twaktu / 5;
        int biaya = pulsa * 150;

        System.out.println(jam+" jam : "+menit+" menit : "+detik+ " detik ");
        System.out.println("total biaya yang dikeluarkan = "+ biaya);
    }
}