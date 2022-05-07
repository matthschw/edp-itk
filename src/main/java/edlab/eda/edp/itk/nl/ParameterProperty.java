package edlab.eda.edp.itk.nl;

/**
 * Handle to a parameter property
 */
public interface ParameterProperty {

  /**
   * Get the EDP name of the parameter
   * 
   * @return name
   */
  public String getName();

  /**
   * Get the name of the parameter in the design environment
   * 
   * @return name
   */
  public String getRealName();

  /**
   * Get if parameter can be blank
   * 
   * @return acceptBlank
   */
  public boolean acceptBlank();
}