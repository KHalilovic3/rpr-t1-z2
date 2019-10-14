package ba.unsa.etf.rpr.predavanje03;
import java.util.Scanner;
public class Main {
     static int sumaCifara(int n){
        int s = 0;
        int temp = n;
        while(temp >= 10){
            s = temp % 10;
            temp = temp/10;
        }
        s = temp + s;
        return s;
    }
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        int n;
        n = ulaz.nextInt();
        for(int i = 2;i<n;i++){
            if(i % sumaCifara(i) == 0){
                System.out.println(i);
            }
        }
    }
}
