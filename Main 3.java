public class Main {
    public static void main(String[] args) {
        System.out.println("sayıların toplamı:"+toplasayilari(305));
        System.out.println("sayıların toplamı:"+toplasayilari(-307));

    }
    public static int toplasayilari(int n){
        if(n<0){
            n=-n;
        }
        if(n<10){
            return n;
        }
        else{
            return (n % 10) + toplasayilari(n / 10);
        }
    }
}