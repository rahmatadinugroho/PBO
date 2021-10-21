import java.util.Scanner;
public class UTS4 {
    public static void main(String[] args) {
        
        float jari2;
        float pi = 22 / 7;
        float luas, keliling;
        Scanner Input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari = ");
        jari2 = Input.nextFloat();

        luas = pi * (jari2*jari2);
        keliling=  2 * pi * jari2;

        System.out.println("Luas Lingkaran adalah" + luas + " cm^2");
        System.out.println("Keliling lingkaran adalah "+ keliling + " cm" );


    }
}