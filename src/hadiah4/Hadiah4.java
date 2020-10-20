
package hadiah4;
import java.util.Scanner;

public class Hadiah4 {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       boolean SIM = true;
       boolean STNK = false;
       boolean  Masker = true;
       
       
       //cek apakah anda disiplin atau tidak
       if (Masker == false){
           System.out.println("Anda di tilang karena tidak memakai masker ");
       }else if (SIM ==false){
           System.out.println("Anda di tilang karena tidak memakai SIM ");
       }else if(STNK == false){
           System.out.println("Anda di tilang karena tidak membawa STNK");
       }else {
           System.out.println("Anda tidak di tilang");
           System.out.println("Terima Kasih atas kedisiplinan Anda");
           System.out.println("Selamat Jalan,Maaf mengganggu perjalanan Anda");
       }
       
       
    }
    
}
