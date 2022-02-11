package edlab.eda.edp.itk.nl;

import java.util.ArrayList;

public class NetlistStatementBuilder {

  private final int maxCharacters;
  private final ArrayList<String> values;
  private final String indent;
  private final String lineContinuation;

  public NetlistStatementBuilder(int maxCharacters, String indent) {
    this.maxCharacters = maxCharacters;
    this.values = new ArrayList<>();
    this.indent = indent;
    this.lineContinuation = "";
  }

  public NetlistStatementBuilder(int maxCharacters, String indent,
      String lineContinuation) {
    this.maxCharacters = maxCharacters;
    this.values = new ArrayList<>();
    this.indent = indent;
    this.lineContinuation = lineContinuation;
  }

  public void add(String elem) {
    this.values.add(elem);
  }

  public NetlistStatementBuilder append(String elem) {
    this.values.add(elem);
    return this;
  }

  public String toString() {

    StringBuilder builder = new StringBuilder();

    boolean first = true;

    for (String string : this.getLines()) {

      if (first) {
        first = false;
      } else {
        builder.append("\n");
      }

      builder.append(string);
    }

    return builder.toString();

  }

  public String[] getLinesAsArray() {

    ArrayList<String> lines = this.getLines();
    String[] retval = new String[lines.size()];

    for (int i = 0; i < retval.length; i++) {
      retval[i] = lines.get(i);
    }

    return retval;
  }

  public ArrayList<String> getLines() {

    final ArrayList<String> lines = new ArrayList<>();

    String line = "";
    String testLine = "";

    for (final String elem : this.values) {

      if (elem.equals("\n")) {

        lines.add(line);
        line = this.indent;

      } else {

        if (elem.length() >= this.maxCharacters
            - this.lineContinuation.length()) {

          lines.add(line + this.lineContinuation);
          lines.add(this.indent + elem + this.lineContinuation);
          line = this.indent;
        } else {

          testLine = line + elem;

          if (testLine.length() > this.maxCharacters) {
            lines.add(line + this.lineContinuation);
            line = this.indent + elem;
          } else {
            line = testLine;
          }
        }
      }

    }

    lines.add(line);

    return lines;
  }
}