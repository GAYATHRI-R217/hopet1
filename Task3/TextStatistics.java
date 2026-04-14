package Task3;

public class TextStatistics {

    private int charCount;
    private int wordCount;
    private int sentenceCount;
    private int vowelCount;
    private int consonantCount;

    public TextStatistics(int charCount, int wordCount, int sentenceCount,
                          int vowelCount, int consonantCount) {
        this.charCount = charCount;
        this.wordCount = wordCount;
        this.sentenceCount = sentenceCount;
        this.vowelCount = vowelCount;
        this.consonantCount = consonantCount;
    }

    public int getCharCount() {
        return charCount;
    }

    public int getWordCount() {
        return wordCount;
    }

    public int getSentenceCount() {
        return sentenceCount;
    }

    public int getVowelCount() {
        return vowelCount;
    }

    public int getConsonantCount() {
        return consonantCount;
    }
}
