package edlab.eda.edp.itk.device;

public interface CallbackEngine {

  public boolean canHandleCallback(String parameterName);

  public CallbackEngine handleCallback(String instance, String parameterName);

}