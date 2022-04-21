package edlab.eda.edp.itk.device;

public interface CallbackEngine {

  public boolean canHandleCallback(String parameterName);

  public CallbackEngine handleCallback(Device device, String triggeredParameter)
      throws UnableToTriggerCallbackExeption;
}