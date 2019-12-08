package endTerm.question8;

//Design a java program to input a String from the user and
// prints the frequency of each vowel in the entered String.
public class Question8 {
    private String string;

    public Question8(String string) {
        this.string = string;
    }

    public int[] calculateFrequency() {
        int[] freq = new int[5];
        string = string.toLowerCase();
        for (char i : string.toCharArray()) {
            if (i == 'a') {
                freq[0]++;
            }
            if (i == 'e') {
                freq[1]++;
            }
            if (i == 'i') {
                freq[2]++;
            }
            if (i == 'o') {
                freq[3]++;
            }
            if (i == 'u') {
                freq[4]++;
            }
        }
        return freq;
    }

}
