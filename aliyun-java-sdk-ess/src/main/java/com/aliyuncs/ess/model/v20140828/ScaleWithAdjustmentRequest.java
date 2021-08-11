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

package com.aliyuncs.ess.model.v20140828;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ess.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ScaleWithAdjustmentRequest extends RpcAcsRequest<ScaleWithAdjustmentResponse> {
	   

	private Integer adjustmentValue;

	private String clientToken;

	private String resourceOwnerAccount;

	private String scalingGroupId;

	private String adjustmentType;

	private Long ownerId;

	private Integer minAdjustmentMagnitude;
	public ScaleWithAdjustmentRequest() {
		super("Ess", "2014-08-28", "ScaleWithAdjustment", "ess");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getAdjustmentValue() {
		return this.adjustmentValue;
	}

	public void setAdjustmentValue(Integer adjustmentValue) {
		this.adjustmentValue = adjustmentValue;
		if(adjustmentValue != null){
			putQueryParameter("AdjustmentValue", adjustmentValue.toString());
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

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getScalingGroupId() {
		return this.scalingGroupId;
	}

	public void setScalingGroupId(String scalingGroupId) {
		this.scalingGroupId = scalingGroupId;
		if(scalingGroupId != null){
			putQueryParameter("ScalingGroupId", scalingGroupId);
		}
	}

	public String getAdjustmentType() {
		return this.adjustmentType;
	}

	public void setAdjustmentType(String adjustmentType) {
		this.adjustmentType = adjustmentType;
		if(adjustmentType != null){
			putQueryParameter("AdjustmentType", adjustmentType);
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

	public Integer getMinAdjustmentMagnitude() {
		return this.minAdjustmentMagnitude;
	}

	public void setMinAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
		this.minAdjustmentMagnitude = minAdjustmentMagnitude;
		if(minAdjustmentMagnitude != null){
			putQueryParameter("MinAdjustmentMagnitude", minAdjustmentMagnitude.toString());
		}
	}

	@Override
	public Class<ScaleWithAdjustmentResponse> getResponseClass() {
		return ScaleWithAdjustmentResponse.class;
	}

}
