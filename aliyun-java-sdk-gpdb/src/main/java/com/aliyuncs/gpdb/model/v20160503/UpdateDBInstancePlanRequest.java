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

package com.aliyuncs.gpdb.model.v20160503;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateDBInstancePlanRequest extends RpcAcsRequest<UpdateDBInstancePlanResponse> {
	   

	private String planStartDate;

	private String planConfig;

	private String planName;

	private String dBInstanceId;

	private String planDesc;

	private Long ownerId;

	private String planEndDate;

	private String planId;
	public UpdateDBInstancePlanRequest() {
		super("gpdb", "2016-05-03", "UpdateDBInstancePlan");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPlanStartDate() {
		return this.planStartDate;
	}

	public void setPlanStartDate(String planStartDate) {
		this.planStartDate = planStartDate;
		if(planStartDate != null){
			putQueryParameter("PlanStartDate", planStartDate);
		}
	}

	public String getPlanConfig() {
		return this.planConfig;
	}

	public void setPlanConfig(String planConfig) {
		this.planConfig = planConfig;
		if(planConfig != null){
			putQueryParameter("PlanConfig", planConfig);
		}
	}

	public String getPlanName() {
		return this.planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
		if(planName != null){
			putQueryParameter("PlanName", planName);
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

	public String getPlanDesc() {
		return this.planDesc;
	}

	public void setPlanDesc(String planDesc) {
		this.planDesc = planDesc;
		if(planDesc != null){
			putQueryParameter("PlanDesc", planDesc);
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

	public String getPlanEndDate() {
		return this.planEndDate;
	}

	public void setPlanEndDate(String planEndDate) {
		this.planEndDate = planEndDate;
		if(planEndDate != null){
			putQueryParameter("PlanEndDate", planEndDate);
		}
	}

	public String getPlanId() {
		return this.planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
		if(planId != null){
			putQueryParameter("PlanId", planId);
		}
	}

	@Override
	public Class<UpdateDBInstancePlanResponse> getResponseClass() {
		return UpdateDBInstancePlanResponse.class;
	}

}
