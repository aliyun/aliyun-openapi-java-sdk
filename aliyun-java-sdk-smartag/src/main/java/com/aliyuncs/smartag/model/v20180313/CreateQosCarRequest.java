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

package com.aliyuncs.smartag.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.smartag.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateQosCarRequest extends RpcAcsRequest<CreateQosCarResponse> {
	   

	private Long resourceOwnerId;

	private Integer minBandwidthAbs;

	private String description;

	private String percentSourceType;

	private String qosId;

	private Integer maxBandwidthAbs;

	private String resourceOwnerAccount;

	private Integer maxBandwidthPercent;

	private String ownerAccount;

	private Long ownerId;

	private Integer priority;

	private Integer minBandwidthPercent;

	private String limitType;

	private String name;
	public CreateQosCarRequest() {
		super("Smartag", "2018-03-13", "CreateQosCar", "smartag");
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

	public Integer getMinBandwidthAbs() {
		return this.minBandwidthAbs;
	}

	public void setMinBandwidthAbs(Integer minBandwidthAbs) {
		this.minBandwidthAbs = minBandwidthAbs;
		if(minBandwidthAbs != null){
			putQueryParameter("MinBandwidthAbs", minBandwidthAbs.toString());
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

	public String getPercentSourceType() {
		return this.percentSourceType;
	}

	public void setPercentSourceType(String percentSourceType) {
		this.percentSourceType = percentSourceType;
		if(percentSourceType != null){
			putQueryParameter("PercentSourceType", percentSourceType);
		}
	}

	public String getQosId() {
		return this.qosId;
	}

	public void setQosId(String qosId) {
		this.qosId = qosId;
		if(qosId != null){
			putQueryParameter("QosId", qosId);
		}
	}

	public Integer getMaxBandwidthAbs() {
		return this.maxBandwidthAbs;
	}

	public void setMaxBandwidthAbs(Integer maxBandwidthAbs) {
		this.maxBandwidthAbs = maxBandwidthAbs;
		if(maxBandwidthAbs != null){
			putQueryParameter("MaxBandwidthAbs", maxBandwidthAbs.toString());
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

	public Integer getMaxBandwidthPercent() {
		return this.maxBandwidthPercent;
	}

	public void setMaxBandwidthPercent(Integer maxBandwidthPercent) {
		this.maxBandwidthPercent = maxBandwidthPercent;
		if(maxBandwidthPercent != null){
			putQueryParameter("MaxBandwidthPercent", maxBandwidthPercent.toString());
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

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
		if(priority != null){
			putQueryParameter("Priority", priority.toString());
		}
	}

	public Integer getMinBandwidthPercent() {
		return this.minBandwidthPercent;
	}

	public void setMinBandwidthPercent(Integer minBandwidthPercent) {
		this.minBandwidthPercent = minBandwidthPercent;
		if(minBandwidthPercent != null){
			putQueryParameter("MinBandwidthPercent", minBandwidthPercent.toString());
		}
	}

	public String getLimitType() {
		return this.limitType;
	}

	public void setLimitType(String limitType) {
		this.limitType = limitType;
		if(limitType != null){
			putQueryParameter("LimitType", limitType);
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

	@Override
	public Class<CreateQosCarResponse> getResponseClass() {
		return CreateQosCarResponse.class;
	}

}
