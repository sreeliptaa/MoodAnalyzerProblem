package com.bridgelabz;

/**
 * Purpose : Implementing Mood Analyser Program
 * @author Sreelipta
 * @since 2021-09-24
 */

public class MoodAnalyzer {
    public static String analyzeMood(String message) {
        if (message.contains("sad"))
            return "sad";
        else
            return "Happy";

    }
}
