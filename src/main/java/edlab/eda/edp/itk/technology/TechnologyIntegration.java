package edlab.eda.edp.itk.technology;

import edlab.eda.edp.itk.nl.Formatter;
import edlab.eda.edp.itk.nl.NetlistingEngine;

public abstract class TechnologyIntegration {
  

  public abstract boolean hasNetlistingEngine(String simulator);

  public abstract NetlistingEngine getNetlistingEngine(String simulator,
      Formatter formatter);
}