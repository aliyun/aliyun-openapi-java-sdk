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
public class CreateMcubeUpgradePackageRequest extends RpcAcsRequest<CreateMcubeUpgradePackageResponse> {
	   

	private Integer validDays;

	private String bundleId;

	private Boolean onexFlag;

	private Integer isEnterprise;

	private String platform;

	private String tenantId;

	private String appstoreUrl;

	private String downloadUrl;

	private String appVersion;

	private Integer installAmount;

	private Integer needCheck;

	private String iosSymbolfileUrl;

	private String iconFileUrl;

	private String appId;

	private String fileUrl;

	private String customDomainName;

	private String workspaceId;

	private String desc;
	public CreateMcubeUpgradePackageRequest() {
		super("mPaaS", "2020-10-28", "CreateMcubeUpgradePackage", "mpaas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getValidDays() {
		return this.validDays;
	}

	public void setValidDays(Integer validDays) {
		this.validDays = validDays;
		if(validDays != null){
			putBodyParameter("ValidDays", validDays.toString());
		}
	}

	public String getBundleId() {
		return this.bundleId;
	}

	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
		if(bundleId != null){
			putBodyParameter("BundleId", bundleId);
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

	public Integer getIsEnterprise() {
		return this.isEnterprise;
	}

	public void setIsEnterprise(Integer isEnterprise) {
		this.isEnterprise = isEnterprise;
		if(isEnterprise != null){
			putBodyParameter("IsEnterprise", isEnterprise.toString());
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

	public String getAppstoreUrl() {
		return this.appstoreUrl;
	}

	public void setAppstoreUrl(String appstoreUrl) {
		this.appstoreUrl = appstoreUrl;
		if(appstoreUrl != null){
			putBodyParameter("AppstoreUrl", appstoreUrl);
		}
	}

	public String getDownloadUrl() {
		return this.downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
		if(downloadUrl != null){
			putBodyParameter("DownloadUrl", downloadUrl);
		}
	}

	public String getAppVersion() {
		return this.appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
		if(appVersion != null){
			putBodyParameter("AppVersion", appVersion);
		}
	}

	public Integer getInstallAmount() {
		return this.installAmount;
	}

	public void setInstallAmount(Integer installAmount) {
		this.installAmount = installAmount;
		if(installAmount != null){
			putBodyParameter("InstallAmount", installAmount.toString());
		}
	}

	public Integer getNeedCheck() {
		return this.needCheck;
	}

	public void setNeedCheck(Integer needCheck) {
		this.needCheck = needCheck;
		if(needCheck != null){
			putBodyParameter("NeedCheck", needCheck.toString());
		}
	}

	public String getIosSymbolfileUrl() {
		return this.iosSymbolfileUrl;
	}

	public void setIosSymbolfileUrl(String iosSymbolfileUrl) {
		this.iosSymbolfileUrl = iosSymbolfileUrl;
		if(iosSymbolfileUrl != null){
			putBodyParameter("IosSymbolfileUrl", iosSymbolfileUrl);
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

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
		if(desc != null){
			putBodyParameter("Desc", desc);
		}
	}

	@Override
	public Class<CreateMcubeUpgradePackageResponse> getResponseClass() {
		return CreateMcubeUpgradePackageResponse.class;
	}

}
