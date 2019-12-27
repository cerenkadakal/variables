package appPack;

public class Degisken {

	
	
	public static void main(String[] args) {
		
		String degisken="5";
		
		int yeni1=Integer.valueOf(degisken);
		int yeni2=Integer.parseInt(degisken);
		System.out.println(yeni1);
		System.out.println(yeni2);
		
		String degisken2="3";
		int yeni3=Integer.valueOf(degisken2);
		System.out.println(yeni3*yeni3);
		
		int sayi=9;
		String deger1=String.valueOf(sayi);
		String deger2=Integer.toString(sayi);
		System.out.println(deger1+" "+deger2);
		
		double sayi3=345.2;
		int sayi2=(int)sayi3;
		
		System.out.println(sayi2);
		
		int x=345;
		double y=(double)x;
		System.out.println(y);
		
		float a=345.6f;
		long b=(long)a;
		System.out.println(b);
		
		long c=345;
		float d=(float)c;
		System.out.println(d);
	}
	
	
	
		
		}
	
	
	
	


