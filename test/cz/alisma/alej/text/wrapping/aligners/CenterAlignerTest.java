package cz.alisma.alej.text.wrapping.aligners;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CenterAlignerTest {

    @Test
    public void test1() {
        Aligner aligner = new CenterAligner();
        List<String> list = new ArrayList<>();

        // Tohle je

        list.add("Tohle");
        list.add("je");

        String result = aligner.format(list, 12);

        assertEquals("  Tohle je  ", result);

    }

    @Test
    public void test2() {
        Aligner aligner = new CenterAligner();
        List<String> list = new ArrayList<>();

        // Tohle je

        list.add("Tohle");

        String result = aligner.format(list, 12);

        assertEquals("   Tohle    ", result);

    }

    @Test
    public void test3() {
        Aligner aligner = new CenterAligner();
        List<String> list = new ArrayList<>();

        String result = aligner.format(list, 6);

        assertEquals("      ", result);

    }

    @Test
    public void test4() {
        Aligner aligner = new CenterAligner();
        List<String> list = new ArrayList<>();

        String result = aligner.format(list, 0);

        assertEquals("", result);

    }
}
