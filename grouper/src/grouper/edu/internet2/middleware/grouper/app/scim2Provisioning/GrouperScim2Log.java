/**
 * @author mchyzer
 * $Id: TfRestLogicTrafficLog.java,v 1.1 2013/06/20 06:02:50 mchyzer Exp $
 */
package edu.internet2.middleware.grouper.app.scim2Provisioning;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import edu.internet2.middleware.grouper.app.provisioning.GrouperProvisioner;
import edu.internet2.middleware.grouperClient.util.GrouperClientUtils;



/**
 * logger to log the traffic of scim
 */
public class GrouperScim2Log {

  /** logger */
  private static final Log LOG = edu.internet2.middleware.grouper.util.GrouperUtil.getLog(GrouperScim2Log.class);
 
  /**
   * log something to the log file
   * @param message
   */
  public static void scimLog(String message) {
    LOG.debug(message);
  }
  
  public static boolean isLog() {
    if (LOG.isDebugEnabled()) {
      return true;
    }
    GrouperProvisioner grouperProvisioner = GrouperProvisioner.retrieveCurrentGrouperProvisioner();
    if (grouperProvisioner != null) {
      if (grouperProvisioner.retrieveGrouperProvisioningConfiguration().isDebugLog()) {
        return true;
      }
    }
    return false;
  }
  
  /**
   * log something to the log file
   * @param messageMap
   * @param startTimeNanos nanos when the request started
   */
  public static void scimLog(Map<String, Object> messageMap, Long startTimeNanos) {
    if (isLog()) {
      if (messageMap != null && startTimeNanos != null) {
        messageMap.put("elapsedMillis", (System.nanoTime() - startTimeNanos) / 1000000);
      }
      String mapToString = GrouperClientUtils.mapToString(messageMap);
      
      GrouperProvisioner grouperProvisioner = GrouperProvisioner.retrieveCurrentGrouperProvisioner();
      if (grouperProvisioner != null) {
        mapToString = grouperProvisioner.retrieveGrouperProvisioningLog().prefixLogLinesWithInstanceId(mapToString);
      }
      
      if (LOG.isDebugEnabled()) {
        LOG.debug(mapToString);      
      } else if (LOG.isInfoEnabled()) {
        LOG.info(mapToString);      
      } else if (LOG.isWarnEnabled()) {
        LOG.warn(mapToString);      
      } else if (LOG.isErrorEnabled()) {
        LOG.error(mapToString);      
      } else if (LOG.isFatalEnabled()) {
        LOG.fatal(mapToString);      
      } else {
        throw new RuntimeException("You must log some level of edu.internet2.middleware.grouper.app.scim2Provisioning.GrouperScim2Log!");
      }

    }
  }
  
}
