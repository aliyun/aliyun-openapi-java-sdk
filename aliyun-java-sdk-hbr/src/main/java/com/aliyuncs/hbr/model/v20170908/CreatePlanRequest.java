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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreatePlanRequest extends RpcAcsRequest<CreatePlanResponse> {
	   

	private String diffPolicyId;

	private String scheduleType;

	private String clientId;

	private String serverType;

	private String vaultId;

	private String incPolicyId;

	private String source;

	private String planName;

	private String sourceType;

	private String fullPolicyId;

	private Long retention;

	private String serverId;

	private String token;
	public CreatePlanRequest() {
		super("hbr", "2017-09-08", "CreatePlan", "hbr");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDiffPolicyId() {
		return this.diffPolicyId;
	}

	public void setDiffPolicyId(String diffPolicyId) {
		this.diffPolicyId = diffPolicyId;
		if(diffPolicyId != null){
			putQueryParameter("DiffPolicyId", diffPolicyId);
		}
	}

	public String getScheduleType() {
		return this.scheduleType;
	}

	public void setScheduleType(String scheduleType) {
		this.scheduleType = scheduleType;
		if(scheduleType != null){
			putQueryParameter("ScheduleType", scheduleType);
		}
	}

	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
		if(clientId != null){
			putQueryParameter("ClientId", clientId);
		}
	}

	public String getServerType() {
		return this.serverType;
	}

	public void setServerType(String serverType) {
		this.serverType = serverType;
		if(serverType != null){
			putQueryParameter("ServerType", serverType);
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

	public String getIncPolicyId() {
		return this.incPolicyId;
	}

	public void setIncPolicyId(String incPolicyId) {
		this.incPolicyId = incPolicyId;
		if(incPolicyId != null){
			putQueryParameter("IncPolicyId", incPolicyId);
		}
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putQueryParameter("Source", source);
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

	public String getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
		if(sourceType != null){
			putQueryParameter("SourceType", sourceType);
		}
	}

	public String getFullPolicyId() {
		return this.fullPolicyId;
	}

	public void setFullPolicyId(String fullPolicyId) {
		this.fullPolicyId = fullPolicyId;
		if(fullPolicyId != null){
			putQueryParameter("FullPolicyId", fullPolicyId);
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

	public String getServerId() {
		return this.serverId;
	}

	public void setServerId(String serverId) {
		this.serverId = serverId;
		if(serverId != null){
			putQueryParameter("ServerId", serverId);
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
		}
	}

	@Override
	public Class<CreatePlanResponse> getResponseClass() {
		return CreatePlanResponse.class;
	}

}
