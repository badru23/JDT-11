public class DemoCasting {
	public static void main (String [] args) {
		/*
			IMPLICIT CASTING : AUTOMATICALLY 
			mengonversi tipe yang lebih kecil ke ukuran tipe yang lebih besar 
			byte -> short -> char -> int -> long -> float -> double
		*/
		/*
			EXPLICIT CASTING : MANUALLY
			mengonversi tipe yang lebih besar ke tipe ukuran 
			yang lebih kecil double -> float -> long -> int -> char -> short -> byte
		*/
		
		// Contoh Implicit : byte -> int
		byte angkaKecil = 10;
		int konversibyte = angkaKecil;
		System.out.println("Nilai	: " + konversibyte);
		
		//contoh Explicit : long -> int
		
		long angkaBesar = 1000 ;
		int konversiInt = (int) angkaBesar ;
		System.out.println("Nilai	: " + konversiInt);
		
		// Contoh Implicit : int -> double
		
		int angkaInt = 5 ;
		float angkaFloat = (float) angkaInt;
		System.out.println("Nilai	: " + angkaFloat);
		
		// Contoh explicit : dauble -> int
		
		angkaInt = (int) angkaFloat;
		System.out.println("Nilai	: " + angkaInt);
		
		
	}
}