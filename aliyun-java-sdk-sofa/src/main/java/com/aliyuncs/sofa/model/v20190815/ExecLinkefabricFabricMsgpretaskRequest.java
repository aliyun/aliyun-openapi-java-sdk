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
public class ExecLinkefabricFabricMsgpretaskRequest extends RpcAcsRequest<ExecLinkefabricFabricMsgpretaskResponse> {
	   

	private String envName;

	private Boolean isProdUrl;

	private Long envId;

	private String appName;

	private Long tenantId;

	private String projectId;

	private Boolean extraQuery;

	private String releaseId;
	public ExecLinkefabricFabricMsgpretaskRequest() {
		super("SOFA", "2019-08-15", "ExecLinkefabricFabricMsgpretask", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEnvName() {
		return this.envName;
	}

	public void setEnvName(String envName) {
		this.envName = envName;
		if(envName != null){
			putBodyParameter("EnvName", envName);
		}
	}

	public Boolean getIsProdUrl() {
		return this.isProdUrl;
	}

	public void setIsProdUrl(Boolean isProdUrl) {
		this.isProdUrl = isProdUrl;
		if(isProdUrl != null){
			putBodyParameter("IsProdUrl", isProdUrl.toString());
		}
	}

	public Long getEnvId() {
		return this.envId;
	}

	public void setEnvId(Long envId) {
		this.envId = envId;
		if(envId != null){
			putBodyParameter("EnvId", envId.toString());
		}
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

	public Long getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId.toString());
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId);
		}
	}

	public Boolean getExtraQuery() {
		return this.extraQuery;
	}

	public void setExtraQuery(Boolean extraQuery) {
		this.extraQuery = extraQuery;
		if(extraQuery != null){
			putBodyParameter("ExtraQuery", extraQuery.toString());
		}
	}

	public String getReleaseId() {
		return this.releaseId;
	}

	public void setReleaseId(String releaseId) {
		this.releaseId = releaseId;
		if(releaseId != null){
			putBodyParameter("ReleaseId", releaseId);
		}
	}

	@Override
	public Class<ExecLinkefabricFabricMsgpretaskResponse> getResponseClass() {
		return ExecLinkefabricFabricMsgpretaskResponse.class;
	}

}
