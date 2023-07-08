/*

    Given a Series of String count Unique Words

    e.g.    This is a Test      4

            This is a Test and a good Test      6

     - Empty String has no words
     - One word String has one word
     - Multiword ( already unique ) word string has multi words
     - Multiword ( with duplicates ) word string has multi words
     - Multiword ( with duplicates in mixed case ) word string has multi words
     - Multiword ( with duplicates and punctuation ) word string has multi words




 */

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class WordCounter {

    /*
    private  int wordCount = 0 ;

    public int getWordCount() {
        return wordCount;
    }

    public void add ( String sentence)
    {
        if ( !sentence.isEmpty())
        {
            wordCount += sentence.trim().split("\\s+").length;
        }

    }

     */

    private Set<String> words = new HashSet<>();
    public void add ( String sentence)
    {
        if ( !sentence.isEmpty())
            for ( String s : sentence.trim().split("[. , ]]"))
                words.add(s.toLowerCase(Locale.ROOT));
    }
    public int getWordCount()
    {
        return words.size();
    }
}
