package edlab.eda.edp.itk.nl;

/**
 * Handle of a database element to be netlisted
 */
public interface NetlistingHandle {

  /**
   * Check if two database handles are equals
   * 
   * @param handle 
   * @return <code>true</code>
   */
  public boolean equals(NetlistingHandle handle);
}