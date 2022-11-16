import java.util.* ;

public class DemoPercabanganIfElse {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in); 
		
		String grading ;
		System.out.print("Masukan Grading Anda : ");
		grading = input.nextLine();
		String gradingKapital = grading.toUpperCase();
		
		if (gradingKapital.equals("A") ){
			System.out.println("Predikat anda = Istimewa");
		}else if (gradingKapital.equals("B") ){
			System.out.println("Predikat anda = Baik");
		}else if (gradingKapital.equals("C") ){
			System.out.println("Predikat anda = Cukup");
		}else if (gradingKapital.equals("D") ){
			System.out.println("Predikat anda = Kurang");
		}else if (gradingKapital.equals("E") ){
			System.out.println("Predikat anda = Gagal");
		}else {
			System.out.println("Grading yang anda masukan tidak ada cuy");
		}
	}	
}