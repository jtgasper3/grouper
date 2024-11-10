package edu.internet2.middleware.grouper.app.upgradeTasks;

import edu.internet2.middleware.grouper.app.loader.OtherJobBase.OtherJobInput;
import edu.internet2.middleware.grouper.misc.AddMissingGroupSets;

public class UpgradeTaskV6 implements UpgradeTasksInterface {

  @Override
  public void updateVersionFromPrevious(OtherJobInput otherJobInput) {
    new AddMissingGroupSets().addMissingSelfGroupSetsForStems();
  }

}
