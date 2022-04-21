package edlab.eda.edp.itk.device;

public final class UnableToTriggerCallbackExeption extends Exception {

  private static final long serialVersionUID = 5569598843290773634L;

  public final Device device;
  public final String triggeredParameter;

  public UnableToTriggerCallbackExeption(Device device,
      String triggeredParameter) {
    this.device = device;
    this.triggeredParameter = triggeredParameter;
  }
}