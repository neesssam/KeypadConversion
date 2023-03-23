import java.util.HashMap;
import java.util.Scanner;

public class KeypadConversionSrc {
    // Define the mapping of characters to key presses using HashMap KeypadMapping Method
    private static final HashMap<Character, String> KEYPAD_MAPPING = new HashMap<>() {{
        put('a', "2");
        put('b', "22");
        put('c', "222");
        put('d', "3");
        put('e', "33");
        put('f', "333");
        put('g', "4");
        put('h', "44");
        put('i', "444");
        put('j', "5");
        put('k', "55");
        put('l', "555");
        put('m', "6");
        put('n', "66");
        put('o', "666");
        put('p', "7");
        put('q', "77");
        put('r', "777");
        put('s', "7777");
        put('t', "8");
        put('u', "88");
        put('v', "888");
        put('w', "9");
        put('x', "99");
        put('y', "999");
        put('z', "9999");
        put(' ', "0");
    }};

    public static void main(String[] args) {
        // Ask the user for input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String message = scanner.nextLine().toLowerCase();

        // Convert each character to its corresponding key press and print the result
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (KEYPAD_MAPPING.containsKey(c)) {
                result.append(KEYPAD_MAPPING.get(c));
            }
        }
        System.out.println("Keypad sequence: " + result);
    }
}
