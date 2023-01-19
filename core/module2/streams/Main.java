import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        input.chars().forEach(c -> charCount.merge((char)c, 1, Integer::sum));
        charCount.forEach((c, i) -> System.out.println(c + " : " + i));
        sc.close();
    }
}
