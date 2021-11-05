package bai5;

public class RunMain {
    public static boolean isPrime(int n){
        if(n<=1)
            return false;
        for(int i =2; i*i<n; i++){
            if(n% i ==0)
                return false;
        }
        return true;
    }
    public static boolean isPrime(long n){
        if(n<=1)
            return false;
        for(int i =2; i*i<n; i++){
            if(n% i ==0)
                return false;
        }
        return true;
    }
    public static boolean isPrime(float n){
        return false;
    }
    public static boolean isPrime(double n){
        return false;
    }
    public static void main(String[] args){
        System.out.println(isPrime(11));         // Kieu int
        System.out.println(isPrime(112l));      // Kieu long
        System.out.println(isPrime(11.2f));      // Kieu float
        System.out.println(isPrime(11.1234));    // Kieu double
    }
}
