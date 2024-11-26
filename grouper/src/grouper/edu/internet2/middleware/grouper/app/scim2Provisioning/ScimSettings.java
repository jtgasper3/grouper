package edu.internet2.middleware.grouper.app.scim2Provisioning;


import org.apache.commons.lang3.StringUtils;

import edu.internet2.middleware.grouper.util.GrouperUtil;

public class ScimSettings {
  
  private String orgName;
  
  private String scimNamePatchStrategy = "nonqualified";
  
  private String scimEmailPatchStrategy = "pathEmails";
  
  private String acceptHeader;

  private String scimContentType = "application/json";
  
  public String getOrgName() {
    return orgName;
  }

  
  public void setOrgName(String orgName) {
    this.orgName = orgName;
  }

  
  public String getScimNamePatchStrategy() {
    return scimNamePatchStrategy;
  }

  
  public void setScimNamePatchStrategy(String scimNamePatchStrategy) {
    if (StringUtils.isBlank(scimNamePatchStrategy)) {
      scimNamePatchStrategy = "nonqualified";
    }
    GrouperUtil.assertion(StringUtils.equalsAny(scimNamePatchStrategy, "nonqualified", "qualified"), "scimNamePatchStrategy needs to be 'qualified' or 'nonqualified'. You provided: '"+scimNamePatchStrategy+"'");
    this.scimNamePatchStrategy = scimNamePatchStrategy;
  }

  public String getAcceptHeader() {
    return acceptHeader;
  }

  public void setAcceptHeader(String acceptHeader) {
    this.acceptHeader = acceptHeader;
  }

  public String getScimContentType() {
    return scimContentType;
  }

  public void setScimContentType(String scimContentType) {
    if (StringUtils.isBlank(scimContentType)) {
      scimContentType = "application/json";
    }
    this.scimContentType = scimContentType;
  }


  
  public String getScimEmailPatchStrategy() {
    return scimEmailPatchStrategy;
  }


  
  public void setScimEmailPatchStrategy(String scimEmailPatchStrategy) {
    if (StringUtils.isBlank(scimEmailPatchStrategy)) {
      scimEmailPatchStrategy = "pathEmails";
    }
    GrouperUtil.assertion(StringUtils.equalsAny(scimEmailPatchStrategy, "pathEmails", "noPath", "pathEmailsQualified"), "scimEmailPatchStrategy needs to be 'pathEmails' or 'noPath' or 'pathEmailsQualified'. You provided: '"+scimEmailPatchStrategy+"'");
    this.scimEmailPatchStrategy = scimEmailPatchStrategy;
  }
  

}
