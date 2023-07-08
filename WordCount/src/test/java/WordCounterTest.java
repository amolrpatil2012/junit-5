import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordCounterTest {

    private WordCounter wordCounter = new WordCounter();

    @Test
    public void emptyStringHasNoWords()
    {
        wordCounter.add("");
        assertEquals(0,wordCounter.getWordCount());
    }
    @Test
    public void singleWordStringhasOneWord()
    {
        wordCounter.add("Hello");
        assertEquals(1,wordCounter.getWordCount());
    }
    @Test
    public void alreadUniqueWordStringhasManyWords()
    {
        wordCounter.add("   Hello    World ");
        assertEquals(2,wordCounter.getWordCount());
    }
    @Test
    public void inputWithDuplicatesandUniqueCase()
    {
        wordCounter.add("Hello Hello World");
        assertEquals(2,wordCounter.getWordCount());
    }
    @Test
    public void inputWithDuplicatesandMixedCase()
    {
        wordCounter.add("Hello hello World");
        assertEquals(2,wordCounter.getWordCount());
    }
    @Test
    public void inputWithDuplicatesandMixedCaseandPunctuationMarks()
    {
        wordCounter.add("Hello, hello. World");
        assertEquals(2,wordCounter.getWordCount());
    }
}