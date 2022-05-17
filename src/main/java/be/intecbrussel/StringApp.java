package be.intecbrussel;

import org.apache.commons.lang3.StringUtils;

public class StringApp {
    public static void main(String[] args) {
        String[] arr = new String[]{"Hello", "I", "am", "happy"};
        String sentence = StringUtils.join(arr, "+"); // Hello I am happy
        System.out.println(sentence);
    }
}



























