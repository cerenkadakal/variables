package appPack2;

public class Degiskenler {

	public static void main(String[] args) {
		
		
		char deger1='M';
		char deger2='-',deger3='8';
		System.out.println(deger1+" "+deger2+" "+deger3);
	
		//boolean ifadeler
		int a=5;
		int b=6;
		boolean x=(a==b);
		System.out.println(x);
		
		//String veri tipi
		String deneme="Kodlab";
		deneme=deneme+"Java Kitab�";
		System.out.println(deneme);
		
		
		int i=5; //primitive degisken
		Integer j=new Integer(6); //referans tipte de�i�ken
		System.out.println(i);
		System.out.println(j);
		
		int y=3;//primitive degisken
		Integer f=new Integer(4);//referans tipte de�i�ken
		String s="Cagla GUL";//PR�M�T�VE DEG�SKEN
		String s1=new String("Cagla GUL");//REFERANS DEG�SKEN
		Double d=new Double(378.9); //referans de�i�ken(De�i�kenlerin s�n�ftan t�retilen bir nesne �eklinde tan�mlanmas�)
		System.out.println(y);
		System.out.println(f);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(d);
		
		
		
		
		
	}

}
