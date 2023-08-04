package Practiced.July25;

public class StringBufferSum {
    public static void main(String args[]) {
        String s = "java is a programming language";
        StringBuffer result = new StringBuffer();
        StringBuffer temp = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char newChar = s.charAt(i);
            if (newChar == ' ') {
                result.append(temp.reverse());
                result.append('#');
                temp.setLength(0);

            } else {
                temp.append(newChar);
            }
        }
        result.append(temp.reverse());
        System.out.println(result);
    }
}