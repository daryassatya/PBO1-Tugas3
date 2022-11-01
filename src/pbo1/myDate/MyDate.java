/*
    Nama    : Dimas Aryasatya
    NPM     : 21552011325
    Kelas   : TIFRP21C 
 */
package pbo1.myDate;

public class MyDate {
    public int day;
    public int month;
    public int year;
    
    
    public void setDay(int dd){
        if(month == 2){
            if(dd > 28){
                System.out.println("Invalid day..");
            } else {
                day = dd;
            }
        } else {
            if(dd > 31){
                System.out.println("Invalid day..");
            } else {
                day = dd;
            }
        }
    }
    
    public int getDay(){
        return day;
    }
    
    public static void main(String[] args) {
        MyDate d = new MyDate();
        
        d.setDay(1);
        d.month = 11;
        d.year = 2022;
        
        System.out.println("Sekarang adalah hari ke-" + d.getDay() + ", Bulan ke-"+ d.month + ", dan Tahun ke-" + d.year);

    }
}


