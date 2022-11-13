package Loops;
import java.util.Scanner;

public class fibonacciSerie{
    public static void main(String[] args) {
        

        int number;
        int fibonacciNumber=0;
        int result=1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç elemanlı fibonacci serisi istersiniz : ");
        number = scanner.nextInt();
        System.out.print(number + " Elemanlı Fibonacci Serisi : \n");

        for(int i =0;i<=(number-1);i++){
            System.out.println((i+1) + ". fibonacci Sayısı : "+ fibonacciNumber);
            result +=fibonacciNumber;
            fibonacciNumber=result-fibonacciNumber;
        }




    }
}
