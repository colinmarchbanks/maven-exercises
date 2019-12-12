import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class mavenStringExercises {

    public static boolean isNumber(String string){
        return StringUtils.isNumeric(string);
    }

    public static String reverseString(String string){
        return StringUtils.reverse(string);
    }

    public static String changeCase(String string){
        return StringUtils.swapCase(string);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string");
        String input = scanner.nextLine();
        System.out.println("isNumber(input) = " + isNumber(input));
        System.out.println("changeCase(input) = " + changeCase(input));
        System.out.println("reverseString(input) = " + reverseString(input));
    }
}
