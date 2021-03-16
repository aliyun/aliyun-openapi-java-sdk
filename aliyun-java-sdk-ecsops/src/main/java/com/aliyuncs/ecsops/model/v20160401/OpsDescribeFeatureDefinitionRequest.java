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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeFeatureDefinitionRequest extends RpcAcsRequest<OpsDescribeFeatureDefinitionResponse> {
	   

	private String reason;

	private Boolean execRule;

	private Integer pageNumber;

	private Long extractionId;

	private List<String> featureNames;

	private Long validTimeRangeTo;

	private Integer pageSize;

	private String supportTeam;

	private String lastModifiedUserName;

	private String createUserName;

	private List<String> featureTargetTypes;

	private List<String> featureTypes;

	private Long validTimeRangeFrom;

	private String regionNo;

	private Long detailDocId;

	private String severityLevel;

	private String auditParamStr;
	public OpsDescribeFeatureDefinitionRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeFeatureDefinition", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
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

	public List<String> getFeatureNames() {
		return this.featureNames;
	}

	public void setFeatureNames(List<String> featureNames) {
		this.featureNames = featureNames;	
		if (featureNames != null) {
			for (int i = 0; i < featureNames.size(); i++) {
				putQueryParameter("FeatureName." + (i + 1) , featureNames.get(i));
			}
		}	
	}

	public Long getValidTimeRangeTo() {
		return this.validTimeRangeTo;
	}

	public void setValidTimeRangeTo(Long validTimeRangeTo) {
		this.validTimeRangeTo = validTimeRangeTo;
		if(validTimeRangeTo != null){
			putQueryParameter("ValidTimeRangeTo", validTimeRangeTo.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getSupportTeam() {
		return this.supportTeam;
	}

	public void setSupportTeam(String supportTeam) {
		this.supportTeam = supportTeam;
		if(supportTeam != null){
			putQueryParameter("SupportTeam", supportTeam);
		}
	}

	public String getLastModifiedUserName() {
		return this.lastModifiedUserName;
	}

	public void setLastModifiedUserName(String lastModifiedUserName) {
		this.lastModifiedUserName = lastModifiedUserName;
		if(lastModifiedUserName != null){
			putQueryParameter("LastModifiedUserName", lastModifiedUserName);
		}
	}

	public String getCreateUserName() {
		return this.createUserName;
	}

	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
		if(createUserName != null){
			putQueryParameter("CreateUserName", createUserName);
		}
	}

	public List<String> getFeatureTargetTypes() {
		return this.featureTargetTypes;
	}

	public void setFeatureTargetTypes(List<String> featureTargetTypes) {
		this.featureTargetTypes = featureTargetTypes;	
		if (featureTargetTypes != null) {
			for (int i = 0; i < featureTargetTypes.size(); i++) {
				putQueryParameter("FeatureTargetType." + (i + 1) , featureTargetTypes.get(i));
			}
		}	
	}

	public List<String> getFeatureTypes() {
		return this.featureTypes;
	}

	public void setFeatureTypes(List<String> featureTypes) {
		this.featureTypes = featureTypes;	
		if (featureTypes != null) {
			for (int i = 0; i < featureTypes.size(); i++) {
				putQueryParameter("FeatureType." + (i + 1) , featureTypes.get(i));
			}
		}	
	}

	public Long getValidTimeRangeFrom() {
		return this.validTimeRangeFrom;
	}

	public void setValidTimeRangeFrom(Long validTimeRangeFrom) {
		this.validTimeRangeFrom = validTimeRangeFrom;
		if(validTimeRangeFrom != null){
			putQueryParameter("ValidTimeRangeFrom", validTimeRangeFrom.toString());
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
	public Class<OpsDescribeFeatureDefinitionResponse> getResponseClass() {
		return OpsDescribeFeatureDefinitionResponse.class;
	}

}
