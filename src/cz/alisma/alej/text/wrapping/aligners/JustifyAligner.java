package cz.alisma.alej.text.wrapping.aligners;

import java.util.List;

public class JustifyAligner extends  Aligner {

    @Override
    public String format(List<String> words, int width) {
        StringBuilder result = new StringBuilder(width);

        if(words.size() <= 1){
            CenterAligner centerAligner = new CenterAligner();
            return centerAligner.format(words, width);
        }
        int spacesLeft = width - charsInWords(words);

        int[] numbersOfSpaces = new int[words.size() - 1];

        int k = spacesLeft % numbersOfSpaces.length;

        int stable = spacesLeft / numbersOfSpaces.length;

        for (int i = numbersOfSpaces.length - 1; i >= 0; i--) {
            if(k > 0){
                numbersOfSpaces[i] = stable + 1;
                k = k - 1;
            }
            else{
                numbersOfSpaces[i] = stable;
            }
        }

        for (int i = 0; i < words.size() - 1; i++) {
            result.append(words.get(i)).append(spaces(numbersOfSpaces[i]));
        }

        result.append(words.get(words.size() - 1));

        return result.toString();


    }
}
