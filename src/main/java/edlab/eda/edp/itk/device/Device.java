package edlab.eda.edp.itk.device;

import java.math.BigDecimal;
import java.util.Map;

/**
 * Reference to a device where callbacks are executed
 */
public interface Device {

  /**
   * Get the name of the instance
   * 
   * @return name of instance
   */
  public String getInstanceName();

  /**
   * Get the library name of the schematic that contains the device. When the
   * device is instantiated in a netlist, <code>null</code> is returned
   * 
   * @return library name
   */
  public String getLibraryName();

  /**
   * Get the cell name of the schematic that contains the device. When the
   * device is instantiated in a netlist, <code>null</code> is returned
   * 
   * @return library name
   */
  public String getCellName();

  /**
   * Get the cell name of the schematic that contains the device. When the
   * device is instantiated in a netlist, <code>null</code> is returned
   * 
   * @return cell name
   */
  public String getViewName();

  /**
   * Get the library name of the the instance
   * 
   * @return library name
   */
  public String getMasterLibraryName();

  /**
   * Get the cell name of the the instance
   * 
   * @return cell name
   */
  public String geMastertCellName();

  /**
   * Get a map of all parameters in the device. The key corresponds to the name
   * of the parameter and the value to the corresponding parameter
   * 
   * @return map of parameters
   */
  public Map<String, DeviceParameter> getDeviceParameters();

  /**
   * Identify if a device has a technology parameter
   * 
   * @param name Name of the technology parameter
   * @return <code>true</code> when available, <code>false</code> otherwise
   */
  public boolean hasTechnologyParameter(final String name);

  /**
   * Get a technology parameter
   * 
   * @param name Name of the technology parameter
   * @return value when available, <code>null</code> otherwise
   */
  public BigDecimal getTechnologyParameter(final String name);

  /**
   * Identify if a device has a technology parameter
   * 
   * @param name Name of the technology parameter
   * @return <code>true</code> when available, <code>false</code> otherwise
   */
  public boolean hasTechnologyParameter(final String name, final String key);

  /**
   * Get a technology paramater
   * 
   * @param name Name of the technology parameter
   * @param key  Key of the technology parameter
   * @return value when available, <code>null</code> otherwise
   */
  public BigDecimal getTechnologyParameter(final String name, final String key);
}