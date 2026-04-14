package Task3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a paragraph:");
        String input = sc.nextLine();
        TextRepository repo = new TextRepository(input);
        StatisticsService service = new StatisticsService(repo);
        TextStatistics stats = service.calculateStatistics();
        System.out.println("\n--- TEXT STATISTICS ---");
        System.out.println("Characters: " + stats.getCharCount());
        System.out.println("Words: " + stats.getWordCount());
        System.out.println("Sentences: " + stats.getSentenceCount());
        System.out.println("Vowels: " + stats.getVowelCount());
        System.out.println("Consonants: " + stats.getConsonantCount());
        sc.close();
    }
}

