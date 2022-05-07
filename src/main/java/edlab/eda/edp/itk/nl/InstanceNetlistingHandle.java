package edlab.eda.edp.itk.nl;

import java.util.Map;

/**
 * Handle to an instance to be netlisted
 */
public interface InstanceNetlistingHandle {

  /**
   * Get the instance name
   * 
   * @return instance name
   */
  public String getInstanceName();

  /**
   * Get the connections to the device
   * 
   * @return map of connections. The key corresponds to the terminal and the
   *         value to the attached net/signal.
   */
  public Map<String, String> getConnections();

  /**
   * Get library name
   * 
   * @return library name
   */
  public String getLibraryName();

  /**
   * Get cell name
   * 
   * @return cell name
   */
  public String getCellName();

  /**
   * Identify if the instance is defined in subcircuit
   * 
   * @return <code>true</code> when the instance is defined in a subcircuit,
   *         <code>false</code> otherwise
   */
  public abstract boolean inSubcircuit();

  /**
   * Get the parameters of the device
   * 
   * @return map of parameters. The key corresponds to the parameter name and
   *         the value to the parameter value. When a parameter is blank (not
   *         set to specific value), the key is not added to the map.
   */
  public Map<String, String> getParameters();

  /**
   * Get all properties of a parameter
   * 
   * @return property
   */
  public ParameterProperty getParameterProperty(String name);

  /**
   * Get an empty netlist statement builder for the instance
   * 
   * @return builder
   */
  public NetlistStatementBuilder getStatementBuilder();
}