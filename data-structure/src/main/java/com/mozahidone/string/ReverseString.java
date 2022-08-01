package com.mozahidone.string;

// How do you reverse a given string in place?
public class ReverseString {

    public static void main(String[] args) {
        String data = "abcde";
        System.out.println(reverseString(data));
    }

    public static String reverseString(String data) {
        if(data == null || data.isEmpty())
            return data;
        char[] characters = data.toCharArray();
        int i = 0, j = data.length() - 1;

        while(i < j) {
            char temp = characters[i];
            characters[i] = characters[j];
            characters[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(characters);
    }
}
