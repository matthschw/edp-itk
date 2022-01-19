package edlab.eda.edp.itk.nl;

/**
 * Handle to parameter properties
 */
public interface ParameterProperty {

  /**
   * Get the EDP name of the parameter
   * 
   * @return name
   */
  public String getName();

  /**
   * Get the name of the parameter in Virtuoso
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