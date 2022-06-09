package com.sam.demolibsp.demosplib;

import io.airbrake.javabrake.Config;
import io.airbrake.javabrake.Notifier;


public class SpringBootBrakeDemo  {
 static Notifier notifier;  
  
  // public SpringBootBrake(int projectId, String projectKey) {
   
  // }

  public static void apply(int projectId, String projectKey)
  {
    if (projectId != 0 && projectKey != null) {
      Config config = new Config();
      config.projectId = projectId;
      config.projectKey = projectKey;
      notifier = new Notifier(config);
    }
  }

  public static Notifier getInstance()
  {
    return notifier;
  }
}