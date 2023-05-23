import java.util.Scanner;

public class OrtalamaHesabi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fiz, kim, tur, tar, muz;

        System.out.print("Matematik Dersi Notunuzu Giriniz :");
        mat = input.nextInt();
        System.out.print("Fizik Dersi Notunuzu Giriniz :");
        fiz = input.nextInt();
        System.out.print("Kimya Dersi Notunuzu Giriniz :");
        kim = input.nextInt();
        System.out.print("Türkçe Dersi Notunuzu Giriniz :");
        tur = input.nextInt();
        System.out.print("Tarih Dersi Notunuzu Giriniz :");
        tar = input.nextInt();
        System.out.print("Müzik Dersi Notunuzu Giriniz :");
        muz = input.nextInt();

        int ortalama = (mat + fiz + kim + tur + tar + muz) / 6;

        System.out.println("Not Ortalamanız : " + ortalama );

        boolean sonuc = ortalama > 60 ;
        String str = (sonuc) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(str);

    }
}
