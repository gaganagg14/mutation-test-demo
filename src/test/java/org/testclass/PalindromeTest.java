package org.testclass;


import org.junit.jupiter.api.Test;
import org.testclass.FirstDuplicateCharInString;
import org.testclass.Palindrome;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class PalindromeTest
{
    @Test
    void testIsPalindrome() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(palindromeTester.isPalindrome("noon"), "noon should be a palindrome");
        assertTrue(palindromeTester.isPalindrome(""), "empty string should be a palindrome");
        assertTrue(palindromeTester.isPalindrome("a"), "single character should be a palindrome");
        assertTrue(palindromeTester.isPalindrome("racecar"), "racecar should be a palindrome");
        assertFalse(palindromeTester.isPalindrome("test"), "test should not be a palindrome");
        assertFalse(palindromeTester.isPalindrome("hello"), "hello should not be a palindrome");
    }


}
