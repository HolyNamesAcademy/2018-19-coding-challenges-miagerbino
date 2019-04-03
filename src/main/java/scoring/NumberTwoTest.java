package scoring;

import challenges.NumberTwo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeNoException;

public class NumberTwoTest {

    private static final int MAX_SCORE = 18;
    private static int SCORE = 0;
    private static int TEST_COUNT = 0;

    private NumberTwo two = new NumberTwo();

    @Test
    public void test1(){
        skipIfNotImplemented(() -> {
            boolean expected = true;
            boolean actual = two.evenlySpaced(2, 4, 6);

            assertEquals(expected, actual);
            SCORE++;
        });
    }

    @Test
    public void test2(){
        skipIfNotImplemented(() -> {
            boolean expected = false;
            boolean actual = two.evenlySpaced(2, 4, 8);

            assertEquals(expected, actual);
            SCORE++;
        });
    }

    @Test
    public void test3(){
        skipIfNotImplemented(() -> {
            boolean expected = false;
            boolean actual = two.evenlySpaced(4, 6, 3);

            assertEquals(expected, actual);
            SCORE += 2;
        });
    }

    @Test
    public void test4(){
        skipIfNotImplemented(() -> {
            boolean expected = true;
            boolean actual = two.evenlySpaced(4, 6, 2);

            assertEquals(expected, actual);
            SCORE += 2;
        });
    }

    @Test
    public void test5(){
        skipIfNotImplemented(() -> {
            boolean expected = true;
            boolean actual = two.evenlySpaced(6, 2, 4);

            assertEquals(expected, actual);
            SCORE += 2;
        });
    }

    @Test
    public void test6(){
        skipIfNotImplemented(() -> {
            boolean expected = false;
            boolean actual = two.evenlySpaced(6, 2, 8);

            assertEquals(expected, actual);
            SCORE += 2;
        });
    }

    @Test
    public void test7(){
        skipIfNotImplemented(() -> {
            boolean expected = true;
            boolean actual = two.evenlySpaced(2, 2, 2);

            assertEquals(expected, actual);
            SCORE += 2;
        });
    }

    @Test
    public void test8() {
        skipIfNotImplemented(() -> {
            boolean expected = false;
            boolean actual = two.evenlySpaced(2, 2, 3);

            assertEquals(expected, actual);
            SCORE += 1;
        });
    }

    @Test
    public void test9() {
        skipIfNotImplemented(() -> {
            boolean expected = true; //was previously false
            boolean actual = two.evenlySpaced(5, 4, 3);

            assertEquals(expected, actual);
            SCORE += 2;
        });
    }

    @Test
    public void test10() {
        skipIfNotImplemented(() -> {
            boolean expected = true;
            boolean actual = two.evenlySpaced(-2, 0, 2);

            assertEquals(expected, actual);
            SCORE += 3;
        });
    }

    private void skipIfNotImplemented(Runnable test) {
        try {
            test.run();
            TEST_COUNT++;
        } catch (UnsupportedOperationException e) {
            assumeNoException(e);
        }
    }

    public static int getScore(){
        return SCORE;
    }

    public static int getMaxScore(){
        return MAX_SCORE;
    }

    public static int getTestCount(){
        return TEST_COUNT;
    }
}
