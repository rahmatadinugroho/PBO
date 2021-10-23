import java.util.Scanner;

class komputer {
    float ketik;
    float internet;
    float game;
}

class lain {
    float scan;
    float printw;
    float printhp;
    float teh;
}

class hitungan{
    float ketik1;
    float internet1;
    float game1;
    float scan1;
    float printw1;
    float printhp1;
    float teh1;
}

class total{
    float jumlah;
}

public class Soal4{
    public static void main(String[] args) {

        System.out.println("Rincian biaya warnet");
        System.out.println("=========================================================================");

        System.out.println("");

        komputer input1 = new komputer();
        Scanner inputan = new Scanner(System.in);
        System.out.print("Ketik (menit): ");
        input1.ketik = inputan.nextFloat();
        System.out.print("Internet (menit): ");
        input1.internet =  inputan.nextFloat();
        System.out.print("game (menit): ");
        input1.game = inputan.nextFloat();

        System.out.println("");

        lain input2 = new lain();
        System.out.print("Scan (File): ");
        input2.scan = inputan.nextFloat();
        System.out.print("Print Berwarna (lembar): ");
        input2.printw = inputan.nextFloat();
        System.out.print("Print Hitam-Putih (lembar): ");
        input2.printhp = inputan.nextFloat();
        System.out.print("Teh Botol: ");
        input2.teh = inputan.nextFloat();

        if ((input1.ketik > 0)&&(input1.ketik <30)){
            input1.ketik = 30;
        }
        if ((input1.internet > 0)&&(input1.internet <30)){
            input1.internet = 30;
        }
        if ((input1.game > 0)&&(input1.game < 30)){
            input1.game = 30; 
        }

        hitungan hitung = new hitungan();

        hitung.ketik1 = input1.ketik / 60 * 2000;
        hitung.internet1 = input1.internet / 60 * 4000;
        hitung.game1 = input1.game / 60 * 5000;

        hitung.scan1 = input2.scan * 1000;
        hitung.printw1 = input2.printw * 500;
        hitung.printhp1 = input2.printhp * 300;
        hitung.teh1 =  input2.teh * 3000;

        total hasil = new total();

        hasil.jumlah = hitung.ketik1 + hitung.internet1 + hitung.game1 + hitung.scan1 + hitung.printw1 + hitung.printhp1 + hitung.teh1;

        System.out.println("Total yang harus dibayar = Rp. " + hasil.jumlah);

        System.out.println("");

        System.out.println("=========================================================================");
    }
}