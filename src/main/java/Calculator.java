
import java.util.Scanner;


public class Calculator {
    public int plus(int firstValue, int secondValue) {
        return firstValue + secondValue;
    }

    public int minus(int firstValue, int secondValue) {
        return firstValue - secondValue;
    }

    public int multiply(int firstValue, int secondValue) {
        return firstValue * secondValue;
    }

    public int divide(int firstValue, int secondValue) {
        return firstValue / secondValue;
    }


    /*public static int result(int firstValue, int secondValue, char action) {
        switch (action) {
            case '+':
                return firstValue + secondValue;
            case '-':
                return firstValue - secondValue;
            case '*':
                return firstValue * secondValue;
            case '/':
                return firstValue / secondValue;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число");
        int firstValue = input.nextInt();
        System.out.println("Введите второе число");
        int secondValue = input.nextInt();
        System.out.println("Выберите действие: +  -  *  /");
        char action = input.next().charAt(0);
        System.out.println(result(firstValue, secondValue, action));
    }
*/


}