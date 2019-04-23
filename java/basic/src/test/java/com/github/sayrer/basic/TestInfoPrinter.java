package com.github.sayrer.basic;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestInfoPrinter {
  @Test
  public void testPrint() throws Exception {
    assertEquals("Hi from Java!", InfoPrinter.getString());
  }
}