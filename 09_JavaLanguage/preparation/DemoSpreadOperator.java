public class DemoSpreadOperator
{
	static void cetak(String...s)
	{
		for(String e: s){
			System.out.println(e);
		}
		System.out.println("===============");
	}
	public static void main(String [] args)
	{
		cetak("satu");
		cetak("dua","tiga");
		cetak("empat","lima","enam");
	}
}