package laba3;
//Напишите программу, в которой вычисляется сумма чисел,
// удовлетворяющих таким критериям: при делении числа на 5 в остатке получа¬ется 2,
// или при делении на 3 в остатке получается 1.
// Количество чисел в сумме вводится пользователем.
// Программа отображает числа, которые суммируются, и значение суммы.
// Предложите версии программы, использующие разные операторы цикла.
import java.util.Random;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt(); // кол-во чисел
       // int sum = 0;
        int a = 1;
        while (num != 0){
            if (a % 5 == 2 && a % 3 == 1) {

             System.out.println(a);
             a++;
             num--;
                   // sum = 0 + a;
                }
            else {

                //System.out.println();
            }
               // System.out.println(sum);
            }
        }
    }





