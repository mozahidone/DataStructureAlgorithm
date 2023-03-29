package com.mozahidone.pattern.stringProblem;

/*
Print all characters of the input string only the characters inside the brackets
sample input: abcd(def)jk
sample output: abcd(fed)jk

sample input: abcd(def)jk(mno)
sample output: abcd(fed)jk(onm)

sample input: abcd
sample output: abcd
 */
public class ReverseInsideBracket {

    public static void main(String[] args) {
        print("abcd(efg)hijk");
        print("abcd(efg)hijk(lmn)opq");
        print("abcd");
        print("(abcd)");
    }

    public static void print(String characters) {
        char[] charArray = characters.toCharArray();
        StringBuilder reverseHolder = new StringBuilder();
        boolean isReverseChannel = false;
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (isReverseChannel) {
                if (c == ')') {
                    isReverseChannel = false;
                    System.out.print(reverse(reverseHolder.toString()));
                    System.out.print(c);
                } else {
                    reverseHolder.append(c);
                }
            } else {
                System.out.print(c);
                if (c == '(') {
                    reverseHolder = new StringBuilder();
                    isReverseChannel = true;
                }
            }
        }
        System.out.println();
    }

    public static String reverse(String input) {
        char[] arr = input.toCharArray();
        StringBuilder output = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            output = output.append(arr[i]);
        }
        return output.toString();
    }
}
