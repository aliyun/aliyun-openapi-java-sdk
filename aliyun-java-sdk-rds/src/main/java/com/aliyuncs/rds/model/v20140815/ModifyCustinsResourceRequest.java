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
public class ModifyCustinsResourceRequest extends RpcAcsRequest<ModifyCustinsResourceResponse> {
	   

	private Long resourceOwnerId;

	private String increaseRatio;

	private String restoreOriginalSpecification;

	private String dBInstanceId;

	private String resourceType;

	private String adjustDeadline;

	private Integer targetValue;
	public ModifyCustinsResourceRequest() {
		super("Rds", "2014-08-15", "ModifyCustinsResource", "rds");
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

	public String getIncreaseRatio() {
		return this.increaseRatio;
	}

	public void setIncreaseRatio(String increaseRatio) {
		this.increaseRatio = increaseRatio;
		if(increaseRatio != null){
			putQueryParameter("IncreaseRatio", increaseRatio);
		}
	}

	public String getRestoreOriginalSpecification() {
		return this.restoreOriginalSpecification;
	}

	public void setRestoreOriginalSpecification(String restoreOriginalSpecification) {
		this.restoreOriginalSpecification = restoreOriginalSpecification;
		if(restoreOriginalSpecification != null){
			putQueryParameter("RestoreOriginalSpecification", restoreOriginalSpecification);
		}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public String getAdjustDeadline() {
		return this.adjustDeadline;
	}

	public void setAdjustDeadline(String adjustDeadline) {
		this.adjustDeadline = adjustDeadline;
		if(adjustDeadline != null){
			putQueryParameter("AdjustDeadline", adjustDeadline);
		}
	}

	public Integer getTargetValue() {
		return this.targetValue;
	}

	public void setTargetValue(Integer targetValue) {
		this.targetValue = targetValue;
		if(targetValue != null){
			putQueryParameter("TargetValue", targetValue.toString());
		}
	}

	@Override
	public Class<ModifyCustinsResourceResponse> getResponseClass() {
		return ModifyCustinsResourceResponse.class;
	}

}
