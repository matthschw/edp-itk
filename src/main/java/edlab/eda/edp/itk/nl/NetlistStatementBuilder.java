package edlab.eda.edp.itk.nl;

/**
 * Get a builder for a netlist statement
 */
public interface NetlistStatementBuilder {

  /**
   * Append a new token to the statement
   * 
   * @param token Token
   * @return this
   */
  public NetlistStatementBuilder append(final String token);

  /**
   * Get a string of the builder
   * 
   * @return string
   */
  public String toString();
}