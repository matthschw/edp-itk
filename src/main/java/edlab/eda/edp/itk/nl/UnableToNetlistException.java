package edlab.eda.edp.itk.nl;

public class UnableToNetlistException extends Exception {

  private static final long serialVersionUID = -8221198566503216647L;
  public final InstanceHandle handle;

  public UnableToNetlistException(InstanceHandle handle, String message) {
    super(message);
    this.handle = handle;
  }
}