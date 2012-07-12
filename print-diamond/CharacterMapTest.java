import org.junit.*;
import static org.junit.Assert.*;

public class CharacterMapTest {

  @Test
  public void testOrdinal() {
    assertEquals(2, CharacterMap.getOrdinal('B'));
    assertEquals(1, CharacterMap.getOrdinal('a'));
    assertEquals(26, CharacterMap.getOrdinal('Z'));
  }

  @Test
  public void testCharacter() {
    assertEquals('A', CharacterMap.getCharacter(1));
    assertEquals('C', CharacterMap.getCharacter(3));
    assertEquals('G', CharacterMap.getCharacter(7));
  }
}