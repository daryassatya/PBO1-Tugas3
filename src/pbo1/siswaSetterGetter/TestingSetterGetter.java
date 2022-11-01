/*
    Nama    : Dimas Aryasatya
    NPM     : 21552011325
    Kelas   : TIFRP21C 
*/

package pbo1.siswaSetterGetter;
import pbo1.siswaSetterGetter.Siswa;

public class TestingSetterGetter {

    public static void main(String[] args) {
        Siswa s = new Siswa();
        
        // Isi setter nrp dalam class object siswa
        s.setNRP(215520113);
        s.nama = "Dimas Aryasatya";
        
        // Getter nrp dalam class object siswa
        s.getNRP();
        
        // Getter nrp dan nama dalam class object siswa
        s.info();
    }
}
