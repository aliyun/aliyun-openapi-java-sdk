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
public class OpsListManagedPrivateSpacesRequest extends RpcAcsRequest<OpsListManagedPrivateSpacesResponse> {
	   

	private String managedPrivateSpaceName;

	private String resourceGroupId;

	private String nextToken;

	private Long aliUid;

	private List<Tag> tags;

	private List<String> managedPrivateSpaceIds;

	private String zoneId;

	private Integer maxResults;

	private String auditParamStr;
	public OpsListManagedPrivateSpacesRequest() {
		super("Ecsops", "2016-04-01", "OpsListManagedPrivateSpaces", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getManagedPrivateSpaceName() {
		return this.managedPrivateSpaceName;
	}

	public void setManagedPrivateSpaceName(String managedPrivateSpaceName) {
		this.managedPrivateSpaceName = managedPrivateSpaceName;
		if(managedPrivateSpaceName != null){
			putQueryParameter("ManagedPrivateSpaceName", managedPrivateSpaceName);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
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

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
			}
		}	
	}

	public List<String> getManagedPrivateSpaceIds() {
		return this.managedPrivateSpaceIds;
	}

	public void setManagedPrivateSpaceIds(List<String> managedPrivateSpaceIds) {
		this.managedPrivateSpaceIds = managedPrivateSpaceIds;	
		if (managedPrivateSpaceIds != null) {
			for (int i = 0; i < managedPrivateSpaceIds.size(); i++) {
				putQueryParameter("ManagedPrivateSpaceId." + (i + 1) , managedPrivateSpaceIds.get(i));
			}
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

	public static class Tag {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public Class<OpsListManagedPrivateSpacesResponse> getResponseClass() {
		return OpsListManagedPrivateSpacesResponse.class;
	}

}
