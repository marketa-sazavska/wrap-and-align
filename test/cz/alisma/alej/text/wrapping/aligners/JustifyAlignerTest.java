package cz.alisma.alej.text.wrapping.aligners;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class JustifyAlignerTest {

    @Test
    public void testFromWeb() {
        Aligner aligner = new JustifyAligner();
        List<String> list = new ArrayList<>();

        // Tohle  je  rozvrstvene  dobre.
        list.add("Tohle");
        list.add("je");
        list.add("rozvrstvene");
        list.add("dobre.");

        String result = aligner.format(list, 30);

        assertEquals("Tohle  je  rozvrstvene  dobre.", result);
    }


    @Test
    public void test2() {
        Aligner aligner = new JustifyAligner();
        List<String> list = new ArrayList<>();

        // Tohle  je  rozvrstvene  dobre.
        list.add("Tohle");
        list.add("je");
        list.add("rozvrstvene");
        list.add("dobre.");

        String result = aligner.format(list, 32);

        assertEquals("Tohle  je   rozvrstvene   dobre.", result);
    }
    @Test
    public void test3() {
        Aligner aligner = new JustifyAligner();
        List<String> list = new ArrayList<>();

        String result = aligner.format(list, 5);

        assertEquals("     ", result);
    }

    @Test
    public void test4() {
        Aligner aligner = new JustifyAligner();
        List<String> list = new ArrayList<>();

        // Tohle  je  rozvrstvene  dobre.
        list.add("Test");

        String result = aligner.format(list, 8);

        assertEquals("  Test  ", result);
    }

    @Test
    public void test5() {
        Aligner aligner = new JustifyAligner();
        List<String> list = new ArrayList<>();

        // Tohle  je  rozvrstvene  dobre.

        String result = aligner.format(list, 0);

        assertEquals("", result);
    }
}