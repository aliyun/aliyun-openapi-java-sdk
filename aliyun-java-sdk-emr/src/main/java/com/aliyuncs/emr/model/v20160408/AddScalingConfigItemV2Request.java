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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddScalingConfigItemV2Request extends RpcAcsRequest<AddScalingConfigItemV2Response> {
	   

	private String configItemType;

	private Long resourceOwnerId;

	private String scalingGroupBizId;

	private String resourceGroupId;

	private String configItemInformation;
	public AddScalingConfigItemV2Request() {
		super("Emr", "2016-04-08", "AddScalingConfigItemV2");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getConfigItemType() {
		return this.configItemType;
	}

	public void setConfigItemType(String configItemType) {
		this.configItemType = configItemType;
		if(configItemType != null){
			putQueryParameter("ConfigItemType", configItemType);
		}
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

	public String getScalingGroupBizId() {
		return this.scalingGroupBizId;
	}

	public void setScalingGroupBizId(String scalingGroupBizId) {
		this.scalingGroupBizId = scalingGroupBizId;
		if(scalingGroupBizId != null){
			putQueryParameter("ScalingGroupBizId", scalingGroupBizId);
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

	public String getConfigItemInformation() {
		return this.configItemInformation;
	}

	public void setConfigItemInformation(String configItemInformation) {
		this.configItemInformation = configItemInformation;
		if(configItemInformation != null){
			putQueryParameter("ConfigItemInformation", configItemInformation);
		}
	}

	@Override
	public Class<AddScalingConfigItemV2Response> getResponseClass() {
		return AddScalingConfigItemV2Response.class;
	}

}
