package com.company;

import java.util.ArrayList;

public class WordsFinder {

    private static final String VOWELS = "aeiouy";
    private static final String CONSONANTS = "bcdfghjklmnpqrstvwxz";

    public static String findLatinWords(String line) {
        String stringWithLatinWords = "";
        int counter = 0;
        for (String splitedLine : line.split(" ")) {
            for (char letter : splitedLine.toLowerCase().toCharArray()) {
                if ((int) letter > 122 || (int) letter < 97) {
                    break;
                } else {
                    counter++;
                }
            }
            if (counter == splitedLine.length()) {
                stringWithLatinWords += splitedLine + " ";
            }
            counter = 0;
        }
        return stringWithLatinWords.trim().toLowerCase();
    }

    public static String[] findEqualVowelsAndConsonats(String line) {
        int vovelCounter = 0;
        int consonatsCounter = 0;
        ArrayList<String> arrayList = new ArrayList<>();
        for (String word : line.split(" ")) {
            for(char character : word.toCharArray()){
                if(isVowel(character)){
                    vovelCounter++;
                }else if(isConsonants(character)){
                    consonatsCounter++;
                }
            }
            if(consonatsCounter==vovelCounter){
                arrayList.add(word);
            }
            vovelCounter=0;
            consonatsCounter=0;
        }
        String [] str = arrayList.toArray(new String[arrayList.size()]);
        return str;
    }

    public static boolean isVowel(char ch) {

        return VOWELS.indexOf(ch) >= 0;
    }

    public static boolean isConsonants(char ch) {

        return CONSONANTS.indexOf(ch) >= 0;
    }

}
