package cd.labs.chapter6.review;

import java.util.Arrays;
import java.util.List;

public class Problem03 {
    public static String emphasizeAdjective(String sentence) {
        List<String> ADJECTIVES = Arrays.asList("sweet", "bad", "blue", "great", "small", "large", "spicy", "bland");
        String[] words = sentence.split(" ");
        StringBuilder builder = new StringBuilder();
        for(String word: words){
            if(ADJECTIVES.contains(word)) {
                word = "very " + word;
            }
            builder.append(word +" ");
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(emphasizeAdjective("The candy is sweet"));
    }
}
