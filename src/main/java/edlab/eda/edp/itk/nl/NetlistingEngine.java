package edlab.eda.edp.itk.nl;

/**
 * Engine for netlisting {@link InstanceHandle}
 */
public abstract class NetlistingEngine {

  protected Formatter formatter;

  public NetlistingEngine(Formatter formatter) {
    this.formatter = formatter;
  }

  /**
   * Check if an engine is able to netlist an {@link InstanceHandle}
   * 
   * @param handle Handle to the instance
   * @return <code>true</code> when the engine can netlist the
   *         {@link InstanceHandle}, <code>false</code> otherwise.
   */
  public abstract boolean isDescribed(InstanceHandle handle);

  /**
   * Netlist an {@link InstanceHandle}
   * 
   * @param handle Handle to the instance
   * @throws UnableToNetlistException when netlisting failed.
   */
  public abstract void netlist(InstanceHandle handle)
      throws UnableToNetlistException;
}