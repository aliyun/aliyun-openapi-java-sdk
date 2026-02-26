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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mpaas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryInfoFromMdpRequest extends RpcAcsRequest<QueryInfoFromMdpResponse> {
	   

	private String mobileSm3;

	private String riskScene;

	private String mobile;

	private String mobileMd5;

	private String appId;

	private String mobileSha256;

	private String workspaceId;
	public QueryInfoFromMdpRequest() {
		super("mPaaS", "2020-10-28", "QueryInfoFromMdp", "mpaas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMobileSm3() {
		return this.mobileSm3;
	}

	public void setMobileSm3(String mobileSm3) {
		this.mobileSm3 = mobileSm3;
		if(mobileSm3 != null){
			putBodyParameter("MobileSm3", mobileSm3);
		}
	}

	public String getRiskScene() {
		return this.riskScene;
	}

	public void setRiskScene(String riskScene) {
		this.riskScene = riskScene;
		if(riskScene != null){
			putBodyParameter("RiskScene", riskScene);
		}
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
		if(mobile != null){
			putBodyParameter("Mobile", mobile);
		}
	}

	public String getMobileMd5() {
		return this.mobileMd5;
	}

	public void setMobileMd5(String mobileMd5) {
		this.mobileMd5 = mobileMd5;
		if(mobileMd5 != null){
			putBodyParameter("MobileMd5", mobileMd5);
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

	public String getMobileSha256() {
		return this.mobileSha256;
	}

	public void setMobileSha256(String mobileSha256) {
		this.mobileSha256 = mobileSha256;
		if(mobileSha256 != null){
			putBodyParameter("MobileSha256", mobileSha256);
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
	public Class<QueryInfoFromMdpResponse> getResponseClass() {
		return QueryInfoFromMdpResponse.class;
	}

}
