/*
 * MIT License
 * Copyright (c) 2017 Gymnazium Nad Aleji
 * Copyright (c) 2017 Vojtech Horky
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package cz.alisma.alej.text.wrapping.aligners;

import java.util.List;

/** Aligns text in a line. */
public abstract class Aligner {
    
    /** Format one line.
     * 
     * @param words List of words on the line.
     * @param width
     * @return Formatted line.
     */
    public abstract String format(List<String> words, int width);

    protected int spacesLeft(List<String> words, int width){
        int chars = words.size();

        if (words.size() != 0){
            chars = chars - 1;
        }
        chars = chars + charsInWords(words);
        return width - chars;
    }

    protected int charsInWords(List<String> words) {
        int chars = 0;
        for (String w : words) {
            chars = chars + w.length();
        }
        return chars;
    }

    protected String spaces(int n){
        StringBuilder result = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            result.append(" ");
        }
        return result.toString();
    }
}
