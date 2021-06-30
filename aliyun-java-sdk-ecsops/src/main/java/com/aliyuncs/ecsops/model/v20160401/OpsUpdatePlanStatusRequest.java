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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsUpdatePlanStatusRequest extends RpcAcsRequest<OpsUpdatePlanStatusResponse> {
	   

	private String targetPlanningStatus;

	private String serviceVersion;

	private String planId;

	private String auditParamStr;
	public OpsUpdatePlanStatusRequest() {
		super("Ecsops", "2016-04-01", "OpsUpdatePlanStatus", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getTargetPlanningStatus() {
		return this.targetPlanningStatus;
	}

	public void setTargetPlanningStatus(String targetPlanningStatus) {
		this.targetPlanningStatus = targetPlanningStatus;
		if(targetPlanningStatus != null){
			putQueryParameter("TargetPlanningStatus", targetPlanningStatus);
		}
	}

	public String getServiceVersion() {
		return this.serviceVersion;
	}

	public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
		if(serviceVersion != null){
			putQueryParameter("ServiceVersion", serviceVersion);
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

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsUpdatePlanStatusResponse> getResponseClass() {
		return OpsUpdatePlanStatusResponse.class;
	}

}