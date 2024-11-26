package edu.internet2.middleware.grouper.app.upgradeTasks;

import edu.internet2.middleware.grouper.app.loader.OtherJobBase.OtherJobInput;
import edu.internet2.middleware.grouper.app.serviceLifecycle.GrouperRecentMemberships;

public class UpgradeTaskV3 implements UpgradeTasksInterface {

  @Override
  public void updateVersionFromPrevious(OtherJobInput otherJobInput) {
    GrouperRecentMemberships.upgradeFromV2_5_29_to_V2_5_30();
  }

}
