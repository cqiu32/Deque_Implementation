import org.junit.Test;
import static org.junit.Assert.*;

public class TestOffByOne {

    static CharacterComparator offByOne = new OffByOne();

    @Test
    public void test1(){
        assertFalse(offByOne.equalChars('a','A'));

        assertFalse(offByOne.equalChars('a','c'));

        assertFalse(offByOne.equalChars('a','d'));

        assertFalse(offByOne.equalChars('a','k'));

        assertTrue(offByOne.equalChars('a','a'));

        assertTrue(offByOne.equalChars('b','b'));

        assertTrue(offByOne.equalChars('c','c'));

        assertTrue(offByOne.equalChars('k','k'));



    }
}
