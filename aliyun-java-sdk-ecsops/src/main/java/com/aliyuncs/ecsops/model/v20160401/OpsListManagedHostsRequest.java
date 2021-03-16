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
public class OpsListManagedHostsRequest extends RpcAcsRequest<OpsListManagedHostsResponse> {
	   

	private String hostType;

	private String mode;

	private String resourceGroupId;

	private String nextToken;

	private Long aliUid;

	private List<Tag> tags;

	private List<String> managedHostIdss;

	private List<String> serialNumbers;

	private String managedPrivateSpaceId;

	private String name;

	private String zoneId;

	private Integer maxResults;

	private String auditParamStr;

	private String status;
	public OpsListManagedHostsRequest() {
		super("Ecsops", "2016-04-01", "OpsListManagedHosts", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getHostType() {
		return this.hostType;
	}

	public void setHostType(String hostType) {
		this.hostType = hostType;
		if(hostType != null){
			putQueryParameter("HostType", hostType);
		}
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
		if(mode != null){
			putQueryParameter("Mode", mode);
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

	public List<String> getManagedHostIdss() {
		return this.managedHostIdss;
	}

	public void setManagedHostIdss(List<String> managedHostIdss) {
		this.managedHostIdss = managedHostIdss;	
		if (managedHostIdss != null) {
			for (int i = 0; i < managedHostIdss.size(); i++) {
				putQueryParameter("ManagedHostIds." + (i + 1) , managedHostIdss.get(i));
			}
		}	
	}

	public List<String> getSerialNumbers() {
		return this.serialNumbers;
	}

	public void setSerialNumbers(List<String> serialNumbers) {
		this.serialNumbers = serialNumbers;	
		if (serialNumbers != null) {
			for (int i = 0; i < serialNumbers.size(); i++) {
				putQueryParameter("SerialNumber." + (i + 1) , serialNumbers.get(i));
			}
		}	
	}

	public String getManagedPrivateSpaceId() {
		return this.managedPrivateSpaceId;
	}

	public void setManagedPrivateSpaceId(String managedPrivateSpaceId) {
		this.managedPrivateSpaceId = managedPrivateSpaceId;
		if(managedPrivateSpaceId != null){
			putQueryParameter("ManagedPrivateSpaceId", managedPrivateSpaceId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
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
	public Class<OpsListManagedHostsResponse> getResponseClass() {
		return OpsListManagedHostsResponse.class;
	}

}
