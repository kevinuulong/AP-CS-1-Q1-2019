/**
 * strings
 */
public class strings {

    public static void main(String[] args) {
        String thing = "Hello, world!";
/*        for (int i = 0; i < thing.length(); i++) {
            System.out.println(thing.charAt(i));
        }
        System.out.println(thing.substring(7, 13));
        System.out.println(substring("Kevin Long", 5));
    }

    public static String substring(String str, int index){
        String output = "";
        for (int i = index; i < str.length(); i++){
            output += str.charAt(i);
        }
        return output;
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10-i; j++) {
                System.out.print(i*j+"\t");
            }
            System.out.println();
        }
        */
        //System.out.println(thing.indexOf("world"));

        //System.out.println(charat("stringtest",2));
        //System.out.println(reverse("kevin"));
        //char c = 'A';
        //System.out.println((int)c);

        //From:     ABCDEFGHIJKLMNOPQRSTUVWXYZ
        //To:   ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ
        //          ^

        for (int i = 65; i <= 90; i++) {
            System.out.print(shift((char)i,4));
        }
    }

    public static char shift(char x, int shift){
        shift %= 26;
        char output = (char) ((int)x+shift);
        if ((int)output>90){
            output = (char) ((int) output -26);
        } else if((int)output<65){
            output = (char) ((int) output +26);
        }
        return output;
    }
/*
    public static int indexOf(String word, String c){
        int output = -1;
        
        return output;
    }*/

    public static char charat(String str, int index){
        char[] charArray = str.toCharArray();
        return charArray[index];
    }

    public static String reverse(String str){
        int control = str.length();
        String output = "";
        while (control > 0){
            output += str.charAt(control-1);
            control--;
        }
        return output;
    }
}