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
public class CreateUniBackupPolicyRequest extends RpcAcsRequest<CreateUniBackupPolicyResponse> {
	   

	private String databaseType;

	private Long speedLimiter;

	private String incPlan;

	private String uuid;

	private String accountName;

	private String databaseAddByUser;

	private String fullPlan;

	private Integer retention;

	private String accountPassword;

	private String instanceId;

	private String policyName;

	private String uniRegionId;
	public CreateUniBackupPolicyRequest() {
		super("Sas", "2018-12-03", "CreateUniBackupPolicy");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDatabaseType() {
		return this.databaseType;
	}

	public void setDatabaseType(String databaseType) {
		this.databaseType = databaseType;
		if(databaseType != null){
			putQueryParameter("DatabaseType", databaseType);
		}
	}

	public Long getSpeedLimiter() {
		return this.speedLimiter;
	}

	public void setSpeedLimiter(Long speedLimiter) {
		this.speedLimiter = speedLimiter;
		if(speedLimiter != null){
			putQueryParameter("SpeedLimiter", speedLimiter.toString());
		}
	}

	public String getIncPlan() {
		return this.incPlan;
	}

	public void setIncPlan(String incPlan) {
		this.incPlan = incPlan;
		if(incPlan != null){
			putQueryParameter("IncPlan", incPlan);
		}
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
		if(uuid != null){
			putQueryParameter("Uuid", uuid);
		}
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
		if(accountName != null){
			putQueryParameter("AccountName", accountName);
		}
	}

	public String getDatabaseAddByUser() {
		return this.databaseAddByUser;
	}

	public void setDatabaseAddByUser(String databaseAddByUser) {
		this.databaseAddByUser = databaseAddByUser;
		if(databaseAddByUser != null){
			putQueryParameter("DatabaseAddByUser", databaseAddByUser);
		}
	}

	public String getFullPlan() {
		return this.fullPlan;
	}

	public void setFullPlan(String fullPlan) {
		this.fullPlan = fullPlan;
		if(fullPlan != null){
			putQueryParameter("FullPlan", fullPlan);
		}
	}

	public Integer getRetention() {
		return this.retention;
	}

	public void setRetention(Integer retention) {
		this.retention = retention;
		if(retention != null){
			putQueryParameter("Retention", retention.toString());
		}
	}

	public String getAccountPassword() {
		return this.accountPassword;
	}

	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
		if(accountPassword != null){
			putQueryParameter("AccountPassword", accountPassword);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getPolicyName() {
		return this.policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
		if(policyName != null){
			putQueryParameter("PolicyName", policyName);
		}
	}

	public String getUniRegionId() {
		return this.uniRegionId;
	}

	public void setUniRegionId(String uniRegionId) {
		this.uniRegionId = uniRegionId;
		if(uniRegionId != null){
			putQueryParameter("UniRegionId", uniRegionId);
		}
	}

	@Override
	public Class<CreateUniBackupPolicyResponse> getResponseClass() {
		return CreateUniBackupPolicyResponse.class;
	}

}
