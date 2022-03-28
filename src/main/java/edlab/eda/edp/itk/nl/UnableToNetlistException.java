package edlab.eda.edp.itk.nl;

/**
 * Exception that is thrown when netlisting failed
 */
public class UnableToNetlistException extends Exception {

  private static final long serialVersionUID = -8221198566503216647L;
  public final InstanceNetlistingHandle handle;

  /**
   * Create a new {@link UnableToNetlistException}
   * 
   * @param handle  Handle to the instance which provoked an netlsiting error
   * @param message Message
   */
  public UnableToNetlistException(InstanceNetlistingHandle handle, String message) {
    super(message);
    this.handle = handle;
  }
}