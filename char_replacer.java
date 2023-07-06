import java.util.Scanner;

public class char_replacer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the input string: ");
        String str = scanner.nextLine();

        System.out.print("Enter the characters to replace: ");
        String charactersToReplace = scanner.nextLine();

        System.out.print("Enter the replacement character: ");
        char replacement = scanner.nextLine().charAt(0);

        // Replace characters
        String replaced = replaceCharacters(str, charactersToReplace, replacement);
        System.out.println("Replaced: " + replaced);

        scanner.close();
    }

    public static String replaceCharacters(String str, String charactersToReplace, char replacement) {
        // Create a StringBuilder to store the modified string
        StringBuilder sb = new StringBuilder();

        // Loop through each character in the input string
        for (char c : str.toCharArray()) {
            // Check if the character should be replaced
            if (charactersToReplace.indexOf(c) != -1) {
                // Replace the character with the specified replacement character
                sb.append(replacement);
            } else {
                // Keep the original character
                sb.append(c);
            }
        }

        // Convert the StringBuilder back to a String
        return sb.toString();
    }
}
