package session4;

public class WarmUpCodingChallenge {
    public static void main(String[] args) {

    }


    public static void combinationOfBoth(String a, String b) {
        String result = "";
        int i = 0, y = 0;

        while (i < a.length() || y < b.length()) {
            if (i < a.length()) {
                result = result + a.charAt(i);
                i++;
            }
            if (y < b.length()) {
                result = result + b.charAt(y);
                y++;
            }

        }}

}
