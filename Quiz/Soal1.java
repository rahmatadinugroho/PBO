import java.util.Scanner;

class Angka {
    int a;
    int b;
    int c;
}

class Perhitungan{
    int penjumlahan;
    float Rerata;
}

public class Soal1{
    public static void main(String[] args) {
        
        // Soal 1 
        Angka Inputan = new Angka();
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan Nilai A = ");
        Inputan.a = inputan.nextInt();
        System.out.print("Masukan Nilai B = ");
        Inputan.b = inputan.nextInt();
        System.out.print("Masukan Nilai C = ");
        Inputan.c = inputan.nextInt();

        System.out.println(" ");

        System.out.println("Nilai A = "+ Inputan.a);
        System.out.println("Nilai B = "+ Inputan.b);
        System.out.println("Nilai C = "+ Inputan.c);

        // Soal 2
        Perhitungan hitung = new Perhitungan();
        hitung.penjumlahan = Inputan.a + Inputan.b + Inputan.c;
        hitung.Rerata = hitung.penjumlahan / 3;

        System.out.println(" ");

        System.out.println("Hasil dari : A + B + C = "+ hitung.penjumlahan);
        System.out.println("Hasil Rerata dari A, b, dan C = "+ hitung.Rerata);

        System.out.println(" ");

        // Soal 3

        // Mencari Nilai Max
        if ((Inputan.a > Inputan.b)&&(Inputan.a > Inputan.c)){
            System.out.println("Nilai Max adalah Nilai A");
        }else if ((Inputan.b > Inputan.a)&&(Inputan.b > Inputan.c)){
            System.out.println("Nilai Max adalah Nilai B");
        }else if ((Inputan.c > Inputan.a)&&(Inputan.c > Inputan.b)){
            System.out.println("Nilai Max adalah Nilai C");
        }else{
            System.out.println("Nilai A, Nilai B, dan Nilai C sama besar");
        }

        // Mencari Nilai Min

        if ((Inputan.a < Inputan.b)&&(Inputan.a < Inputan.c)){
            System.out.println("Nilai Min adalah Nilai A");
        }else if((Inputan.b < Inputan.a)&&(Inputan.b < Inputan.c)){
            System.out.println("Nilai Min adalah Nilai B");
        }else if((Inputan.c < Inputan.a)&&(Inputan.c < Inputan.b)){
            System.out.println("Nilai Min adalah Nilai C");
        }else{
            System.out.println("Nilai A, Nilai B, dan Nilai C sama besar");
        }


        





    }
}