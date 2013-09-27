package javafundamental4.java;
import java.util.Scanner;
public class JavaFundamental4Java {

    
    public static void main(String[] args) {
       int x;
       char nama;
      
       
       Scanner in = new Scanner(System.in);
       
        System.out.println("Masukan Angka Anda Untuk Memilih Jurusan : ");
        x = in.nextInt();
       while(x >=90)
       if(x >= 90){
       System.out.println("Selamat Anda Bisa Masuk Jurusan RPL");
       
       }
       else if(x >= 80){
       System.out.println("Selamat Anda Bisa Masuk Jurusan AK");
       }
       else if(x >= 70){
       System.out.println("Selamat Anda Bisa Masuk Jurusan AP");
       }
       else if(x >= 60){
       System.out.println("Selamat Anda Bisa Masuk Jurusan PM");
       }
       else{
          System.out.println("Silahkan MASUK JAK- TIM !!!!"); 
       }
      
    }
}   
