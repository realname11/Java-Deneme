package listeyapisi;

import java.util.ArrayList;
import java.util.Scanner;


public class Uygulama1 {


	public static void main(String[] args) {
		Scanner giriþ=new Scanner(System.in);
		ArrayList<Personel> çalýþanlar=new ArrayList<Personel>();
		System.out.println("Personel Kaydý için '1'");
		System.out.println("Personel Silmek için '2'");
		System.out.println("Personelleri Listelemek için '3'");
		System.out.println("Çýkmak için '0'");
		int tercih=giriþ.nextInt();
		
		while (tercih==1) {
			System.out.println("Personelin adý:");
			String ad=giriþ.next();
			System.out.println("Personelin soyadý:");
			String soyad=giriþ.next();
			String adsoyad=ad+" "+soyad;
			System.out.println("Personelin maaþý:");
			double maaþ=giriþ.nextDouble();
			System.out.println("Personelin sicil numarasý:");
			int sicilno=giriþ.nextInt();
			Personel personel=new Personel(adsoyad, maaþ, sicilno);
			çalýþanlar.add(personel);
			System.out.println("Personel Kaydý için '1'");
			System.out.println("Personel Silmek için '2'");
			System.out.println("Personelleri Listelemek için '3'");
			System.out.println("Çýkmak için '0'");
			tercih=giriþ.nextInt();
		}
		while(tercih == 2)
		{
			for (int i = 0; i <çalýþanlar.size(); i++) {
				Personel personel=çalýþanlar.get(i);
				System.out.println((i)+".personelin adý soyadý:"+personel.adsoyad);
				System.out.println((i)+".personelin maaþý:"+personel.maaþ);
				System.out.println((i)+".personelin sicil numarasý:"+personel.sicilno);
				System.out.println("-------------------------------");
			}
			System.out.println("Silmek istediðiniz personel numarasýný seçiniz: ");
			int sil =giriþ.nextInt();
			
			çalýþanlar.remove(sil);
			
			System.out.println(sil+" .Personel silinmiþtir.");
			System.out.println("Personel Kaydý için '1'");
			System.out.println("Personel Silmek için '2'");
			System.out.println("Personelleri Listelemek için '3'");
			System.out.println("Çýkmak için '0'");
			tercih=giriþ.nextInt();
			
		}
		while (tercih == 3)
		{
			for (int i = 0; i <çalýþanlar.size(); i++) {
				Personel personel=çalýþanlar.get(i);
				System.out.println((i)+".personelin adý soyadý:"+personel.adsoyad);
				System.out.println((i)+".personelin maaþý:"+personel.maaþ);
				System.out.println((i)+".personelin sicil numarasý:"+personel.sicilno);
				System.out.println("-------------------------------");
			}
			System.out.println("Personel Kaydý için '1'");
			System.out.println("Personel Silmek için '2'");
			System.out.println("Personelleri Listelemek için '3'");
			System.out.println("Çýkmak için '0'");
			
			tercih=giriþ.nextInt();
			
		}
		for (int i = 0; i <çalýþanlar.size(); i++) {
			Personel personel=çalýþanlar.get(i);
			System.out.println((i)+".personelin adý soyadý:"+personel.adsoyad);
			System.out.println((i)+".personelin maaþý:"+personel.maaþ);
			System.out.println((i)+".personelin sicil numarasý:"+personel.sicilno);
			System.out.println("-------------------------------");
		}
		giriþ.close();

	}
}


