package laba13;
//Исключение перехвачено перехватчиком предка.
public class Ex1_2 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
                    } catch (RuntimeException  ex) {
                        System.out.println("1");
                    } catch (Exception e) {
            System.out.println("2 " + e);
        }

        System.out.println("3");
    }
}

