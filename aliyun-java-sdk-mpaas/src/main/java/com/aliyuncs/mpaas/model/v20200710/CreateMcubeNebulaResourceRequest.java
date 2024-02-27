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

package com.aliyuncs.mpaas.model.v20200710;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mpaas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateMcubeNebulaResourceRequest extends RpcAcsRequest<CreateMcubeNebulaResourceResponse> {
	   

	private Integer autoInstall;

	private Integer installType;

	private Boolean onexFlag;

	private String h5Version;

	private String h5Name;

	private String platform;

	private Integer repeatNebula;

	private String h5Id;

	private String tenantId;

	private String extendInfo;

	private String mainUrl;

	private String clientVersionMin;

	private Integer resourceType;

	private String vhost;

	private String subUrl;

	private String clientVersionMax;

	private String appId;

	private String fileUrl;

	private String customDomainName;

	private String workspaceId;
	public CreateMcubeNebulaResourceRequest() {
		super("mPaaS", "2020-07-10", "CreateMcubeNebulaResource", "mpaas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getAutoInstall() {
		return this.autoInstall;
	}

	public void setAutoInstall(Integer autoInstall) {
		this.autoInstall = autoInstall;
		if(autoInstall != null){
			putBodyParameter("AutoInstall", autoInstall.toString());
		}
	}

	public Integer getInstallType() {
		return this.installType;
	}

	public void setInstallType(Integer installType) {
		this.installType = installType;
		if(installType != null){
			putBodyParameter("InstallType", installType.toString());
		}
	}

	public Boolean getOnexFlag() {
		return this.onexFlag;
	}

	public void setOnexFlag(Boolean onexFlag) {
		this.onexFlag = onexFlag;
		if(onexFlag != null){
			putBodyParameter("OnexFlag", onexFlag.toString());
		}
	}

	public String getH5Version() {
		return this.h5Version;
	}

	public void setH5Version(String h5Version) {
		this.h5Version = h5Version;
		if(h5Version != null){
			putBodyParameter("H5Version", h5Version);
		}
	}

	public String getH5Name() {
		return this.h5Name;
	}

	public void setH5Name(String h5Name) {
		this.h5Name = h5Name;
		if(h5Name != null){
			putBodyParameter("H5Name", h5Name);
		}
	}

	public String getPlatform() {
		return this.platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
		if(platform != null){
			putBodyParameter("Platform", platform);
		}
	}

	public Integer getRepeatNebula() {
		return this.repeatNebula;
	}

	public void setRepeatNebula(Integer repeatNebula) {
		this.repeatNebula = repeatNebula;
		if(repeatNebula != null){
			putBodyParameter("RepeatNebula", repeatNebula.toString());
		}
	}

	public String getH5Id() {
		return this.h5Id;
	}

	public void setH5Id(String h5Id) {
		this.h5Id = h5Id;
		if(h5Id != null){
			putBodyParameter("H5Id", h5Id);
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

	public String getExtendInfo() {
		return this.extendInfo;
	}

	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
		if(extendInfo != null){
			putBodyParameter("ExtendInfo", extendInfo);
		}
	}

	public String getMainUrl() {
		return this.mainUrl;
	}

	public void setMainUrl(String mainUrl) {
		this.mainUrl = mainUrl;
		if(mainUrl != null){
			putBodyParameter("MainUrl", mainUrl);
		}
	}

	public String getClientVersionMin() {
		return this.clientVersionMin;
	}

	public void setClientVersionMin(String clientVersionMin) {
		this.clientVersionMin = clientVersionMin;
		if(clientVersionMin != null){
			putBodyParameter("ClientVersionMin", clientVersionMin);
		}
	}

	public Integer getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(Integer resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putBodyParameter("ResourceType", resourceType.toString());
		}
	}

	public String getVhost() {
		return this.vhost;
	}

	public void setVhost(String vhost) {
		this.vhost = vhost;
		if(vhost != null){
			putBodyParameter("Vhost", vhost);
		}
	}

	public String getSubUrl() {
		return this.subUrl;
	}

	public void setSubUrl(String subUrl) {
		this.subUrl = subUrl;
		if(subUrl != null){
			putBodyParameter("SubUrl", subUrl);
		}
	}

	public String getClientVersionMax() {
		return this.clientVersionMax;
	}

	public void setClientVersionMax(String clientVersionMax) {
		this.clientVersionMax = clientVersionMax;
		if(clientVersionMax != null){
			putBodyParameter("ClientVersionMax", clientVersionMax);
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

	public String getFileUrl() {
		return this.fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
		if(fileUrl != null){
			putBodyParameter("FileUrl", fileUrl);
		}
	}

	public String getCustomDomainName() {
		return this.customDomainName;
	}

	public void setCustomDomainName(String customDomainName) {
		this.customDomainName = customDomainName;
		if(customDomainName != null){
			putBodyParameter("CustomDomainName", customDomainName);
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
	public Class<CreateMcubeNebulaResourceResponse> getResponseClass() {
		return CreateMcubeNebulaResourceResponse.class;
	}

}
