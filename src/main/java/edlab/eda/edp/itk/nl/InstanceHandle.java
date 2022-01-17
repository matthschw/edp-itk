package edlab.eda.edp.itk.nl;

import java.util.Map;
import java.util.Set;

/**
 * Handle to an instance to be netlisted
 */
public interface InstanceHandle extends NetlistingHandle {

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
  public String getLib();

  /**
   * Get cell name
   * 
   * @return cell name
   */
  public String getCell();

  /**
   * Get the parameters of the device
   * 
   * @return map of parameters. The key corresponds to the parameter name and
   *         the value to the parameter value. When a parameter is blank (not
   *         set to specific value), the key is not added to the map.
   */
  public Map<String, String> getParameters();
}