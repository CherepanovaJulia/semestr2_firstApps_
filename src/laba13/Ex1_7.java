package laba13;

import org.apache.commons.codec.EncoderException;

//Нельзя перехватить брошенное
// исключение с помо-щью чужого catch, даже если перехватчик подходит.
public class Ex1_7 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (ArithmeticException e) {
            System.out.println("2");
        } catch (Exception e) {
            System.out.println("1");

         }
        System.out.println("3");
    }
}
