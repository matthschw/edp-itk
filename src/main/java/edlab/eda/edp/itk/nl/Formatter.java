package edlab.eda.edp.itk.nl;

/**
 * Formatter for netlisting
 */
public interface Formatter {

  /**
   * Check if a subcircuit with a given name is already added to the netlist
   * 
   * @param name name to be checked
   * @return <code>true</code> when is already a subcircuit name,
   *         <code>false</code> otherwise
   */
  public boolean isSubcircuitName(String name);

  /**
   * Append a netlisting statement for a given instance
   * 
   * @param handle    Handle to the instance
   * @param statement Netlisting statement to be added
   * 
   * @return <code>this</code> when successfull, <code>null</code> otherwise
   */
  public Formatter append(InstanceNetlistingHandle handle, String statement);

  /**
   * Append a netlisting statement for a given instance
   * 
   * @param handle  Handle to the instance
   * @param builder Builder
   * 
   * @return <code>this</code> when successfull, <code>null</code> otherwise
   */
  public Formatter append(InstanceNetlistingHandle handle,
      NetlistStatementBuilder builder);

  /**
   * Append a named netlist statement
   * 
   * @param name      Name
   * @param statement Netlisting statement to be added
   * 
   * @return <code>this</code> when successfull, <code>null</code> otherwise
   */
  public Formatter append(String name, String statement);

  /**
   * Append a named netlisting statement
   * 
   * @param name    Name
   * @param builder Builder
   * 
   * @return <code>this</code> when successfull, <code>null</code> otherwise
   */
  public Formatter append(String name, NetlistStatementBuilder builder);

  /**
   * Append an unnamed netlist statement
   * 
   * @param statement Netlisting statement to be added
   * 
   * @return <code>this</code> when successfull, <code>null</code> otherwise
   */
  public Formatter append(String statement);

  /**
   * Append a unnamed netlisting statement
   * 
   * @param builder Builder
   * 
   * @return <code>this</code> when successfull, <code>null</code> otherwise
   */
  public Formatter append(NetlistStatementBuilder builder);

  /**
   * Get the name of the ground net
   * 
   * @return name of ground net
   */
  public String getGround();

  /**
   * Get an empty netlist statement builder
   * 
   * @return builder
   */
  public NetlistStatementBuilder getStatementBuilder();
}