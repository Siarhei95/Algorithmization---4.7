package Question_7;
import java.util.*;

public class question_7 {

    public static int searchFactorial(int n){
        int sum = 0;
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
            if(i%2!=0){
                sum = sum + result; //сумма всех нечетных факториалов
            }
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println("Factorial value: " + searchFactorial(9)); //по условию нечетные от 1 до 9
    }
}
