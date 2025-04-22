package org.testclass;

import org.junit.jupiter.api.Test;
import org.testclass.FirstDuplicateCharInString;

import static org.junit.jupiter.api.Assertions.*;

public class FirstDuplicateCharInStringTest {

    @Test
    void testFirstDupChar() {
        FirstDuplicateCharInString tester = new FirstDuplicateCharInString();


        // Test with empty string
        assertNull(tester.firstDupChar(""), "Empty string should return null");
        
        // Test with no duplicates
        assertNull(tester.firstDupChar("abcdef"), "String with no duplicates should return null");
        
        // Test with duplicates
        assertEquals('a', tester.firstDupChar("abcda"), "Should find 'a' as first duplicate");
        assertEquals('l', tester.firstDupChar("hello"), "Should find 'l' as first duplicate");
        assertEquals('1', tester.firstDupChar("12341"), "Should find '1' as first duplicate in numeric string");
        
        // Test with all duplicates
        assertEquals('a', tester.firstDupChar("aaa"), "Should find 'a' as first duplicate in repeated chars");
    }
}