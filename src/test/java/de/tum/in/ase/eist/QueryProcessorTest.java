package de.tum.in.ase.eist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class QueryProcessorTest {

	private final QueryProcessor queryProcessor = new QueryProcessor();

	@Test
	void testEmptyStringIfCannotProcessQuery() {
		assertEquals("", queryProcessor.process("test"));
	}

	@Test
	void testKnowsAboutShakespeare() {
		String actual = queryProcessor.process("Shakespeare");
		if (!actual.contains("playwright")) {
			fail("The QueryProcessor does not know about Shakespeare.");
		}
	}

	@Test
	void isNotCaseSensitive() {
		String actual = queryProcessor.process("shakespeare");
		if (!actual.contains("playwright")) {
			fail("Your QueryProcessor should not be case sensitive.");
		}
	}

	@Test
	void testName(){
		String actual = queryProcessor.process("what is your name");
		if (!actual.contains("Julian")) {
			fail("The QueryProcessor does not know about your name.");
		}
	}

	@Test
	void plus(){
		String actual = queryProcessor.process("what is 3 plus 10");
		if (!actual.equals("13")) {
			fail("The QueryProcessor does not know about your name.");
		}
	}

	@Test
	void mult(){
		String actual = queryProcessor.process("what is 10 multiplied by 13");
		if (!actual.equals("130")) {
			fail("The QueryProcessor does not know about your name.");
		}
	}

	@Test
	void largest(){
		String actual = queryProcessor.process("which of the following numbers is the largest: 52, 157");
		if (!actual.equals("157")) {
			fail("The QueryProcessor does not know about your name.");
		}
	}

	@Test
	void sqaure(){
		String actual = queryProcessor.process("which of the following numbers is both a square and a cube: 149, 256, 277, 1936");
		if (!actual.equals("157")) {
			fail("The QueryProcessor does not know about your name.");
		}
	}

}
