package PROF_2018_EX1.Forcada;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyStringTest {
	
	private MyString s1;
	private MyString s2;
	
	@Test
	public void testMyStringCompareToS1LessLengthThanS2() {
		s1 = new MyString("a");
		s2 = new MyString("aa");
		
		// Nodes: 1->3->4->5->4->5->7->8->9->10
		assertEquals(s1.compareTo(s2), -1);
	}
	
	@Test
	public void testMyStringCompareToS1MoreLengthThanS2() {
		s1 = new MyString("aa");
		s2 = new MyString("a");
		
		// Nodes: 1->2->4->5->4->5->7->8->9->10
		assertEquals(s1.compareTo(s2), 1);
	}
	
	@Test
	public void testMyStringCompareToSameLengthsSameCharacters() {
		s1 = new MyString("ab");
		s2 = new MyString("ab");
		
		// Nodes: 1->3->4->5->4->5->4->8->10
		assertEquals(s1.compareTo(s2), 0);
	}
	
	@Test
	public void testMyStringCompareToSameLengthsS1LowerCharacter() {
		s1 = new MyString("ab");
		s2 = new MyString("cb");
		
		// Nodes: 1->3->4->5->4->5->6->8->10
		assertEquals(s1.compareTo(s2), -2);
	}
}
