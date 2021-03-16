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
public class OpsListCloudBoxesRequest extends RpcAcsRequest<OpsListCloudBoxesResponse> {
	   

	private List<String> cloudBoxIds;

	private String nextToken;

	private Long aliUid;

	private String cloudBoxName;

	private String cloudBoxSiteId;

	private String zoneId;

	private Integer maxResults;

	private String auditParamStr;
	public OpsListCloudBoxesRequest() {
		super("Ecsops", "2016-04-01", "OpsListCloudBoxes", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getCloudBoxIds() {
		return this.cloudBoxIds;
	}

	public void setCloudBoxIds(List<String> cloudBoxIds) {
		this.cloudBoxIds = cloudBoxIds;	
		if (cloudBoxIds != null) {
			for (int i = 0; i < cloudBoxIds.size(); i++) {
				putQueryParameter("CloudBoxId." + (i + 1) , cloudBoxIds.get(i));
			}
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

	public String getCloudBoxName() {
		return this.cloudBoxName;
	}

	public void setCloudBoxName(String cloudBoxName) {
		this.cloudBoxName = cloudBoxName;
		if(cloudBoxName != null){
			putQueryParameter("CloudBoxName", cloudBoxName);
		}
	}

	public String getCloudBoxSiteId() {
		return this.cloudBoxSiteId;
	}

	public void setCloudBoxSiteId(String cloudBoxSiteId) {
		this.cloudBoxSiteId = cloudBoxSiteId;
		if(cloudBoxSiteId != null){
			putQueryParameter("CloudBoxSiteId", cloudBoxSiteId);
		}
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
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
	public Class<OpsListCloudBoxesResponse> getResponseClass() {
		return OpsListCloudBoxesResponse.class;
	}

}
