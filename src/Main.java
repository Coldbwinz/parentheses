import util.StringHelper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = StringHelper.getCountAndValidateParentheses(input);
        System.out.println(output);
    }
}