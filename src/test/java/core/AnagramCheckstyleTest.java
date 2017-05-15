package core;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AnagramCheckstyleTest {
	
	 
	
  @Test
  public void testAnagramCheckstyle1() {
	  
	  String s = new String("Debit Card");
	  String t = new String("Bad Credit");
	  
	  System.out.println("Debit Card and Bad Credit is anagram? - " + AnagramCheckstyle.validate(s, t));
	  Assert.assertTrue(AnagramCheckstyle.validate(s, t));
	  
	   
  }

@Test
  public void testAnagramCheckstyle2() {
	  
	  String s = new String("Охренеть");
	  String t = new String("Не хрена себе");
	  
	  System.out.println("Охренеть and Не хрена себе is anagram? - " + AnagramCheckstyle.validate(s, t));
	  Assert.assertFalse(AnagramCheckstyle.validate(s, t));
  }
  
}
