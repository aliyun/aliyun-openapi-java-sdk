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
public class CreateMdsCubeResourceRequest extends RpcAcsRequest<CreateMdsCubeResourceResponse> {
	   

	private Boolean onexFlag;

	private String platform;

	private String previewPictureUrl;

	private String androidMaxVersion;

	private String tenantId;

	private String extendInfo;

	private String iosMinVersion;

	private String androidMinVersion;

	private String mockDataUrl;

	private String templateId;

	private String templateResourceDesc;

	private String appId;

	private String iosMaxVersion;

	private String fileUrl;

	private String templateResourceVersion;

	private String workspaceId;
	public CreateMdsCubeResourceRequest() {
		super("mPaaS", "2020-10-28", "CreateMdsCubeResource", "mpaas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getPlatform() {
		return this.platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
		if(platform != null){
			putBodyParameter("Platform", platform);
		}
	}

	public String getPreviewPictureUrl() {
		return this.previewPictureUrl;
	}

	public void setPreviewPictureUrl(String previewPictureUrl) {
		this.previewPictureUrl = previewPictureUrl;
		if(previewPictureUrl != null){
			putBodyParameter("PreviewPictureUrl", previewPictureUrl);
		}
	}

	public String getAndroidMaxVersion() {
		return this.androidMaxVersion;
	}

	public void setAndroidMaxVersion(String androidMaxVersion) {
		this.androidMaxVersion = androidMaxVersion;
		if(androidMaxVersion != null){
			putBodyParameter("AndroidMaxVersion", androidMaxVersion);
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

	public String getIosMinVersion() {
		return this.iosMinVersion;
	}

	public void setIosMinVersion(String iosMinVersion) {
		this.iosMinVersion = iosMinVersion;
		if(iosMinVersion != null){
			putBodyParameter("IosMinVersion", iosMinVersion);
		}
	}

	public String getAndroidMinVersion() {
		return this.androidMinVersion;
	}

	public void setAndroidMinVersion(String androidMinVersion) {
		this.androidMinVersion = androidMinVersion;
		if(androidMinVersion != null){
			putBodyParameter("AndroidMinVersion", androidMinVersion);
		}
	}

	public String getMockDataUrl() {
		return this.mockDataUrl;
	}

	public void setMockDataUrl(String mockDataUrl) {
		this.mockDataUrl = mockDataUrl;
		if(mockDataUrl != null){
			putBodyParameter("MockDataUrl", mockDataUrl);
		}
	}

	public String getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putBodyParameter("TemplateId", templateId);
		}
	}

	public String getTemplateResourceDesc() {
		return this.templateResourceDesc;
	}

	public void setTemplateResourceDesc(String templateResourceDesc) {
		this.templateResourceDesc = templateResourceDesc;
		if(templateResourceDesc != null){
			putBodyParameter("TemplateResourceDesc", templateResourceDesc);
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

	public String getIosMaxVersion() {
		return this.iosMaxVersion;
	}

	public void setIosMaxVersion(String iosMaxVersion) {
		this.iosMaxVersion = iosMaxVersion;
		if(iosMaxVersion != null){
			putBodyParameter("IosMaxVersion", iosMaxVersion);
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

	public String getTemplateResourceVersion() {
		return this.templateResourceVersion;
	}

	public void setTemplateResourceVersion(String templateResourceVersion) {
		this.templateResourceVersion = templateResourceVersion;
		if(templateResourceVersion != null){
			putBodyParameter("TemplateResourceVersion", templateResourceVersion);
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
	public Class<CreateMdsCubeResourceResponse> getResponseClass() {
		return CreateMdsCubeResourceResponse.class;
	}

}
