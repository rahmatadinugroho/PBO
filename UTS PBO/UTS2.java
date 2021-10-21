import java.util.Scanner;
public class UTS2 {
    public static void main(String[] args) {
        System.out.println("Perhitungan Index massa tubuh (BMI))");
        System.out.println("=====================================================");

        float berat, tinggi;
        float bmi;

        Scanner Input = new Scanner(System.in);
        System.out.print("Masukan Berat(kg)= ");
        berat =  Input.nextFloat();
        System.out.print("Masukan Tinggi (m)= ");
        tinggi = Input.nextFloat();

        bmi = berat / (tinggi * tinggi);
        
        if (bmi <= 18.4){
            System.out.println("Berat badan anda ada di kategori Underwight");
        }else if (bmi >= 18.5){
            System.out.println("Berat badan anda berada di kategori Ideal");
        }else if (bmi > 22.9 ){
            System.out.println("Berat badan anda berada di kategori Overweight");
        }
    }
}