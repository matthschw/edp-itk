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
   * Get all lines of the netlist statement
   * 
   * @return lines
   */
  public String[] getLines();
  
  
  @Override
  public String toString();
}