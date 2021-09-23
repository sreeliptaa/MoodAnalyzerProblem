package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

    //Method to test if the mood is sad
    @Test
    public void whenTestedMood_ifSad_shouldReturnSad() {
        String mood = moodAnalyzer.analyzeMood("Iam sad");
        Assertions.assertEquals("sad",mood);
    }

    //Method to test if the mood is happy
    @Test
    public void whenTestedMood_ifHappy_shouldReturnHappy() {
        String mood = moodAnalyzer.analyzeMood("Happy Days");
        Assertions.assertEquals("Happy",mood);
    }


    @Test
    public void whenTestedMood_ifNotInAnyMood_shouldReturnHappy() {
        String mood = moodAnalyzer.analyzeMood("Iam not in a mood");
        Assertions.assertEquals("Happy",mood);
    }
}
