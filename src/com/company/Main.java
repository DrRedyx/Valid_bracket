package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String brackets = scanner.nextLine();
        int count = 0;
        Stack<Character> stackBracket = new Stack<>();
        StringBuilder bracketBuilder = new StringBuilder();

        for (int i = 0; i < brackets.length(); i++) {
            if (brackets.charAt(i) == '(') {
                stackBracket.push(brackets.charAt(i));
            }
            else {
                if(!stackBracket.empty()) {
                    bracketBuilder.append(stackBracket.pop());
                    count++;
                    if (i+1 == brackets.length() || brackets.charAt(i + 1) == '(') {
                        for (int j = 0; j < count; j++) {
                            bracketBuilder.append(')');
                        }
                        count = 0;
                    }
                }
            }
        }
        System.out.println(bracketBuilder + " - " + bracketBuilder.length()/2);
    }
}
