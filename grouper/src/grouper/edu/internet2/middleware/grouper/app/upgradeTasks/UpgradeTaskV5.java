package edu.internet2.middleware.grouper.app.upgradeTasks;

import edu.internet2.middleware.grouper.app.loader.OtherJobBase.OtherJobInput;
import edu.internet2.middleware.grouper.rules.RuleUtils;

public class UpgradeTaskV5 implements UpgradeTasksInterface {

  @Override
  public void updateVersionFromPrevious(OtherJobInput otherJobInput) {
    RuleUtils.changeInheritedPrivsToActAsGrouperSystem();
  }

}
