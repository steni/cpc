package com.thearmyofcoders.cpc;

/**
 * Demonstrating Concept 5: Conditions
 */
public class NaivePasswordChecker {

    public String check(String password) {
        if (isCorrect(password)) {
            return "Correct. I will let you in.";
        } else {
            return "Wrong password";
        }
    }

    private boolean isCorrect(String password) {
        return "secret123".equals(password);
    }

    public static void main(String[] args) {
        String password = args[0];
        NaivePasswordChecker passwordChecker = new NaivePasswordChecker();
        String messageForUser = passwordChecker.check(password);
        System.out.println(messageForUser);
    }
}
