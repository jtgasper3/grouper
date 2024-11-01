package edu.internet2.middleware.grouper.app.provisioning.targetDao;

import java.util.HashMap;
import java.util.Map;

import edu.internet2.middleware.grouper.app.provisioning.GrouperProvisioningLists;
import edu.internet2.middleware.grouper.app.provisioning.ProvisioningEntity;
import edu.internet2.middleware.grouper.app.provisioning.ProvisioningGroup;

public class TargetDaoRetrieveAllDataResponse {
  private GrouperProvisioningLists targetData;

  
  public GrouperProvisioningLists getTargetData() {
    return targetData;
  }

  
  public void setTargetData(GrouperProvisioningLists targetData) {
    this.targetData = targetData;
  }


  public TargetDaoRetrieveAllDataResponse() {
  }


  public TargetDaoRetrieveAllDataResponse(
      GrouperProvisioningLists targetData) {
    this.targetData = targetData;
  }
  
  /**
   * map of retrieved entity to target native entity, optional, only if the target native entity is needed later on
   */
  private Map<ProvisioningEntity, Object> targetEntityToTargetNativeEntity = new HashMap<ProvisioningEntity, Object>();

  
  /**
   * map of retrieved entity to target native entity, optional, only if the target native entity is needed later on
   * @return
   */
  public Map<ProvisioningEntity, Object> getTargetEntityToTargetNativeEntity() {
    return targetEntityToTargetNativeEntity;
  }

  /**
   * map of retrieved entity to target native entity, optional, only if the target native entity is needed later on
   * @param targetEntityToTargetNativeEntity
   */
  public void setTargetEntityToTargetNativeEntity(Map<ProvisioningEntity, Object> targetEntityToTargetNativeEntity) {
    this.targetEntityToTargetNativeEntity = targetEntityToTargetNativeEntity;
  }
  
  /**
   * map of retrieved group to target native group, optional, only if the target native group is needed later on
   */
  private Map<ProvisioningGroup, Object> targetGroupToTargetNativeGroup = new HashMap<ProvisioningGroup, Object>();

  
  /**
   * map of retrieved group to target native group, optional, only if the target group entity is needed later on
   * @return
   */
  public Map<ProvisioningGroup, Object> getTargetGroupToTargetNativeGroup() {
    return targetGroupToTargetNativeGroup;
  }

  /**
   * map of retrieved group to target native group, optional, only if the target native group is needed later on
   * @param targetGroupToTargetNativeGroup
   */
  public void setTargetGroupToTargetNativeGroup(Map<ProvisioningGroup, Object> targetGroupToTargetNativeGroup) {
    this.targetGroupToTargetNativeGroup = targetGroupToTargetNativeGroup;
  }

  
}
