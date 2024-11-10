package edu.internet2.middleware.grouper.app.upgradeTasks;

import edu.internet2.middleware.grouper.app.loader.OtherJobBase.OtherJobInput;
import edu.internet2.middleware.grouper.misc.AddMissingGroupSets;

public class UpgradeTaskV1 implements UpgradeTasksInterface {

  @Override
  public void updateVersionFromPrevious(OtherJobInput otherJobInput) {
      
    new AddMissingGroupSets().addMissingSelfGroupSetsForGroups();
    
  }

}
