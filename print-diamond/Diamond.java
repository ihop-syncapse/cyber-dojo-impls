public class Diamond {

  protected int _size;

  public int getSize() {
    return _size;
  }

  public Diamond(char c) {
    _size = CharacterMap.getOrdinal(c);
  }

  public String getOutput() {
    int height = getHeight();
    int width = height;
    int halfWidth = (int) Math.floor(width / 2);
    int i, j;

    StringBuilder sb = new StringBuilder((width + 1) * height);
    for(i = 0; i < height; i++) {
      // figure out the indent, space after, and character
      int spaceBefore = Math.abs(halfWidth - i);
      int spaceAfter = (halfWidth - spaceBefore) * 2 - 1;
      int ordinal = halfWidth - spaceBefore + 1;
      char c = CharacterMap.getCharacter(ordinal);

      // draw the output
      if (i > 0) {
        sb.append('\n');
      }
      sb.append(repeatCharacter(' ', spaceBefore));
      sb.append(c);
      if (spaceAfter > 0) {
        sb.append(repeatCharacter(' ', spaceAfter));
        sb.append(c);
      }
    }
    return sb.toString();
  }

  public String repeatCharacter(char c, int count) {
    StringBuilder sb = new StringBuilder(count);
    for(int i = 0; i < count; i++) {
      sb.append(c);
    }
    return sb.toString();
  }

  public int getHeight() {
    return 1 + (_size - 1) * 2;
  }
}