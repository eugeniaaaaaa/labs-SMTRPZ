import org.junit.jupiter.api.Test;

import static com.company.WordsFinder.*;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class WordsFinderTest {
    @Test
    public void test_getString_returns_empty_array_on_empty_String() {
        String[] expected = {""};
        String[] actual = findEqualVowelsAndConsonats(findLatinWords(""));
        assertEquals(expected, actual);
    }

    @Test
    public void test_findLatinWords_returns_latin_words() {
        String expected = "hello world";
        String actual = findLatinWords("Hello world Привет мир halfполовина");
        assertEquals(expected, actual);
    }

    @Test
    public void test_findEqualVowelsAndConsonats_returns_words_with_equal_vovels_consonats() {
        String expected = "helloo jjoo some";
        String[] array = findEqualVowelsAndConsonats("helloo world ooaa jjoo some text");
        assertArrayEquals(expected.split(" "), array);
    }

    @Test
    public void test_isVowel_returns_true_for_vowels() {
        boolean expected = true;
        boolean actual = isVowel('a');
        assertEquals(expected, actual);
    }

    @Test
    public void test_isConsonat_returns_true_for_consotan() {
        boolean expected = true;
        boolean actual = isConsonants('b');
        assertEquals(expected, actual);
    }

    @Test
    public void test_findEqualVowelsAndConsonatsFindLatinWords_returns_latin_words_with_equal_vovels_and_consonat() {
        String [] expected = "helloo oopp fana".split(" ");
        String [] actual = findEqualVowelsAndConsonats(findLatinWords("English text Helloo world oopp fana русский текст оорр щщаа"));
        assertArrayEquals(expected,actual);
    }
}


