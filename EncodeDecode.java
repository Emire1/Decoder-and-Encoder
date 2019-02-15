package lab1;

/**
 * Takes in a list of words which can be decoded and encoded.
 *
 * @author Emmanuel Mireku, Tegan Stoddart
 * @version 2/2/2019
 */
public class EncodeDecode {

    //array list of the original list
    private String[] originalList;

//-----------------------------------------------------------------------------

    //array list of the encoded list
    private String[] encodedList;

//-----------------------------------------------------------------------------

    //array list of the decode list
    private String[] decodedList;

//-----------------------------------------------------------------------------

    /**
     * The constructor
     *
     * @param oL: A string array object
     */

    EncodeDecode(String[] oL) {
        originalList = oL;

        //Set the length of decodedList and encodedList to the originalList length
        decodedList = new String[originalList.length];
        encodedList = new String[originalList.length];

        //Loop through oL and decode and encode each element
        for (int i = 0; i < oL.length; i++) {
            encodedList[i] = encode(oL[i]);
            decodedList[i] = decode(oL[i]);

        }


    }

//-----------------------------------------------------------------------------

    /**
     * This maps every character in original word to 2 positions forward, with wraparound.
     *
     * @param originalWord: A string object
     * @return String: a result of the encoding
     */
    public String encode(String originalWord) {
        //Set result into an empty string so that characters can be added later
        String result = "";

        //Loop through the original word and keep adding the characters to result
        for (int i = 0; i < originalWord.length(); i++) {
            result = result + forwardMap(originalWord.charAt(i));
        }
        return result;
    }

//-----------------------------------------------------------------------------

    /**
     * This maps every character in original word to 2 positions back, with wraparound.
     *
     * @param codedWord: A string object
     * @return String: a result of the encoding
     */
    public String decode(String codedWord) {

        //Make codedWord encoded
        codedWord = encode(codedWord);

        //Set result into an empty string so that characters can be added later
        String result = "";

        //Loop through the encoded word and keep adding the characters to result
        for (int i = 0; i < codedWord.length(); i++) {
            result = result + backMap(codedWord.charAt(i));
        }
        return result;
    }

//-----------------------------------------------------------------------------

    /**
     * This maps the given character to 2 positions forward.
     * (If the character is not a letter or digit, it maps to itself)
     *
     * @param ch: A character object
     * @return Char: a result of the mapping
     */
    public char forwardMap(char ch) {
        if (ch == 'A') return 'C';
        if (ch == 'B') return 'D';
        if (ch == 'C') return 'E';
        if (ch == 'D') return 'F';
        if (ch == 'E') return 'G';
        if (ch == 'F') return 'H';
        if (ch == 'G') return 'I';
        if (ch == 'H') return 'J';
        if (ch == 'I') return 'K';
        if (ch == 'J') return 'L';
        if (ch == 'K') return 'M';
        if (ch == 'L') return 'N';
        if (ch == 'M') return 'O';
        if (ch == 'N') return 'P';
        if (ch == 'O') return 'Q';
        if (ch == 'P') return 'R';
        if (ch == 'Q') return 'S';
        if (ch == 'R') return 'T';
        if (ch == 'S') return 'U';
        if (ch == 'T') return 'V';
        if (ch == 'U') return 'W';
        if (ch == 'V') return 'X';
        if (ch == 'W') return 'Y';
        if (ch == 'X') return 'Z';
        if (ch == 'Y') return 'A';
        if (ch == 'Z') return 'B';
        if (ch == 'a') return 'c';
        if (ch == 'b') return 'd';
        if (ch == 'c') return 'e';
        if (ch == 'd') return 'f';
        if (ch == 'e') return 'g';
        if (ch == 'f') return 'h';
        if (ch == 'g') return 'i';
        if (ch == 'h') return 'j';
        if (ch == 'i') return 'k';
        if (ch == 'j') return 'l';
        if (ch == 'k') return 'm';
        if (ch == 'l') return 'n';
        if (ch == 'm') return 'o';
        if (ch == 'n') return 'p';
        if (ch == 'o') return 'q';
        if (ch == 'p') return 'r';
        if (ch == 'q') return 's';
        if (ch == 'r') return 't';
        if (ch == 's') return 'u';
        if (ch == 't') return 'v';
        if (ch == 'u') return 'w';
        if (ch == 'v') return 'x';
        if (ch == 'w') return 'y';
        if (ch == 'x') return 'z';
        if (ch == 'y') return 'a';
        if (ch == 'z') return 'b';
        if (ch == '0') return '2';
        if (ch == '1') return '3';
        if (ch == '2') return '4';
        if (ch == '3') return '5';
        if (ch == '4') return '6';
        if (ch == '5') return '7';
        if (ch == '6') return '8';
        if (ch == '7') return '9';
        if (ch == '8') return '0';
        if (ch == '9') return '1';
        else return ch;

    }

//-----------------------------------------------------------------------------

