package Practiced.July13;

public class StringDemo {
    public static void main(String args[]) {
        String str = new String("masthan");
        String newStr = str.concat(" puli");
        System.out.println(newStr);
        if (new String("tony") == new String("tony")) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}