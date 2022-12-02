class Satu extends Thread{
	public void run(){
		while(true){
			try{
				System.out.println("Satu");
				Thread.sleep(1000);
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
	}
}

class Dua extends Thread{
	public void run(){
		while(true){
			try{
				System.out.println("Dua");
				Thread.sleep(1000);
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
	}
}

class Tiga extends Thread{
	public void run(){
		while(true){
			try{
				System.out.println("Tiga");
				Thread.sleep(1000);
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
	}
}
class Empat{}
class Lima extends Empat implements Runnable{
	public void run(){
		while(true){
			try{
				System.out.println("Lima");
				Thread.sleep(1000);
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
	}
}

public class DemoThread{
	public static void main(String [] args){
		Satu s=new Satu();
		s.start();
		
		Dua d=new Dua();
		d.start();
		
		Tiga t=new Tiga();
		t.start();
		
		Lima l=new Lima();
		Thread x=new Thread(l);
		x.start();
		Thread g=new Thread(()->{
			while(true){
				try{
					System.out.println("Enam======");
					Thread.sleep(1000);
				}catch(Exception ex){
					ex.printStackTrace();
				}
			}
		});
		g.start();
	}
}