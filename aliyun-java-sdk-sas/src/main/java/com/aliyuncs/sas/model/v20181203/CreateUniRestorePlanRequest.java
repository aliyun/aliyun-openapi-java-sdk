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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateUniRestorePlanRequest extends RpcAcsRequest<CreateUniRestorePlanResponse> {
	   

	private String instanceUuid;

	private String restoreInfo;

	private String database;

	private Long policyId;

	private String resetScn;

	private String resetTime;

	private Long timePoint;
	public CreateUniRestorePlanRequest() {
		super("Sas", "2018-12-03", "CreateUniRestorePlan", "sas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInstanceUuid() {
		return this.instanceUuid;
	}

	public void setInstanceUuid(String instanceUuid) {
		this.instanceUuid = instanceUuid;
		if(instanceUuid != null){
			putQueryParameter("InstanceUuid", instanceUuid);
		}
	}

	public String getRestoreInfo() {
		return this.restoreInfo;
	}

	public void setRestoreInfo(String restoreInfo) {
		this.restoreInfo = restoreInfo;
		if(restoreInfo != null){
			putQueryParameter("RestoreInfo", restoreInfo);
		}
	}

	public String getDatabase() {
		return this.database;
	}

	public void setDatabase(String database) {
		this.database = database;
		if(database != null){
			putQueryParameter("Database", database);
		}
	}

	public Long getPolicyId() {
		return this.policyId;
	}

	public void setPolicyId(Long policyId) {
		this.policyId = policyId;
		if(policyId != null){
			putQueryParameter("PolicyId", policyId.toString());
		}
	}

	public String getResetScn() {
		return this.resetScn;
	}

	public void setResetScn(String resetScn) {
		this.resetScn = resetScn;
		if(resetScn != null){
			putQueryParameter("ResetScn", resetScn);
		}
	}

	public String getResetTime() {
		return this.resetTime;
	}

	public void setResetTime(String resetTime) {
		this.resetTime = resetTime;
		if(resetTime != null){
			putQueryParameter("ResetTime", resetTime);
		}
	}

	public Long getTimePoint() {
		return this.timePoint;
	}

	public void setTimePoint(Long timePoint) {
		this.timePoint = timePoint;
		if(timePoint != null){
			putQueryParameter("TimePoint", timePoint.toString());
		}
	}

	@Override
	public Class<CreateUniRestorePlanResponse> getResponseClass() {
		return CreateUniRestorePlanResponse.class;
	}

}
