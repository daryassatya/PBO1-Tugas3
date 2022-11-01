/*
    Nama    : Dimas Aryasatya
    NPM     : 21552011325
    Kelas   : TIFRP21C 
*/
package pbo1.siswaSetterGetter;

public class Siswa {
    public int nrp;
    public String nama;
    
    // Setter untuk NRP
    public void  setNRP(int n){
        
        // Hitung Terlebih Dahulu Panjang Digit NRP
        // Sebelum di masukkan ke IF operator        
        int panjangNrp = String.valueOf(n).length();
        
        // NRP Harus lebih besar dari 0 dan lebih kecil dari 10
        if(panjangNrp>=1 && panjangNrp<=10){
            nrp = n;
        // Jika tidak memenuhi persyaratan diatas
        // Maka print ("Di luar jangkauan..");
        } else {
            System.out.println("Di luar jangkauan..");  
        }
    }
    
    // Getter untuk NRP
    public int getNRP(){
        return nrp;
    }
    
    // Getter untuk nrp dan nama
    public void info(){
        System.out.println("Siswa dengan NRP "+nrp+" dan Nama "+nama+" Adalah Siswa STTB");
    }
}
