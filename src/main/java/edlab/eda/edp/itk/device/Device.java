package edlab.eda.edp.itk.device;

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
}