package laba9;
//Код вывода параметра перед вхождением в рекурсивный вызов и после него
public class ex1_3 {
    private static int step = 0;
    public static void recursion (int x) {
        space();
        System.out.println((" " + x + "-> "));
        step++;
        if((x * 2 + 1) < 20){
            recursion(x * 2 + 1);
        }
        step--;
        space();
        System.out.println(" " + x + " <-");
    }
    public static void space() {
        for (int i = 0; i < step; i++){
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        recursion(1);

    }

}
