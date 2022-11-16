public class OperatorAritmatika {
	public static void main (String [] y)
	{
		java.util.Scanner tangkap= new java.util.Scanner (System.in);
		System.out.print("BILANGAN 1	:");
		String bilSatu= tangkap.nextLine();
		
		System.out.print("BILANGAN 2	:");
		String bilDua= tangkap.nextLine();
		
		double bilSatuDouble = Double.parseDouble(bilSatu);
		double bilDuaDouble = Double.parseDouble(bilDua);
		System.out.println("================================DOUBLE===================================");
		System.out.println(bilSatuDouble+" + "+bilDua+" : "+ (bilSatuDouble + bilDuaDouble));
		System.out.println(bilSatuDouble+" - "+bilDua+" : "+ (bilSatuDouble - bilDuaDouble));
		System.out.println(bilSatuDouble+" x "+bilDua+" : "+ (bilSatuDouble * bilDuaDouble));
		System.out.println(bilSatuDouble+" / "+bilDua+" : "+ (bilSatuDouble / bilDuaDouble));
		System.out.println(bilSatuDouble+" % "+bilDua+" : "+ (bilSatuDouble % bilDuaDouble));
	
	
		Integer bilSatuInteger = Integer.parseInt(bilSatu);
		Integer bilDuaInteger = Integer.parseInt(bilDua);
		System.out.println("==================================INT======================================");
		System.out.println(bilSatuInteger+" + "+bilDuaInteger+"	:"+(bilSatuInteger + bilDuaInteger));
		System.out.println(bilSatuInteger+" - "+bilDuaInteger+"	:"+(bilSatuInteger - bilDuaInteger));
		System.out.println(bilSatuInteger+" x "+bilDuaInteger+"	:"+(bilSatuInteger * bilDuaInteger));
		System.out.println(bilSatuInteger+" / "+bilDuaInteger+"	:"+(bilSatuInteger / bilDuaInteger));
		System.out.println(bilSatuInteger+" % "+bilDuaInteger+"	:"+(bilSatuInteger % bilDuaInteger));
	}
}