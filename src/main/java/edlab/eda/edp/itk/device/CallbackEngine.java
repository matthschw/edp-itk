package edlab.eda.edp.itk.device;

/**
 * Engine that is able to
 */
public interface CallbackEngine {

  /**
   * Identify if the engine is able to handle the trigger of a parameter
   * 
   * @param triggeredParameter Parameter that is triggered
   * @return <code>true</code> when the engine is able to handel the trigger,
   *         <code>false</code> otherwise
   */
  public boolean canHandleCallback(String triggeredParameter);

  /**
   * Handle the callback of a {@link Device}
   * 
   * @param device             Device
   * @param triggeredParameter triggeredParameter
   * @return this
   * @throws UnableToTriggerCallbackExeption
   */
  public CallbackEngine handleCallback(Device device, String triggeredParameter)
      throws UnableToTriggerCallbackExeption;
}