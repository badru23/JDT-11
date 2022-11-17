/*
    JAVA INNER CLASS
 */

//OuterClass
class OuterClass {
    void kelasLuar(){
        // kelasDalam();
        // kelasPalingDalam(); => Eror .outerClass tidak dapat mengambil method innerClass
        System.out.println("Ini adalah  outerClass");
    }

//InnerClass
  class InnerClass {
     void kelasDalam(){
        kelasLuar(); // => innerClass dapat mengambil method yang ada pada outerClass
        System.out.println("Ini adalah  InnerClass");
    }

//most in class
        class palingDalam {
            void kelasPalingDalam(){
                kelasLuar();
                kelasDalam();
                System.out.println("Ini adalah  Paling Dalam");
        }
      }
    }   
 }

// Driver Class
public class DemoIC {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    OuterClass.InnerClass.palingDalam dalam = myInner.new palingDalam();
    myOuter.kelasLuar();
    myInner.kelasDalam();
    dalam.kelasPalingDalam();
  }
}
