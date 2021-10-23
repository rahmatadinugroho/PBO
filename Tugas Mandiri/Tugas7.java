import java.util.Scanner;

class golongan{
    int jenis;
    float gaji;
    float tunjangan;
}

class waktu{
    int jam;
    float hlembur;
    int wlembur;
}

class hasil{
    float total;
    float total1;
    float total2;
}

public class Tugas7{
    public static void main(String[] args) {
        
        System.out.println("Rekap Gaji Bulanan");
        System.out.println("========================================================");

        Scanner inputan = new Scanner(System.in);
        golongan kelompok = new golongan();

        System.out.print("Masukan Golongan Anda: ");
        kelompok.jenis = inputan.nextInt();

        waktu time = new waktu();
        System.out.print("Masukan total jam kerja anda bulan ini = ");
        time.jam = inputan.nextInt();

        time.wlembur = time.jam - 173;
        time.hlembur = time.wlembur * 20000;

        if(kelompok.jenis == 1){
            kelompok.gaji = 1486500;
            kelompok.tunjangan = 250000;
        }else if(kelompok.jenis == 2){
            kelompok.gaji = 1926000;
            kelompok.tunjangan = 300000;
        }else if(kelompok.jenis == 3){
            kelompok.gaji = 2456700;
            kelompok.tunjangan = 350000;
        }else if(kelompok.jenis == 4){
            kelompok.gaji = 2899500;
            kelompok.tunjangan = 400000;
        }else{
            System.out.println("Golongan yang anda masukan salah");
        }

        hasil hasil1 = new hasil();
        hasil1.total = (kelompok.jenis + kelompok.gaji + kelompok.tunjangan + time.hlembur);
        hasil1.total1 = hasil1.total * (1 / 200);
        hasil1.total2 = hasil1.total - hasil1.total1 ;

        System.out.println("Pengasilan anda bulain ini = Rp. "+ hasil1.total2 );
        System.out.println("========================================================");
    }
}