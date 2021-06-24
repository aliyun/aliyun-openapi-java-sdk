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
public class OpsListCloudBoxSitesRequest extends RpcAcsRequest<OpsListCloudBoxSitesResponse> {
	   

	private String nextToken;

	private Long aliUid;

	private List<String> cloudBoxSiteIds;

	private Integer maxResults;

	private String auditParamStr;
	public OpsListCloudBoxSitesRequest() {
		super("Ecsops", "2016-04-01", "OpsListCloudBoxSites", "ecsops");
		setMethod(MethodType.POST);
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

	public List<String> getCloudBoxSiteIds() {
		return this.cloudBoxSiteIds;
	}

	public void setCloudBoxSiteIds(List<String> cloudBoxSiteIds) {
		this.cloudBoxSiteIds = cloudBoxSiteIds;	
		if (cloudBoxSiteIds != null) {
			for (int i = 0; i < cloudBoxSiteIds.size(); i++) {
				putQueryParameter("CloudBoxSiteId." + (i + 1) , cloudBoxSiteIds.get(i));
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
	public Class<OpsListCloudBoxSitesResponse> getResponseClass() {
		return OpsListCloudBoxSitesResponse.class;
	}

}
