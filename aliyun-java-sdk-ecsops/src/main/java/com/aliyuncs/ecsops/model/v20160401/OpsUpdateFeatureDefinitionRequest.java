/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsUpdateFeatureDefinitionRequest extends RpcAcsRequest<OpsUpdateFeatureDefinitionResponse> {
	   

	private String reason;

	private Boolean execRule;

	private Long extractionId;

	private String modifiedUser;

	private String featureName;

	private String supportTeams;

	private Long validTimeRange;

	private String featureTargetType;

	private String featureType;

	private String shortDesc;

	private String regionNo;

	private Long detailDocId;

	private String severityLevel;

	private String auditParamStr;
	public OpsUpdateFeatureDefinitionRequest() {
		super("Ecsops", "2016-04-01", "OpsUpdateFeatureDefinition", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
		if(reason != null){
			putQueryParameter("Reason", reason);
		}
	}

	public Boolean getExecRule() {
		return this.execRule;
	}

	public void setExecRule(Boolean execRule) {
		this.execRule = execRule;
		if(execRule != null){
			putQueryParameter("ExecRule", execRule.toString());
		}
	}

	public Long getExtractionId() {
		return this.extractionId;
	}

	public void setExtractionId(Long extractionId) {
		this.extractionId = extractionId;
		if(extractionId != null){
			putQueryParameter("ExtractionId", extractionId.toString());
		}
	}

	public String getModifiedUser() {
		return this.modifiedUser;
	}

	public void setModifiedUser(String modifiedUser) {
		this.modifiedUser = modifiedUser;
		if(modifiedUser != null){
			putQueryParameter("ModifiedUser", modifiedUser);
		}
	}

	public String getFeatureName() {
		return this.featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
		if(featureName != null){
			putQueryParameter("FeatureName", featureName);
		}
	}

	public String getSupportTeams() {
		return this.supportTeams;
	}

	public void setSupportTeams(String supportTeams) {
		this.supportTeams = supportTeams;
		if(supportTeams != null){
			putQueryParameter("SupportTeams", supportTeams);
		}
	}

	public Long getValidTimeRange() {
		return this.validTimeRange;
	}

	public void setValidTimeRange(Long validTimeRange) {
		this.validTimeRange = validTimeRange;
		if(validTimeRange != null){
			putQueryParameter("ValidTimeRange", validTimeRange.toString());
		}
	}

	public String getFeatureTargetType() {
		return this.featureTargetType;
	}

	public void setFeatureTargetType(String featureTargetType) {
		this.featureTargetType = featureTargetType;
		if(featureTargetType != null){
			putQueryParameter("FeatureTargetType", featureTargetType);
		}
	}

	public String getFeatureType() {
		return this.featureType;
	}

	public void setFeatureType(String featureType) {
		this.featureType = featureType;
		if(featureType != null){
			putQueryParameter("FeatureType", featureType);
		}
	}

	public String getShortDesc() {
		return this.shortDesc;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
		if(shortDesc != null){
			putQueryParameter("ShortDesc", shortDesc);
		}
	}

	public String getRegionNo() {
		return this.regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
		if(regionNo != null){
			putQueryParameter("RegionNo", regionNo);
		}
	}

	public Long getDetailDocId() {
		return this.detailDocId;
	}

	public void setDetailDocId(Long detailDocId) {
		this.detailDocId = detailDocId;
		if(detailDocId != null){
			putQueryParameter("DetailDocId", detailDocId.toString());
		}
	}

	public String getSeverityLevel() {
		return this.severityLevel;
	}

	public void setSeverityLevel(String severityLevel) {
		this.severityLevel = severityLevel;
		if(severityLevel != null){
			putQueryParameter("SeverityLevel", severityLevel);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsUpdateFeatureDefinitionResponse> getResponseClass() {
		return OpsUpdateFeatureDefinitionResponse.class;
	}

}
