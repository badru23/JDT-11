public class DemoVariable {
	public static void main(String [] args){
		// Tipe Data Integer (bilangan bulat)
		/*
			byte 	-> 
			short 	->
			int		->
			long	-> 
		*/
		
		byte kecil = 10 ;
		short agakGede = 500 ;
		int lebihGedeLagi = 100000;
		long gedeBanget= 2000000;
		byte kecilNegatif = -10;
		byte mynum;
		mynum = 23;
		
		System.out.println("==========BILANGAN BULAT==============" );
		System.out.println("Kecil 			: " + kecil);
		System.out.println("Agak Gede 		: " + agakGede);
		System.out.println("Lebih Gede 		: " + lebihGedeLagi);
		System.out.println("Gede Banget		: " + gedeBanget);
		System.out.println("Kecil Negatif 	: " + kecilNegatif);
		System.out.println("mynum		 	: " + mynum);
		System.out.println("======================================" );
		
		//Tipe Data Floating Point (bilangan pecahan)
		/*
			Float 	->
			Double	->
		*/
		
		float pecahanKecil = 1.1f ;
		double pecahanBesar = 2.2 ;
		
		System.out.println("==========BILANGAN PECAHAN============" );
		System.out.println("Pecahan Kecil	: " + pecahanKecil);
		System.out.println("Pecahan Besar	: " + pecahanBesar);
		System.out.println("======================================" );
		
		//Tipe Data Single Character
		/*
			char ->
		*/
		
		char huruf = 'f' , hurufE = 69 ;
		int angka69 = 'E';
		
		System.out.println("==========Single Character============" );
		System.out.println("Huruf			: " + huruf);
		System.out.println("ASCII	69		: " + hurufE);
		System.out.println("ASCII	E		: " + angka69);
		System.out.println("======================================" );
		
		
		
	}
}