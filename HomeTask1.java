// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.*;


public class HomeTask1 {
    private static void triangle_number(int num) {
        int result  = 0;
        int count = 1;
        while (count <= num){
            result = result + count;
            count++;
        }      
        System.out.println(result);
    }
    private static void factorial(int num){
        int result = 1;
        int count = 1;
        while (count <= num){
            result = result*count;
            count++;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        
        System.out.println("Input number");
        Scanner in = new Scanner(System.in);
        int number  = in.nextInt();
        System.out.println("Triangle number: ");
        triangle_number(number);
        System.out.println("Factorial: ");
        factorial(number);       
    }

}
