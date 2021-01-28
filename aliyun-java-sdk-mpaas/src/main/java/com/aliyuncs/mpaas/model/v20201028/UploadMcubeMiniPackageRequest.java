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
public class UploadMcubeMiniPackageRequest extends RpcAcsRequest<UploadMcubeMiniPackageResponse> {
	   

	private Long autoInstall;

	private Long installType;

	private Boolean onexFlag;

	private String enableOptionMenu;

	private String h5Version;

	private Long enableTabBar;

	private String userId;

	private String uuid;

	private String resourceFileUrl;

	private String h5Id;

	private String extendInfo;

	private String mainUrl;

	private String clientVersionMin;

	private String enableKeepAlive;

	private String vhost;

	private String clientVersionMax;

	private Long packageType;

	private String workspaceId;

	private String h5Name;

	private String platform;

	private String tenantId;

	private Long resourceType;

	private String iconFileUrl;

	private String appId;
	public UploadMcubeMiniPackageRequest() {
		super("mPaaS", "2020-10-28", "UploadMcubeMiniPackage");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getAutoInstall() {
		return this.autoInstall;
	}

	public void setAutoInstall(Long autoInstall) {
		this.autoInstall = autoInstall;
		if(autoInstall != null){
			putBodyParameter("AutoInstall", autoInstall.toString());
		}
	}

	public Long getInstallType() {
		return this.installType;
	}

	public void setInstallType(Long installType) {
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

	public String getEnableOptionMenu() {
		return this.enableOptionMenu;
	}

	public void setEnableOptionMenu(String enableOptionMenu) {
		this.enableOptionMenu = enableOptionMenu;
		if(enableOptionMenu != null){
			putBodyParameter("EnableOptionMenu", enableOptionMenu);
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

	public Long getEnableTabBar() {
		return this.enableTabBar;
	}

	public void setEnableTabBar(Long enableTabBar) {
		this.enableTabBar = enableTabBar;
		if(enableTabBar != null){
			putBodyParameter("EnableTabBar", enableTabBar.toString());
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putBodyParameter("UserId", userId);
		}
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
		if(uuid != null){
			putBodyParameter("Uuid", uuid);
		}
	}

	public String getResourceFileUrl() {
		return this.resourceFileUrl;
	}

	public void setResourceFileUrl(String resourceFileUrl) {
		this.resourceFileUrl = resourceFileUrl;
		if(resourceFileUrl != null){
			putBodyParameter("ResourceFileUrl", resourceFileUrl);
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

	public String getEnableKeepAlive() {
		return this.enableKeepAlive;
	}

	public void setEnableKeepAlive(String enableKeepAlive) {
		this.enableKeepAlive = enableKeepAlive;
		if(enableKeepAlive != null){
			putBodyParameter("EnableKeepAlive", enableKeepAlive);
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

	public String getClientVersionMax() {
		return this.clientVersionMax;
	}

	public void setClientVersionMax(String clientVersionMax) {
		this.clientVersionMax = clientVersionMax;
		if(clientVersionMax != null){
			putBodyParameter("ClientVersionMax", clientVersionMax);
		}
	}

	public Long getPackageType() {
		return this.packageType;
	}

	public void setPackageType(Long packageType) {
		this.packageType = packageType;
		if(packageType != null){
			putBodyParameter("PackageType", packageType.toString());
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

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public Long getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(Long resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putBodyParameter("ResourceType", resourceType.toString());
		}
	}

	public String getIconFileUrl() {
		return this.iconFileUrl;
	}

	public void setIconFileUrl(String iconFileUrl) {
		this.iconFileUrl = iconFileUrl;
		if(iconFileUrl != null){
			putBodyParameter("IconFileUrl", iconFileUrl);
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

	@Override
	public Class<UploadMcubeMiniPackageResponse> getResponseClass() {
		return UploadMcubeMiniPackageResponse.class;
	}

}
