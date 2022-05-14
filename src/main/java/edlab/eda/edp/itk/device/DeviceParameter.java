package edlab.eda.edp.itk.device;

/**
 * Parameter of a {@link Device} where callbacks are executed
 */
public interface DeviceParameter {

  /**
   * Get the name of the parameter
   * 
   * @return name of parameter
   */
  public String getName();

  /**
   * Set the parameter of the device to a particular value
   * 
   * @param obj new value of the parameter
   * @return new value when valid, <code>null</code> otherwise
   */
  public Object set(final Object obj);

  /**
   * Get the value of the parameter
   * 
   * @return value
   */
  public Object get();
}