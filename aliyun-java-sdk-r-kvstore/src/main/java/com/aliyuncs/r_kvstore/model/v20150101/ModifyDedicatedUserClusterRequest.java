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

package com.aliyuncs.r_kvstore.model.v20150101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.r_kvstore.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDedicatedUserClusterRequest extends RpcAcsRequest<ModifyDedicatedUserClusterResponse> {
	   

	private Long resourceOwnerId;

	private String clusterName;

	private String securityToken;

	private String engine;

	private Integer diskOverAllocationRatio;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String clusterId;

	private Integer memoryOverAllocationRatio;

	private Long ownerId;

	private String hostReplacePolicy;

	private String allocationPolicy;

	private String zoneId;

	private Integer cpuOverAllocationRatio;
	public ModifyDedicatedUserClusterRequest() {
		super("R-kvstore", "2015-01-01", "ModifyDedicatedUserCluster");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getClusterName() {
		return this.clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
		if(clusterName != null){
			putQueryParameter("ClusterName", clusterName);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
		if(engine != null){
			putQueryParameter("Engine", engine);
		}
	}

	public Integer getDiskOverAllocationRatio() {
		return this.diskOverAllocationRatio;
	}

	public void setDiskOverAllocationRatio(Integer diskOverAllocationRatio) {
		this.diskOverAllocationRatio = diskOverAllocationRatio;
		if(diskOverAllocationRatio != null){
			putQueryParameter("DiskOverAllocationRatio", diskOverAllocationRatio.toString());
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public Integer getMemoryOverAllocationRatio() {
		return this.memoryOverAllocationRatio;
	}

	public void setMemoryOverAllocationRatio(Integer memoryOverAllocationRatio) {
		this.memoryOverAllocationRatio = memoryOverAllocationRatio;
		if(memoryOverAllocationRatio != null){
			putQueryParameter("MemoryOverAllocationRatio", memoryOverAllocationRatio.toString());
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getHostReplacePolicy() {
		return this.hostReplacePolicy;
	}

	public void setHostReplacePolicy(String hostReplacePolicy) {
		this.hostReplacePolicy = hostReplacePolicy;
		if(hostReplacePolicy != null){
			putQueryParameter("HostReplacePolicy", hostReplacePolicy);
		}
	}

	public String getAllocationPolicy() {
		return this.allocationPolicy;
	}

	public void setAllocationPolicy(String allocationPolicy) {
		this.allocationPolicy = allocationPolicy;
		if(allocationPolicy != null){
			putQueryParameter("AllocationPolicy", allocationPolicy);
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

	public Integer getCpuOverAllocationRatio() {
		return this.cpuOverAllocationRatio;
	}

	public void setCpuOverAllocationRatio(Integer cpuOverAllocationRatio) {
		this.cpuOverAllocationRatio = cpuOverAllocationRatio;
		if(cpuOverAllocationRatio != null){
			putQueryParameter("CpuOverAllocationRatio", cpuOverAllocationRatio.toString());
		}
	}

	@Override
	public Class<ModifyDedicatedUserClusterResponse> getResponseClass() {
		return ModifyDedicatedUserClusterResponse.class;
	}

}
