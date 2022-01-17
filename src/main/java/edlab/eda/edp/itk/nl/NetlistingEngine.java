package edlab.eda.edp.itk.nl;

public abstract class NetlistingEngine {

  protected Formatter formatter;

  public NetlistingEngine(Formatter formatter) {
    this.formatter = formatter;
  }

  public abstract boolean isDescribed(InstanceHandle handle);

  public abstract void netlist(InstanceHandle handle) throws UnableToNetlistException;
}