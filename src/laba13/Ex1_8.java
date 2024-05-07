package laba13;
//Генерация исключения в методе.
public class Ex1_8 {
    public static class Main {
        public static int m() {
            try {
                System.out.println("0");
                throw new RuntimeException();
            } finally {
                System.out.println("1");
            }
        }

        public static void main(String[] args) {

            System.out.println(m());
        }

    }
}



