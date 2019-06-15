package cz.alisma.alej.text.wrapping.aligners;

import java.util.List;

public class CenterAligner extends  Aligner {

    @Override
    public String format(List<String> words, int width) {
        StringBuilder result = new StringBuilder(width);

        int spacesLeft = spacesLeft(words, width);

        result.append(spaces(spacesLeft/2));

        for (int i = 0; i < words.size() - 1; i++) {
            result.append(words.get(i)).append(" ");
        }

        if (words.size() != 0){
            result.append(words.get(words.size() - 1));
        }

        result.append(spaces(width - result.length()));

        return result.toString();
    }

}
