public class StringExample {

    public boolean isPalindrome(String str) { for(int i = 0; i < str.length() / 2; i++) {
        if (str.charAt(i) != str.charAt(str.length() - (i + 1))) { return false;
        } }
        return true;
    }

    public String reverseString(String str) { String result = "";
        for(int i = 0 ; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        return result;
    }
    public boolean simpleIsPalindrome(String str) {
        return (str.equals(reverseString(str)));
    }

    public String replaceFirstOccurrence(String str, String orig,
                                         String repl) {
        int index = str.indexOf(orig);
        if (index != -1) {
            str = str.substring(0, index)
                    + repl
                    + str.substring(index + orig.length());
        }
        return str; }
}
