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
public class CheckLinkeBahamutFabricconfigRequest extends RpcAcsRequest<CheckLinkeBahamutFabricconfigResponse> {
	   

	private String tenantId;

	private String projectId;

	private String app;

	private String toDevStage;

	private String releaseId;

	private String fromDevStage;
	public CheckLinkeBahamutFabricconfigRequest() {
		super("SOFA", "2019-08-15", "CheckLinkeBahamutFabricconfig", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId);
		}
	}

	public String getApp() {
		return this.app;
	}

	public void setApp(String app) {
		this.app = app;
		if(app != null){
			putBodyParameter("App", app);
		}
	}

	public String getToDevStage() {
		return this.toDevStage;
	}

	public void setToDevStage(String toDevStage) {
		this.toDevStage = toDevStage;
		if(toDevStage != null){
			putBodyParameter("ToDevStage", toDevStage);
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

	public String getFromDevStage() {
		return this.fromDevStage;
	}

	public void setFromDevStage(String fromDevStage) {
		this.fromDevStage = fromDevStage;
		if(fromDevStage != null){
			putBodyParameter("FromDevStage", fromDevStage);
		}
	}

	@Override
	public Class<CheckLinkeBahamutFabricconfigResponse> getResponseClass() {
		return CheckLinkeBahamutFabricconfigResponse.class;
	}

}
