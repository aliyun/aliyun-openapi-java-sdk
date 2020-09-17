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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkefabricFabricExistdrmresourcetplRequest extends RpcAcsRequest<QueryLinkefabricFabricExistdrmresourcetplResponse> {
	   

	private String appName;

	private String tenantId;

	private String keyword;

	private String env;

	private String devStage;

	private String isStandard;
	public QueryLinkefabricFabricExistdrmresourcetplRequest() {
		super("SOFA", "2019-08-15", "QueryLinkefabricFabricExistdrmresourcetpl", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putBodyParameter("AppName", appName);
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

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putBodyParameter("Keyword", keyword);
		}
	}

	public String getEnv() {
		return this.env;
	}

	public void setEnv(String env) {
		this.env = env;
		if(env != null){
			putBodyParameter("Env", env);
		}
	}

	public String getDevStage() {
		return this.devStage;
	}

	public void setDevStage(String devStage) {
		this.devStage = devStage;
		if(devStage != null){
			putBodyParameter("DevStage", devStage);
		}
	}

	public String getIsStandard() {
		return this.isStandard;
	}

	public void setIsStandard(String isStandard) {
		this.isStandard = isStandard;
		if(isStandard != null){
			putBodyParameter("IsStandard", isStandard);
		}
	}

	@Override
	public Class<QueryLinkefabricFabricExistdrmresourcetplResponse> getResponseClass() {
		return QueryLinkefabricFabricExistdrmresourcetplResponse.class;
	}

}
