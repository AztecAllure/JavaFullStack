package Practiced.July25;

public class ReverseWord {
    public static void main(String args[]) {
        String input = "bootstrap";
        StringBuffer result = new StringBuffer();
        StringBuffer temp = new StringBuffer();
        for (int i = 0; i < input.length() - 1; i++) {
            char word = input.charAt(i);
            if (i == 0) {
                result.append(word);
            } else {
                temp.append(word);
            }
        }
        result.append(temp.reverse());
        result.append(input.charAt(input.length() - 1));
        System.out.println(result);
    }
}