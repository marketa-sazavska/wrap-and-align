package cz.alisma.alej.text.wrapping;

import cz.alisma.alej.text.wrapping.aligners.Aligner;
import cz.alisma.alej.text.wrapping.aligners.CenterAligner;
import cz.alisma.alej.text.wrapping.aligners.JustifyAligner;
import cz.alisma.alej.text.wrapping.aligners.RightAligner;

public class Zarovnani {

    public static void main(String[] args) {

        int width = getWidth(args);

        Aligner aligner = getAligner(args);

        WrapAndAlign.run(aligner, width);

    }

    private static int getWidth(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-w")) {
                return Integer.parseInt(args[i + 1]);
            } else if (args[i].startsWith("--width")) {
                return Integer.parseInt(args[i].substring(8));
            }

        }

        return 0;
    }


    private static Aligner getAligner(String[] args) {

        for (String arg : args) {
            if (arg.equals("--right")) {
                return new RightAligner();
            } else if (arg.startsWith("--center") || arg.startsWith("--centre")) {
                return new CenterAligner();
            } else if (arg.startsWith("--justify")) {
                return new JustifyAligner();
            }
        }
        return null;
    }
}
