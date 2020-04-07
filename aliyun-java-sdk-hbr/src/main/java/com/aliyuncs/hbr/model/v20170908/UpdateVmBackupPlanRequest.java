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

package com.aliyuncs.hbr.model.v20170908;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateVmBackupPlanRequest extends RpcAcsRequest<UpdateVmBackupPlanResponse> {
	   

	private String diffSchedule;

	private String vaultId;

	private String fullSchedule;

	private String incSchedule;

	private String dispatchPolicy;

	private String dispatchClientId;

	private String name;

	private String planId;

	private Long retention;
	public UpdateVmBackupPlanRequest() {
		super("hbr", "2017-09-08", "UpdateVmBackupPlan", "hbr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDiffSchedule() {
		return this.diffSchedule;
	}

	public void setDiffSchedule(String diffSchedule) {
		this.diffSchedule = diffSchedule;
		if(diffSchedule != null){
			putQueryParameter("DiffSchedule", diffSchedule);
		}
	}

	public String getVaultId() {
		return this.vaultId;
	}

	public void setVaultId(String vaultId) {
		this.vaultId = vaultId;
		if(vaultId != null){
			putQueryParameter("VaultId", vaultId);
		}
	}

	public String getFullSchedule() {
		return this.fullSchedule;
	}

	public void setFullSchedule(String fullSchedule) {
		this.fullSchedule = fullSchedule;
		if(fullSchedule != null){
			putQueryParameter("FullSchedule", fullSchedule);
		}
	}

	public String getIncSchedule() {
		return this.incSchedule;
	}

	public void setIncSchedule(String incSchedule) {
		this.incSchedule = incSchedule;
		if(incSchedule != null){
			putQueryParameter("IncSchedule", incSchedule);
		}
	}

	public String getDispatchPolicy() {
		return this.dispatchPolicy;
	}

	public void setDispatchPolicy(String dispatchPolicy) {
		this.dispatchPolicy = dispatchPolicy;
		if(dispatchPolicy != null){
			putQueryParameter("DispatchPolicy", dispatchPolicy);
		}
	}

	public String getDispatchClientId() {
		return this.dispatchClientId;
	}

	public void setDispatchClientId(String dispatchClientId) {
		this.dispatchClientId = dispatchClientId;
		if(dispatchClientId != null){
			putQueryParameter("DispatchClientId", dispatchClientId);
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

	public String getPlanId() {
		return this.planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
		if(planId != null){
			putQueryParameter("PlanId", planId);
		}
	}

	public Long getRetention() {
		return this.retention;
	}

	public void setRetention(Long retention) {
		this.retention = retention;
		if(retention != null){
			putQueryParameter("Retention", retention.toString());
		}
	}

	@Override
	public Class<UpdateVmBackupPlanResponse> getResponseClass() {
		return UpdateVmBackupPlanResponse.class;
	}

}
