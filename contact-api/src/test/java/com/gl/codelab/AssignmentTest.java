package com.gl.codelab;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class AssignmentTest {

	@Test
	void testNormalSentence() {
		assertEquals("dlroW olleH", ForCodeLabTestApplication.reverseWords("Hello World"));
	}

	@Test
	void testSingleWord() {
		assertEquals("avaJ", ForCodeLabTestApplication.reverseWords("Java"));
	}

	@Test
	void testEmptyString() {
		assertEquals("", ForCodeLabTestApplication.reverseWords(""));
	}

	@Test
	void testNullInput() {
		assertNull(null,ForCodeLabTestApplication.reverseWords(""));
	}

	@Test
	void testMultipleSpaces() {
		assertEquals("dlroW   olleH", ForCodeLabTestApplication.reverseWords("Hello   World"));
	}
}
