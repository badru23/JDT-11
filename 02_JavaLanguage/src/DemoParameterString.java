public class DemoParameterString {
    public static void main (String[] args){
        if(args.length == 0){
            System.out.println("Anda tidak memasukan Parameter");
        }else {
            for(i = 0; i < args ; i++){
               System.out.println("Parameter ke"+i+"") 
            }
        }
    }
}