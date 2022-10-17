package lesson.homework;

import java.util.Scanner;
// задание 4//

public class newwork {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        float first, second, result;
        System.out.print("Enter first num: ");
        first = num.nextFloat();
        System.out.print("Enter second num: ");
        second = num.nextFloat();
        result = first * second;
        result = result * 2 * 2 * 2;
        System.out.println("Result is -" + result);
    }
}
//если в первое число поставить 2 и во второе число поставить 2, то в результате получится 2^5 степени//
//я не поняла другие способы, и решила воспользоваться этой идеей)//