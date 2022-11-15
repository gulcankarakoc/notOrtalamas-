import java.util.Scanner;
public class notortalaması {
    public static void main (String[] args){

        int mat ,turkce,fizik,kimya,tarih,muzik;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        mat= inp.nextInt();
        System.out.print("Türkçe notunuzu giriniz:");
        turkce=inp.nextInt();
        System.out.print("Fizik notunuzu giriniz:");
        fizik=inp.nextInt();
        System.out.print("Kimya notunuzu giriniz:");
        kimya=inp.nextInt();
        System.out.print("Tarih notunuzu giriniz:");
        tarih=inp.nextInt();
        System.out.print("Müzik notunuzu giriniz:");
        muzik=inp.nextInt();

     double ortalama;
     ortalama=(mat+turkce+fizik+kimya+tarih+muzik)/6;
        System.out.println("Ortalamanız:"+ortalama);
        boolean kosul1= ortalama>=60;
        boolean kosul2= ortalama<101;
        boolean sonuc = kosul1&&kosul2;
        String kosul = sonuc ? "Geçtiniz" : "Kaldınız";
        System.out.println(kosul);


    }
}
