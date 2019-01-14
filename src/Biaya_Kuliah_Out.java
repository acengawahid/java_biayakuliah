/*
 * Nama : Aceng Abdul Wahid
 * NIM  : A2.1700001
 * UTS Praktek Algoritma dan Struktur Data
 */
/*
 * @author Ceng
 */
import java.util.Scanner;
public class Biaya_Kuliah_Out {

    /**
     * @param args the command line arguments
     */
    static String[] nomina={"","Satu","Dua","Tiga","Empat","Lima","Enam","Tujuh","Delapan","Sembilan","Sepuluh","Sebelas"};
    public static void main(String[] args) {
        int sks,upp,uang_mhs;
        long total_biaya;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("--- Aplikasi Perhitungan Biaya Kuliah STMIK Sumedang ---");
        System.out.print("Biaya SKS             : Rp." );
        sks = scan.nextInt();
        System.out.println("    X 21 SKS          = RP." + sks * 21);
        System.out.print("Biaya UPP             : RP.");
        upp = scan.nextInt();
        System.out.print("Biaya Kemahasiswaan   : Rp.");
        uang_mhs = scan.nextInt();
        total_biaya = (upp + (sks * 21) + uang_mhs);
        System.out.println("Total Biaya Kuliah STMIK Sumedang   = Rp." + total_biaya);
        System.out.println("Terhitung                           : " + new Biaya_Kuliah_In().hitung(total_biaya) +" Rupiah");
    }
    public static String hitung(Long angka){
        if(angka < 12)
            return nomina[angka.intValue()];
        if(angka >=12 && angka <= 19)
           return nomina[angka.intValue() % 10] + " Belas";
        if(angka >= 20 && angka <= 99)
           return hitung(angka / 10) + " Puluh " + nomina[angka.intValue() % 10];
        if(angka >= 100 && angka <= 199)
           return "Seratus " + hitung(angka % 100);
        if(angka >= 200 && angka <= 999)
           return hitung(angka / 100) + " Ratus " + hitung(angka % 100);
        if(angka >= 1000 && angka <= 1999)
           return "Seribu " + hitung(angka % 1000);
        if(angka >= 2000 && angka <= 999999)
           return hitung(angka / 1000) + " Ribu " + hitung(angka % 1000);
        if(angka >= 1000000 && angka <= 999999999)
           return hitung(angka / 1000000) + " Juta " + hitung(angka % 1000000);
        if(angka >= 1000000000 && angka <= 999999999999L)
           return hitung(angka / 1000000000) + " Milyar " + hitung(angka % 1000000000);
        if(angka >= 1000000000000L && angka <= 999999999999999L)
           return hitung(angka / 1000000000000L) + " Triliun " + hitung(angka % 1000000000000L);
        if(angka >= 1000000000000000L && angka <= 999999999999999999L)
          return hitung(angka / 1000000000000000L) + " Quadrilyun " + hitung(angka % 1000000000000000L);
        return "";
        }
}
