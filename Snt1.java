public class Snt1 {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
     int n ;
     for (n = 2; n < 100; n++){
         boolean check = true;
         for(int i = 2; i <= Math.sqrt(n);i++){
             if(n % i == 0) {
                 check = false;
                 break;
             }
             }
         if(check){
             System.out.println(n+" is a prime");
         }
      }
    }
}
