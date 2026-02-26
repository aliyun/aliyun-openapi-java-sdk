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

package com.aliyuncs.mpaas.model.v20201028;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mpaas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryMscpRiskInfoRequest extends RpcAcsRequest<QueryMscpRiskInfoResponse> {
	   

	private String apdidToken;

	private String appId;

	private String tenantId;

	private String terminalType;

	private String workspaceId;
	public QueryMscpRiskInfoRequest() {
		super("mPaaS", "2020-10-28", "QueryMscpRiskInfo", "mpaas");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getApdidToken() {
		return this.apdidToken;
	}

	public void setApdidToken(String apdidToken) {
		this.apdidToken = apdidToken;
		if(apdidToken != null){
			putBodyParameter("ApdidToken", apdidToken);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putBodyParameter("AppId", appId);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public String getTerminalType() {
		return this.terminalType;
	}

	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
		if(terminalType != null){
			putBodyParameter("TerminalType", terminalType);
		}
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putBodyParameter("WorkspaceId", workspaceId);
		}
	}

	@Override
	public Class<QueryMscpRiskInfoResponse> getResponseClass() {
		return QueryMscpRiskInfoResponse.class;
	}

}
