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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDedicatedHostGroupRequest extends RpcAcsRequest<CreateDedicatedHostGroupResponse> {
	   

	private Long resourceOwnerId;

	private Integer cpuAllocationRatio;

	private String clientToken;

	private String engine;

	private String resourceOwnerAccount;

	private Integer diskAllocationRatio;

	private Integer openPermission;

	private Integer memAllocationRatio;

	private Long ownerId;

	private String hostReplacePolicy;

	private String allocationPolicy;

	private String vPCId;
	public CreateDedicatedHostGroupRequest() {
		super("Rds", "2014-08-15", "CreateDedicatedHostGroup", "rds");
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

	public Integer getCpuAllocationRatio() {
		return this.cpuAllocationRatio;
	}

	public void setCpuAllocationRatio(Integer cpuAllocationRatio) {
		this.cpuAllocationRatio = cpuAllocationRatio;
		if(cpuAllocationRatio != null){
			putQueryParameter("CpuAllocationRatio", cpuAllocationRatio.toString());
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

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
		if(engine != null){
			putQueryParameter("Engine", engine);
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

	public Integer getDiskAllocationRatio() {
		return this.diskAllocationRatio;
	}

	public void setDiskAllocationRatio(Integer diskAllocationRatio) {
		this.diskAllocationRatio = diskAllocationRatio;
		if(diskAllocationRatio != null){
			putQueryParameter("DiskAllocationRatio", diskAllocationRatio.toString());
		}
	}

	public Integer getOpenPermission() {
		return this.openPermission;
	}

	public void setOpenPermission(Integer openPermission) {
		this.openPermission = openPermission;
		if(openPermission != null){
			putQueryParameter("OpenPermission", openPermission.toString());
		}
	}

	public Integer getMemAllocationRatio() {
		return this.memAllocationRatio;
	}

	public void setMemAllocationRatio(Integer memAllocationRatio) {
		this.memAllocationRatio = memAllocationRatio;
		if(memAllocationRatio != null){
			putQueryParameter("MemAllocationRatio", memAllocationRatio.toString());
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

	public String getVPCId() {
		return this.vPCId;
	}

	public void setVPCId(String vPCId) {
		this.vPCId = vPCId;
		if(vPCId != null){
			putQueryParameter("VPCId", vPCId);
		}
	}

	@Override
	public Class<CreateDedicatedHostGroupResponse> getResponseClass() {
		return CreateDedicatedHostGroupResponse.class;
	}

}
