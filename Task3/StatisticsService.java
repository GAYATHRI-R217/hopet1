package Task3;

public class StatisticsService {
    private TextRepository repo;
    public StatisticsService(TextRepository repo) {
        this.repo = repo;
    }
    public TextStatistics calculateStatistics() {
        String text = repo.getText();
        int charCount = text.length();
        int wordCount = countWords(text);
        int sentenceCount = countSentences(text);
        int vowelCount = countVowels(text);
        int consonantCount = countConsonants(text);

        return new TextStatistics(charCount, wordCount, sentenceCount,
                                  vowelCount, consonantCount);
    }
    private int countWords(String text) {
        if (text.trim().isEmpty()) return 0;
        return text.trim().split("\\s+").length;
    }
    private int countSentences(String text) {
        if (text.trim().isEmpty()) return 0;
        return text.split("[.!?]").length;
    }
    private int countVowels(String text) {
        int count = 0;
        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
    private int countConsonants(String text) {
        int count = 0;
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z' && "aeiou".indexOf(c) == -1) {
                count++;
            }
        }
        return count;
    }
}
