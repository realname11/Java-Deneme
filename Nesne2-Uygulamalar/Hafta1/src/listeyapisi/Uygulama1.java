package listeyapisi;

import java.util.ArrayList;
import java.util.Scanner;


public class Uygulama1 {


	public static void main(String[] args) {
		Scanner giri�=new Scanner(System.in);
		ArrayList<Personel> �al��anlar=new ArrayList<Personel>();
		System.out.println("Personel Kayd� i�in '1'");
		System.out.println("Personel Silmek i�in '2'");
		System.out.println("Personelleri Listelemek i�in '3'");
		System.out.println("��kmak i�in '0'");
		int tercih=giri�.nextInt();
		
		while (tercih==1) {
			System.out.println("Personelin ad�:");
			String ad=giri�.next();
			System.out.println("Personelin soyad�:");
			String soyad=giri�.next();
			String adsoyad=ad+" "+soyad;
			System.out.println("Personelin maa��:");
			double maa�=giri�.nextDouble();
			System.out.println("Personelin sicil numaras�:");
			int sicilno=giri�.nextInt();
			Personel personel=new Personel(adsoyad, maa�, sicilno);
			�al��anlar.add(personel);
			System.out.println("Personel Kayd� i�in '1'");
			System.out.println("Personel Silmek i�in '2'");
			System.out.println("Personelleri Listelemek i�in '3'");
			System.out.println("��kmak i�in '0'");
			tercih=giri�.nextInt();
		}
		while(tercih == 2)
		{
			for (int i = 0; i <�al��anlar.size(); i++) {
				Personel personel=�al��anlar.get(i);
				System.out.println((i)+".personelin ad� soyad�:"+personel.adsoyad);
				System.out.println((i)+".personelin maa��:"+personel.maa�);
				System.out.println((i)+".personelin sicil numaras�:"+personel.sicilno);
				System.out.println("-------------------------------");
			}
			System.out.println("Silmek istedi�iniz personel numaras�n� se�iniz: ");
			int sil =giri�.nextInt();
			
			�al��anlar.remove(sil);
			
			System.out.println(sil+" .Personel silinmi�tir.");
			System.out.println("Personel Kayd� i�in '1'");
			System.out.println("Personel Silmek i�in '2'");
			System.out.println("Personelleri Listelemek i�in '3'");
			System.out.println("��kmak i�in '0'");
			tercih=giri�.nextInt();
			
		}
		while (tercih == 3)
		{
			for (int i = 0; i <�al��anlar.size(); i++) {
				Personel personel=�al��anlar.get(i);
				System.out.println((i)+".personelin ad� soyad�:"+personel.adsoyad);
				System.out.println((i)+".personelin maa��:"+personel.maa�);
				System.out.println((i)+".personelin sicil numaras�:"+personel.sicilno);
				System.out.println("-------------------------------");
			}
			System.out.println("Personel Kayd� i�in '1'");
			System.out.println("Personel Silmek i�in '2'");
			System.out.println("Personelleri Listelemek i�in '3'");
			System.out.println("��kmak i�in '0'");
			
			tercih=giri�.nextInt();
			
		}
		for (int i = 0; i <�al��anlar.size(); i++) {
			Personel personel=�al��anlar.get(i);
			System.out.println((i)+".personelin ad� soyad�:"+personel.adsoyad);
			System.out.println((i)+".personelin maa��:"+personel.maa�);
			System.out.println((i)+".personelin sicil numaras�:"+personel.sicilno);
			System.out.println("-------------------------------");
		}
		giri�.close();

	}
}


