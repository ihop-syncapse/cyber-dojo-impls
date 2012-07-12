import org.junit.*;
import static org.junit.Assert.*;

public class DiamondTest {

  @Test
  public void testHeight() {
    Diamond d = new Diamond('a');
    
    assertEquals(1, d.getHeight());

    d = new Diamond('Z');
    assertEquals(51, d.getHeight());

    d = new Diamond('c');
    assertEquals(5, d.getHeight());
  }

  @Test
  public void testOutput() {
    String exA = "A";
    Diamond d = new Diamond('A');
    assertEquals(exA, d.getOutput());

    String exB = " A\nB B\n A";
    d = new Diamond('B');
    assertEquals(exB, d.getOutput());
  }

  @Test
  public void testLargeOutput() {
    System.out.println(" ");
    Diamond d = new Diamond('D');
    System.out.println(d.getOutput());

    d = new Diamond('J');
    System.out.println(d.getOutput());
  }
}