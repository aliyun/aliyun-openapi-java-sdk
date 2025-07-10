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
public class DescribeDBInstancePlansRequest extends RpcAcsRequest<DescribeDBInstancePlansResponse> {
	   

	private String planType;

	private String planCreateDate;

	private String dBInstanceId;

	private String planDesc;

	private Long ownerId;

	private String planScheduleType;

	private String planId;
	public DescribeDBInstancePlansRequest() {
		super("gpdb", "2016-05-03", "DescribeDBInstancePlans", "gpdb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPlanType() {
		return this.planType;
	}

	public void setPlanType(String planType) {
		this.planType = planType;
		if(planType != null){
			putQueryParameter("PlanType", planType);
		}
	}

	public String getPlanCreateDate() {
		return this.planCreateDate;
	}

	public void setPlanCreateDate(String planCreateDate) {
		this.planCreateDate = planCreateDate;
		if(planCreateDate != null){
			putQueryParameter("PlanCreateDate", planCreateDate);
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

	public String getPlanScheduleType() {
		return this.planScheduleType;
	}

	public void setPlanScheduleType(String planScheduleType) {
		this.planScheduleType = planScheduleType;
		if(planScheduleType != null){
			putQueryParameter("PlanScheduleType", planScheduleType);
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
	public Class<DescribeDBInstancePlansResponse> getResponseClass() {
		return DescribeDBInstancePlansResponse.class;
	}

}
