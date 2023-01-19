import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		int mat,fizik,kimya,turkce,tarih,muzik,toplam;

		Scanner kb = new Scanner(System.in);

		System.out.print("Matematik Notunuzu Giriniz:");
		mat = kb.nextInt();

		System.out.print("Fizik Notunuzu Giriniz:");
		fizik = kb.nextInt();

		System.out.print("Kimya Notunuzu Giriniz:");
		kimya = kb.nextInt();

		System.out.print("Türkçe Notunuzu Giriniz:");
		turkce = kb.nextInt();

		System.out.print("Tarih Notunuzu Giriniz:");
		tarih = kb.nextInt();

		System.out.print("Müzik Notunuzu Giriniz:");
		muzik = kb.nextInt();

		toplam = mat + fizik + kimya + turkce + tarih + muzik;

		double result = toplam / 6.0;


		System.out.println(result > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");

	}
}