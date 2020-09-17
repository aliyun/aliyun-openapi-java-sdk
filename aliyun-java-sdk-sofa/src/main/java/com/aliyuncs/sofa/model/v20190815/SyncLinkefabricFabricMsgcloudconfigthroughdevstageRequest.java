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
public class SyncLinkefabricFabricMsgcloudconfigthroughdevstageRequest extends RpcAcsRequest<SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponse> {
	   

	private String toEnv;

	private String fromEnv;

	private String appName;

	private Boolean isPublic;

	private String originAppName;

	private Long tenantId;

	private String projectId;

	private String toDevStage;

	private String configType;

	private String fromDevStage;
	public SyncLinkefabricFabricMsgcloudconfigthroughdevstageRequest() {
		super("SOFA", "2019-08-15", "SyncLinkefabricFabricMsgcloudconfigthroughdevstage", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getToEnv() {
		return this.toEnv;
	}

	public void setToEnv(String toEnv) {
		this.toEnv = toEnv;
		if(toEnv != null){
			putBodyParameter("ToEnv", toEnv);
		}
	}

	public String getFromEnv() {
		return this.fromEnv;
	}

	public void setFromEnv(String fromEnv) {
		this.fromEnv = fromEnv;
		if(fromEnv != null){
			putBodyParameter("FromEnv", fromEnv);
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

	public Boolean getIsPublic() {
		return this.isPublic;
	}

	public void setIsPublic(Boolean isPublic) {
		this.isPublic = isPublic;
		if(isPublic != null){
			putBodyParameter("IsPublic", isPublic.toString());
		}
	}

	public String getOriginAppName() {
		return this.originAppName;
	}

	public void setOriginAppName(String originAppName) {
		this.originAppName = originAppName;
		if(originAppName != null){
			putBodyParameter("OriginAppName", originAppName);
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

	public String getToDevStage() {
		return this.toDevStage;
	}

	public void setToDevStage(String toDevStage) {
		this.toDevStage = toDevStage;
		if(toDevStage != null){
			putBodyParameter("ToDevStage", toDevStage);
		}
	}

	public String getConfigType() {
		return this.configType;
	}

	public void setConfigType(String configType) {
		this.configType = configType;
		if(configType != null){
			putBodyParameter("ConfigType", configType);
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
	public Class<SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponse> getResponseClass() {
		return SyncLinkefabricFabricMsgcloudconfigthroughdevstageResponse.class;
	}

}
