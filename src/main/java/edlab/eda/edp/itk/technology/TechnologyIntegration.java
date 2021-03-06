package edlab.eda.edp.itk.technology;

import edlab.eda.edp.itk.device.CallbackEngine;
import edlab.eda.edp.itk.nl.Formatter;
import edlab.eda.edp.itk.nl.NetlistingEngine;

/**
 * Integrator Tool-Kit for customizing the semiconductor technology. You must
 * derive this class to create your own technology integration.
 */
public abstract class TechnologyIntegration {

  /**
   * Check if the {@link TechnologyIntegration} can return a
   * {@link NetlistingEngine} for a simulator with a given name
   * 
   * @param simulator name of simulator, e.g. "spectre"
   * @return <code>true</code> when the {@link TechnologyIntegration} can return
   *         a {@link NetlistingEngine} for the simulator , <code>false</code>
   *         otherwise.
   */
  public abstract boolean hasNetlistingEngine(String simulator);

  /**
   * Get a {@link NetlistingEngine} for simulator
   * 
   * @param simulator name of simulator, e.g. "spectre"
   * @param formatter Netlisting formatter
   * @return netlisting engine
   */
  public abstract NetlistingEngine getNetlistingEngine(String simulator,
      Formatter formatter);

  /**
   * Identify if a primitive has a callback engine
   * 
   * @param libName  Library name
   * @param cellName Cell name
   * @return <code>true</code> when the device has a {@link CallbackEngine},
   *         <code>false</code> otherwise
   */
  public abstract boolean hasCallbackEngine(String libName, String cellName);

  /**
   * Get a {@link CallbackEngine} of a device
   * 
   * @param libName  Library name
   * @param cellName Cell name
   * 
   * @return callback engine when available, <code>null</code> otherwise
   */
  public abstract CallbackEngine getCallbackEngine(String libName,
      String cellName);
}