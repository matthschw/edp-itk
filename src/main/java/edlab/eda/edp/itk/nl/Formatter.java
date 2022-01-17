package edlab.eda.edp.itk.nl;

/**
 * Formatter for netlisting
 */
public interface Formatter {

  /**
   * Check if a subcircuit with a given name is already added to the netlist
   * 
   * @param name Name to be checked
   * @return <code>true</code> when is already a subcircuit name,
   *         <code>false</code> otherwise
   */
  public boolean isSubcircuitName(String name);

  /**
   * Append a netlisting statement for a given instance
   * 
   * @param handle    Handle to the instance
   * @param statement Netlisting statement
   * @return
   */
  public void append(InstanceHandle handle, String statement);
}