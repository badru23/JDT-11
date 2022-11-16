public class DemoMethod {

  static void myMethod() {          // => ini adalah Method
    System.out.println("Hello Dude!");  
  }

  static void otherMethod() {          // => ini adalah Method ke dua
    myMethod();
    System.out.println("Hello Bro!");  
  }

  public static void main(String[] args) {
    otherMethod(); // Memanggil method
  }
}
