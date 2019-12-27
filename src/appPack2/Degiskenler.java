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
		deneme=deneme+"Java Kitabý";
		System.out.println(deneme);
		
		
		int i=5; //primitive degisken
		Integer j=new Integer(6); //referans tipte deðiþken
		System.out.println(i);
		System.out.println(j);
		
		int y=3;//primitive degisken
		Integer f=new Integer(4);//referans tipte deðiþken
		String s="Cagla GUL";//PRÝMÝTÝVE DEGÝSKEN
		String s1=new String("Cagla GUL");//REFERANS DEGÝSKEN
		Double d=new Double(378.9); //referans deðiþken(Deðiþkenlerin sýnýftan türetilen bir nesne þeklinde tanýmlanmasý)
		System.out.println(y);
		System.out.println(f);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(d);
		
		
		
		
		
	}

}
