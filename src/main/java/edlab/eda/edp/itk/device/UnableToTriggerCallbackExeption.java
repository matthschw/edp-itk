package edlab.eda.edp.itk.device;

/**
 * Execption that is thrown when triggerung of the callbalck failed
 */
public final class UnableToTriggerCallbackExeption extends Exception {

  private static final long serialVersionUID = 5569598843290773634L;

  public final Device device;
  public final String triggeredParameter;

  /**
   * Create a excetion
   * 
   * @param device             Device
   * @param triggeredParameter Parameter that is triggered
   * @param message            Message
   */
  public UnableToTriggerCallbackExeption(final Device device,
      final String triggeredParameter, final String message) {
    this.device = device;
    this.triggeredParameter = triggeredParameter;
  }
}