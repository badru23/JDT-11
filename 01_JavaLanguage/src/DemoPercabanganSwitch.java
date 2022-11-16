import java.util.* ;

public class DemoPercabanganSwitch {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in); 
		
		String grading ;
		System.out.print("Masukan Grading Anda : ");
		grading = input.nextLine();
		String gradingKapital = grading.toUpperCase();
		
		switch(gradingKapital){
			case "A" : System.out.println ("PREDIKAT ANDA	: EXCELLENT"); break;
			case "B" : System.out.println ("PREDIKAT ANDA	: GOOD"); break;
			case "C" : System.out.println ("PREDIKAT ANDA	: FAIR"); break;
			case "D" : System.out.println ("PREDIKAT ANDA	: BAD"); break;
			case "E" : System.out.println ("PREDIKAT ANDA	: FAILED"); break;
			default  : System.out.println ("Grading Inpalid !!"); break;
		}
	}
}