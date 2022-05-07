package edlab.eda.edp.itk.nl;

import java.util.ArrayList;

/**
 * Builder for a netlist statement
 */
public final class NetlistStatementBuilder {

  /**
   * Maximal characters per line (default)
   */
  public final int CHARACTERS_PER_LINE = 80;

  private final int maxCharacters;
  private final ArrayList<String> values;
  private final String indent;
  private final String lineContinuation;

  /**
   * Create a new builder
   */
  public NetlistStatementBuilder() {
    this.maxCharacters = this.CHARACTERS_PER_LINE;
    this.values = new ArrayList<>();
    this.indent = "";
    this.lineContinuation = "";
  }

  /**
   * Create a new builder
   * 
   * @param indent intendation of new line
   */
  public NetlistStatementBuilder(final String indent) {
    this.maxCharacters = this.CHARACTERS_PER_LINE;
    this.values = new ArrayList<>();
    this.indent = indent;
    this.lineContinuation = "";
  }

  /**
   * Create a new builder
   * 
   * @param indent           intendation of new line
   * @param lineContinuation line continuation character
   */
  public NetlistStatementBuilder(final String indent, final String lineContinuation) {
    this.maxCharacters = this.CHARACTERS_PER_LINE;
    this.values = new ArrayList<>();
    this.indent = indent;
    this.lineContinuation = lineContinuation;
  }

  /**
   * Create a new builder
   * 
   * @param maxCharacters max number of characters per line
   * @param indent        intendation of new line
   */
  public NetlistStatementBuilder(final int maxCharacters, final String indent) {

    if (maxCharacters > 0) {
      this.maxCharacters = maxCharacters;
    } else {
      this.maxCharacters = this.CHARACTERS_PER_LINE;
    }

    this.values = new ArrayList<>();
    this.indent = indent;
    this.lineContinuation = "";
  }

  /**
   * Create a new builder
   * 
   * @param maxCharacters    max number of characters per line
   * @param indent           intendation of new line
   * @param lineContinuation line continuation character
   */
  public NetlistStatementBuilder(final int maxCharacters, final String indent,
      final String lineContinuation) {

    if (maxCharacters > 0) {
      this.maxCharacters = maxCharacters;
    } else {
      this.maxCharacters = this.CHARACTERS_PER_LINE;
    }

    this.values = new ArrayList<>();
    this.indent = indent;
    this.lineContinuation = lineContinuation;
  }

  /**
   * Add a string to the builder
   * 
   * @param elem string to be added
   */
  public void add(final String elem) {
    this.values.add(elem);
  }

  /**
   * Append a string to the builder
   * 
   * @param elem string to be added
   * @return this
   */
  public NetlistStatementBuilder append(final String elem) {
    this.values.add(elem);
    return this;
  }

  @Override
  public String toString() {

    final StringBuilder builder = new StringBuilder();

    boolean first = true;

    for (final String string : this.getLines()) {

      if (first) {
        first = false;
      } else {
        builder.append("\n");
      }

      builder.append(string);
    }

    return builder.toString();
  }

  /**
   * Get the individual lines of the netlist statement as array
   * 
   * @return array of lines
   */
  public String[] getLinesAsArray() {

    final ArrayList<String> lines = this.getLines();
    final String[] retval = new String[lines.size()];

    for (int i = 0; i < retval.length; i++) {
      retval[i] = lines.get(i);
    }

    return retval;
  }

  /**
   * Get a list of the individual lines of the netlist statement
   * 
   * @return list
   */
  public ArrayList<String> getLines() {

    final ArrayList<String> lines = new ArrayList<>();

    String line = "";
    String testLine = "";

    for (final String elem : this.values) {

      if (elem.equals("\n")) {

        lines.add(line);
        line = this.indent;

      } else if (elem.length() >= (this.maxCharacters
          - this.lineContinuation.length())) {

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

    lines.add(line);

    return lines;
  }
}