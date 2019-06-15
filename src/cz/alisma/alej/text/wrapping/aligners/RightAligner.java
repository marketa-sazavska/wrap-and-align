package cz.alisma.alej.text.wrapping.aligners;

import java.util.List;

public class RightAligner extends  Aligner {

    @Override
    public String format(List<String> words, int width) {
        StringBuilder result = new StringBuilder(width);

        int spacesLeft = spacesLeft(words, width);

        result.append(spaces(spacesLeft));

        if (words.size() == 0){
            return result.toString();
        }


        for (int i = 0; i < words.size() - 1; i++) {
            result.append(words.get(i)).append(" ");
        }


        result.append(words.get(words.size() - 1));

        return result.toString();
    }

}