package sorular;

import java.util.Scanner;

public class faktoriyel {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.out.println("Faktöriyeli Hesaplanacak Olan Sayýyý Giriniz");
		Scanner klavye=new Scanner(System.in);
		int n=klavye.nextInt();
		
		faktoriyelhesapla(n);
		
	}

	private static void faktoriyelhesapla(int n) {
		// TODO Auto-generated method stub
		
		int faktor =  1;
		for(int i=1;i<=n;i++){
			faktor=faktor*i;
			
		}
		System.out.println("Sonuç : "+faktor);
	}

}
