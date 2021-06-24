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

/**
 * @author auto create
 * @version 
 */
public class OpsListCloudBoxDemandsRequest extends RpcAcsRequest<OpsListCloudBoxDemandsResponse> {
	   

	private String cloudBoxId;

	private String nextToken;

	private Long aliUid;

	private List<String> cloudBoxDemandIds;

	private Integer maxResults;

	private String demandType;

	private String auditParamStr;
	public OpsListCloudBoxDemandsRequest() {
		super("Ecsops", "2016-04-01", "OpsListCloudBoxDemands", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getCloudBoxId() {
		return this.cloudBoxId;
	}

	public void setCloudBoxId(String cloudBoxId) {
		this.cloudBoxId = cloudBoxId;
		if(cloudBoxId != null){
			putQueryParameter("CloudBoxId", cloudBoxId);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putQueryParameter("AliUid", aliUid.toString());
		}
	}

	public List<String> getCloudBoxDemandIds() {
		return this.cloudBoxDemandIds;
	}

	public void setCloudBoxDemandIds(List<String> cloudBoxDemandIds) {
		this.cloudBoxDemandIds = cloudBoxDemandIds;	
		if (cloudBoxDemandIds != null) {
			for (int i = 0; i < cloudBoxDemandIds.size(); i++) {
				putQueryParameter("CloudBoxDemandId." + (i + 1) , cloudBoxDemandIds.get(i));
			}
		}	
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public String getDemandType() {
		return this.demandType;
	}

	public void setDemandType(String demandType) {
		this.demandType = demandType;
		if(demandType != null){
			putQueryParameter("DemandType", demandType);
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
	public Class<OpsListCloudBoxDemandsResponse> getResponseClass() {
		return OpsListCloudBoxDemandsResponse.class;
	}

}
