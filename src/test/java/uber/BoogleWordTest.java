package uber;

import org.junit.Test;

import java.util.List;

public class BoogleWordTest {

    @Test
    public void testBruteforce() {
        String[] dict = new String[]{"GEEKS", "FOR", "QUIZ", "GO"};

        String[][] boogle = {
                {"G", "I", "Z", "F", "H"},
                {"U", "E", "K", "F", "R"},
                {"Q", "S", "E", "O", "H"},
                {"B", "O", "F", "W", "H"},
                {"B", "O", "F", "W", "H"}
        };

        List<String> words = BoogleWord.findWordBruteForce(dict, boogle);
        System.out.println(words);
    }

    @Test
    public void testOptimal() {
        String[] dict = new String[]{"GEEKS", "FOR", "QUIZ", "GO"};

        char[][] boogle = {
                {'G', 'I', 'Z', 'F', 'H'},
                {'U', 'E', 'K', 'F', 'R'},
                {'Q', 'S', 'E', 'O', 'H'},
                {'B', 'O', 'F', 'W', 'H'}
        };

        List<String> words = BoogleWord.findWordOptimal(dict, boogle);
        System.out.println(words);
    }
}