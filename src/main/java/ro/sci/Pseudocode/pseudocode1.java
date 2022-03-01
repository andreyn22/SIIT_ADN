// https://www.geeksforgeeks.org/print-words-string-reverse-order/?ref=lbp
class pseudocode1 {
    static String wordReverse(String str)
    {
        int i = str.length() - 1;
        int start, end = i + 1;
        String result = "";
        while (i >= 0) {
            if (str.charAt(i) == ' ') {
                start = i + 1;
                while (start != end)
                    result += str.charAt(start++);
                result += ' ';
                end = i;
            }
            i--;
        }
        start = 0;
        while (start != end)
            result += str.charAt(start++);
        return result;
    }

    // Driver code
    public static void main(String[] args)
    {
        String str = "A B";
        System.out.print(wordReverse(str));
    }
}

