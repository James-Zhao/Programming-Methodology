package handout4;

import acm.program.ConsoleProgram;

/*
* File: AddCommasToNumericString.java
* ------------------------
* This program makes large numbers to separate groups of three
* like 1000 -> 1,000
*/
public class AddCommasToNumericString extends ConsoleProgram {
    public void run() {
        while (true) {
            String digits = readLine("Enter a numeric string: ");
            if (digits.length() == 0) break;
            println(addCommasToNumericString(digits));
        }
    }

    private String addCommasToNumericString(String digits) {
        String result = "";
        int len = digits.length();
        for(int i = len - 1; i >= 0; i--) {
            result = digits.charAt(i) + result;
            if ((len - i) % 3 == 0 && i > 0) {
                result = "," + result;
            }
        }
        return result;
    }
}
