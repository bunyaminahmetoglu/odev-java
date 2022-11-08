package yemekKarti3;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		String[] yiyecekler = {"Haslanmis Yumurta (adet) = 4", "Tost = 14", "Su = 2", "Sarma = 9", "Pizza = 29 "};
		Scanner scan = new Scanner(System.in);
		int kimsin, sifre, bakiye = 0, islem, secilenYemek, tutar, kullaniciNumarasi, paraYuklemek;
		
		boolean kullanici = false;
		
		System.out.println("Kimsin? :");
		System.out.println("\n 1- Ogrenci \n 2- Ogretmen \n 3- Idari Personel");
		kimsin = scan.nextInt();
		
		System.out.println("Kullanici numaranizi giriniz: ");
		kullaniciNumarasi = scan.nextInt();
		System.out.println("Sifrenizi girin: ");
		sifre = scan.nextInt();
		
		System.out.println("Para yuklemek ister misiniz? : \n 1- Evet \n 2- Hayir");
		paraYuklemek = scan.nextInt();
		

		YemekKarti yemekKarti = new YemekKarti(kullaniciNumarasi, sifre, bakiye);
		
		
		if(paraYuklemek == 1) {
			System.out.println("Yuklemek istediginiz miktari giriniz: ");
			tutar = scan.nextInt();
			bakiye = tutar;
			yemekKarti.setMoney(bakiye);
			System.out.println("Bakiye : " + yemekKarti.getBakiye());
		}else {
			bakiye = 100;
			yemekKarti.setMoney(bakiye);
			System.out.println("Bakiye : " + yemekKarti.getBakiye());
		}
		
		System.out.println("Yeni kullanici olustu!");
		kullanici = true;
		
		while(kullanici) {
			System.out.println("Yapmak istediginiz islemi seciniz: ");
			System.out.println("\n 1- Yemek Al \n 2- Kullanici bilgileri \n 3- Bakiye Sorgulama \n 4- Para Yatirma \n 5- Exit");
			islem = scan.nextInt();
		
			if(islem == 1) {
				
			
				
				for(int i = 0; i < yiyecekler.length; i++) {
					System.out.print(i + "->");
					System.out.println(yiyecekler[i]);
					System.out.println("\n");
				}
				
				System.out.println("Hangi yemegi almak istersiniz? :");
				secilenYemek = scan.nextInt();
				
				yemekKarti.yemekAl(secilenYemek);
				System.out.println("Alinan yemek: " + yiyecekler[secilenYemek]);
				System.out.println("Guncel bakiyeniz: " + yemekKarti.getBakiye());
				
			}else if(islem == 2) {
				System.out.println("Kullanici Adi: " + yemekKarti.getUser());
				System.out.println("Bakiye: " + yemekKarti.getBakiye());
			}else if(islem == 3) {
				System.out.println("Guncel bakiyeniz: " + yemekKarti.getBakiye());
			}else if(islem == 4) {
				System.out.println("Yatirmak istediginiz tutari giriniz: ");
				tutar = scan.nextInt();
				
				yemekKarti.setMoney(tutar);
				
				System.err.println("Guncel bakiye: " + yemekKarti.getBakiye());
			}else if(islem == 5) {
				kullanici = false;
				System.out.println("Cikis yapildi");
			}
		}
		
		
		
	}
}
