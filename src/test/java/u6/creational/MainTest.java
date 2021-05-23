package u6.creational;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import u6.creational.Main;

/**
 * @author sairaghava.com
 */
public class MainTest {

  @Test
  public void testHello() {
    assertEquals("Hell! 00", new Main().sayHello());
  }
}
