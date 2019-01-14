/*
 * Nama : Aceng Abdul Wahid
 * NIM  : A2.1700001
 * UTS Praktek Algoritma dan Struktur Data
 */
/*
 * @author Ceng
 */
public class Biaya_Kuliah_In {

    /**
     * @param args the command line arguments
     */
    static String[] nomina={"","Satu","Dua","Tiga","Empat","Lima","Enam","Tujuh","Delapan","Sembilan","Sepuluh","Sebelas"};
    public static void main(String[] args) {
        int sks,upp,uang_mhs;
        long total_biaya;
        
        sks = 90000;
        upp = 1500000;
        uang_mhs = 500000;
        total_biaya = (upp + (sks*21) + uang_mhs);
        
        System.out.println("Biaya Kuliah STMIK Sumedang : Rp." + total_biaya );
        System.out.println("Terhitung                   : " + new Biaya_Kuliah_In().hitung(total_biaya) +"Rupiah");
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
        return "";
        }
}
