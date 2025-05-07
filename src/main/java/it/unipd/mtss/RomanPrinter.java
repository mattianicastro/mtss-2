////////////////////////////////////////////////////////////////////
// Mattia Nicastro 2111024
// Samuele Vendramin 2111934
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;
public class RomanPrinter {

    private static final String[] LETTER_I = {
        " _____ ",
        "|_   _|",
        "  | |  ",
        "  | |  ",
        " _| |_ ",
        "|_____|"
    };
    
    private static final String[] LETTER_V = {
        "__      __",
        "\\ \\    / /",
        " \\ \\  / / ",
        "  \\ \\/ /  ",
        "   \\  /   ",
        "    \\/    "
    };
    
    private static final String[] LETTER_X = {
        "__   __",
        "\\ \\ / /",
        " \\ V / ",
        "  > <  ",
        " / . \\ ",
        "/_/ \\_\\"
    };
    
    private static final String[] LETTER_L = {
        " _      ",
        "| |     ",
        "| |     ",
        "| |     ",
        "| |____ ",
        "|______|"
    };
    
    private static final String[] LETTER_C = {
        "  _____ ",
        " / ____|",
        "| |     ",
        "| |     ",
        "| |____ ",
        " \\_____|"
    };
    
    private static final String[] LETTER_D = {
        " _____  ",
        "|  __ \\ ",
        "| |  | |",
        "| |  | |",
        "| |__| |",
        "|_____/ "
    };
    
    private static final String[] LETTER_M = {
        " __  __ ",
        "|  \\/  |",
        "| \\  / |",
        "| |\\/| |",
        "| |  | |",
        "|_|  |_|"
    };
    
    private static String[] getLetterArt(char letter) {
        switch (letter) {
            case 'I':
                return LETTER_I;
            case 'V':
                return LETTER_V;
            case 'X':
                return LETTER_X;
            case 'L':
                return LETTER_L;
            case 'C':
                return LETTER_C;
            case 'D':
                return LETTER_D;
            case 'M':
                return LETTER_M;
            default:
                throw new IllegalArgumentException("Invalid Roman letter: " + letter);
        }
    }
    
    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    public static String printAsciiArt(String romanNumber) {
        
        final int ROWS = 6;
        StringBuilder[] output = new StringBuilder[ROWS];
    
        for (int i = 0; i < ROWS; i++) {
            output[i] = new StringBuilder();
        }
    
        for (int idx = 0; idx < romanNumber.length(); idx++) {
            char letter = romanNumber.charAt(idx);
            String[] letterArt = getLetterArt(letter);
    
            for (int i = 0; i < ROWS; i++) {
                output[i].append(letterArt[i]).append(" ");
            }
        }
    
       
        StringBuilder finalOutput = new StringBuilder();
        for (int i = 0; i < ROWS; i++) {
            finalOutput.append(output[i].toString()).append("\n");
        }
    
        return finalOutput.toString();
    }
    
}
