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
   * @return
   */
  public Map<String, String> getConnections();

  /**
   * @return
   */
  public String getLib();

  /**
   * @return
   */
  public String getCell();

  /**
   * @return
   */
  public Map<String, String> getParameters();

  /**
   * @return
   */
  public Set<String> getParameterNames();
}