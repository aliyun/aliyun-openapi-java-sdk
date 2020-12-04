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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeSpotAdviceRequest extends RpcAcsRequest<DescribeSpotAdviceResponse> {
	   

	private Long resourceOwnerId;

	private Float memory;

	private Integer minCores;

	private Integer cores;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String zoneId;

	private Float minMemory;
	public DescribeSpotAdviceRequest() {
		super("Ecs", "2014-05-26", "DescribeSpotAdvice");
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

	public Float getMemory() {
		return this.memory;
	}

	public void setMemory(Float memory) {
		this.memory = memory;
		if(memory != null){
			putQueryParameter("Memory", memory.toString());
		}
	}

	public Integer getMinCores() {
		return this.minCores;
	}

	public void setMinCores(Integer minCores) {
		this.minCores = minCores;
		if(minCores != null){
			putQueryParameter("MinCores", minCores.toString());
		}
	}

	public Integer getCores() {
		return this.cores;
	}

	public void setCores(Integer cores) {
		this.cores = cores;
		if(cores != null){
			putQueryParameter("Cores", cores.toString());
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
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

	public Float getMinMemory() {
		return this.minMemory;
	}

	public void setMinMemory(Float minMemory) {
		this.minMemory = minMemory;
		if(minMemory != null){
			putQueryParameter("MinMemory", minMemory.toString());
		}
	}

	@Override
	public Class<DescribeSpotAdviceResponse> getResponseClass() {
		return DescribeSpotAdviceResponse.class;
	}

}
