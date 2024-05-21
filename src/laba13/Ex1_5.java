package laba13;
//. Исключение не перехвачено.
public class Ex1_5 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
        } catch (NullPointerException e) {
            System.out.println("1");
        } catch (RuntimeException ex){
            System.out.println("ошибка");
        }
        System.out.println("2");
    }

}
