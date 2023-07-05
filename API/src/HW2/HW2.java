package src.HW2;

public class HW2 {
    public static void main(String[] args) {

        /**
         * 1. Реализовать метод isPalindrome
         * 2. Пересмотреть мой спич про работу с файловой системой. Подготовить вопросы.
         */


/**
 * Проверить, является ли строка палиндромом.
 * Палиндром - это строка, которая читается одинаково слева и справа
 * abcdedcba -> true
 * a -> true
 * abc -> false
 * abcd -> false
 * abba -> true
 */
    String str = "abba";
        System.out.println(isPalindrome(str));

    }

    static boolean isPalindrome(String source) {
        for (int i = 0; i < source.length()/2;i++){
            if( source.charAt(i)!=source.charAt(source.length()-1-i)) {
                return false;
            }
        }
        return true;
    }

}