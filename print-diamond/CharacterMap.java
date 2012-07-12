public class CharacterMap {
  public static int getOrdinal(char character) {
    if (!Character.isLetter(character)) {
      throw new RuntimeException("Invalid Character: " + character);
    }
    character = Character.toUpperCase(character);
    return (int) (character - 'A') + 1;
  }

  public static char getCharacter(int ordinal) {
    if ((ordinal < 1) || (ordinal > 26)) {
      throw new RuntimeException("Invalid Ordinal: " + ordinal);
    }
    return (char) ('A' + (ordinal - 1));
  }
}