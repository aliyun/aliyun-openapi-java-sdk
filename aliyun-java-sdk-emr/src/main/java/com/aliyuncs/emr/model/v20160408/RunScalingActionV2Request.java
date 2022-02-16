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
public class RunScalingActionV2Request extends RpcAcsRequest<RunScalingActionV2Response> {
	   

	private Long resourceOwnerId;

	private String scalingActionType;

	private String scalingGroupBizId;

	private String resourceGroupId;

	private String actionParam;
	public RunScalingActionV2Request() {
		super("Emr", "2016-04-08", "RunScalingActionV2");
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

	public String getScalingActionType() {
		return this.scalingActionType;
	}

	public void setScalingActionType(String scalingActionType) {
		this.scalingActionType = scalingActionType;
		if(scalingActionType != null){
			putQueryParameter("ScalingActionType", scalingActionType);
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

	public String getActionParam() {
		return this.actionParam;
	}

	public void setActionParam(String actionParam) {
		this.actionParam = actionParam;
		if(actionParam != null){
			putQueryParameter("ActionParam", actionParam);
		}
	}

	@Override
	public Class<RunScalingActionV2Response> getResponseClass() {
		return RunScalingActionV2Response.class;
	}

}
