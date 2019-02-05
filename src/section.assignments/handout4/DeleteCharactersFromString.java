package handout4;

import acm.program.ConsoleProgram;

/*
* File: DeleteCharactersFromString.java
* ------------------------
* This program removes all occurrences of the character ch from the string str
*/

public class DeleteCharactersFromString extends ConsoleProgram{
    public void run() {
        while (true) {
            String string = readLine("Enter a string: ");
            String character = readLine("Enter a character: ");
            char c;
            if (string.length() == 0 || character.length() == 0)
                break;
            if (character.length() > 1) {
                println("invalid character");
                break;
            } else {
                c = character.charAt(0);
            }
            println(removeAllOccurrences(string, c));
        }
    }

    private String removeAllOccurrences(String str, char ch) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                result += str.charAt(i);
            } }
        return result;
    }
}
