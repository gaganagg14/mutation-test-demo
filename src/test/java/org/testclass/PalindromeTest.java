package org.testclass;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
public class PalindromeTest
{
    @Test
    void testIsPalindrome() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(palindromeTester.isPalindrome("noon"), "noon should be a palindrome");
    }
}
