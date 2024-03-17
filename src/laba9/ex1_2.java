package laba9;
//Вывести последовательность, представленную в предыдущем примере,
// в обратном порядке.

public class ex1_2 {
    public static void recursion(int x){

        if ((2 * x + 1) < 20) {
            recursion(2 * x + 1);
        }
        System.out.println("x = " + x);
        }

    public static void main (String[] args){
        recursion(1);
    }
}