    /**
     * This maps the given character to 2 positions backward.
     * (If the character is not a letter or digit, it maps to itself)
     *
     * @param ch: A character object
     * @return Char: a result of the mapping
     */
    public char backMap(char ch) {
        if (ch == 'C') return 'A';
        if (ch == 'D') return 'B';
        if (ch == 'E') return 'C';
        if (ch == 'F') return 'D';
        if (ch == 'G') return 'E';
        if (ch == 'H') return 'F';
        if (ch == 'I') return 'G';
        if (ch == 'J') return 'H';
        if (ch == 'K') return 'I';
        if (ch == 'L') return 'J';
        if (ch == 'M') return 'K';
        if (ch == 'N') return 'L';
        if (ch == 'O') return 'M';
        if (ch == 'P') return 'N';
        if (ch == 'Q') return 'O';
        if (ch == 'R') return 'P';
        if (ch == 'S') return 'Q';
        if (ch == 'T') return 'R';
        if (ch == 'U') return 'S';
        if (ch == 'V') return 'T';
        if (ch == 'W') return 'U';
        if (ch == 'X') return 'V';
        if (ch == 'Y') return 'W';
        if (ch == 'Z') return 'X';
        if (ch == 'A') return 'Y';
        if (ch == 'B') return 'Z';
        if (ch == 'c') return 'a';
        if (ch == 'd') return 'b';
        if (ch == 'e') return 'c';
        if (ch == 'f') return 'd';
        if (ch == 'g') return 'e';
        if (ch == 'h') return 'f';
        if (ch == 'i') return 'g';
        if (ch == 'j') return 'h';
        if (ch == 'k') return 'i';
        if (ch == 'l') return 'j';
        if (ch == 'm') return 'k';
        if (ch == 'n') return 'l';
        if (ch == 'o') return 'm';
        if (ch == 'p') return 'n';
        if (ch == 'q') return 'o';
        if (ch == 'r') return 'p';
        if (ch == 's') return 'q';
        if (ch == 't') return 'r';
        if (ch == 'u') return 's';
        if (ch == 'v') return 't';
        if (ch == 'w') return 'u';
        if (ch == 'x') return 'v';
        if (ch == 'y') return 'w';
        if (ch == 'z') return 'x';
        if (ch == 'a') return 'y';
        if (ch == 'b') return 'z';
        if (ch == '2') return '0';
        if (ch == '3') return '1';
        if (ch == '4') return '2';
        if (ch == '5') return '3';
        if (ch == '6') return '4';
        if (ch == '7') return '5';
        if (ch == '8') return '6';
        if (ch == '9') return '7';
        if (ch == '0') return '8';
        if (ch == '1') return '9';
        else return ch;
    }

//-----------------------------------------------------------------------------

    /**
     * Get encoded list
     *
     * @return String Array: encoded list
     */
    public String[] getEncodedList() {
        return encodedList;
    }

//-----------------------------------------------------------------------------

    /**
     * Get decoded list
     *
     * @return String Array: decoded list
     */
    public String[] getDecodedList() {
        return decodedList;
    }

//-----------------------------------------------------------------------------
}
