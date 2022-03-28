package edlab.eda.edp.itk.nl;

/**
 * Engine for netlisting {@link InstanceNetlistingHandle}
 */
public abstract class NetlistingEngine {

  protected Formatter formatter;

  public NetlistingEngine(Formatter formatter) {
    this.formatter = formatter;
  }

  /**
   * Check if an engine is able to netlist an {@link InstanceNetlistingHandle}
   * 
   * @param handle Handle to the instance
   * @return <code>true</code> when the engine can netlist the
   *         {@link InstanceNetlistingHandle}, <code>false</code> otherwise.
   */
  public abstract boolean isDescribed(InstanceNetlistingHandle handle);

  /**
   * Netlist an {@link InstanceNetlistingHandle}
   * 
   * @param handle Handle to the instance
   * @throws UnableToNetlistException when netlisting failed.
   */
  public abstract void netlist(InstanceNetlistingHandle handle)
      throws UnableToNetlistException;
}