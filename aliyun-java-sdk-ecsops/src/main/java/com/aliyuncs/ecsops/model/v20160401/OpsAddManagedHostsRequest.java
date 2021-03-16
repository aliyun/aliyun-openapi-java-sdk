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
public class OpsAddManagedHostsRequest extends RpcAcsRequest<OpsAddManagedHostsResponse> {
	   

	private Boolean uniqueSuffix;

	private String clientToken;

	private String description;

	private String resourceGroupId;

	private Integer hostCount;

	private String contractId;

	private Long aliUid;

	private String managedHostType;

	private String managedPrivateSpaceId;

	private String name;

	private List<TagKeyValueParams> tagKeyValueParamss;

	private String auditParamStr;
	public OpsAddManagedHostsRequest() {
		super("Ecsops", "2016-04-01", "OpsAddManagedHosts", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getUniqueSuffix() {
		return this.uniqueSuffix;
	}

	public void setUniqueSuffix(Boolean uniqueSuffix) {
		this.uniqueSuffix = uniqueSuffix;
		if(uniqueSuffix != null){
			putQueryParameter("UniqueSuffix", uniqueSuffix.toString());
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
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

	public Integer getHostCount() {
		return this.hostCount;
	}

	public void setHostCount(Integer hostCount) {
		this.hostCount = hostCount;
		if(hostCount != null){
			putQueryParameter("HostCount", hostCount.toString());
		}
	}

	public String getContractId() {
		return this.contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
		if(contractId != null){
			putQueryParameter("ContractId", contractId);
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

	public String getManagedHostType() {
		return this.managedHostType;
	}

	public void setManagedHostType(String managedHostType) {
		this.managedHostType = managedHostType;
		if(managedHostType != null){
			putQueryParameter("ManagedHostType", managedHostType);
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

	public List<TagKeyValueParams> getTagKeyValueParamss() {
		return this.tagKeyValueParamss;
	}

	public void setTagKeyValueParamss(List<TagKeyValueParams> tagKeyValueParamss) {
		this.tagKeyValueParamss = tagKeyValueParamss;	
		if (tagKeyValueParamss != null) {
			for (int depth1 = 0; depth1 < tagKeyValueParamss.size(); depth1++) {
				putQueryParameter("TagKeyValueParams." + (depth1 + 1) + ".Key" , tagKeyValueParamss.get(depth1).getKey());
				putQueryParameter("TagKeyValueParams." + (depth1 + 1) + ".Value" , tagKeyValueParamss.get(depth1).getValue());
			}
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

	public static class TagKeyValueParams {

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
	public Class<OpsAddManagedHostsResponse> getResponseClass() {
		return OpsAddManagedHostsResponse.class;
	}

}
