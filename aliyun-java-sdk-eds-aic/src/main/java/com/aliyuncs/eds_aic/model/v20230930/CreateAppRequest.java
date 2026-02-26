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

package com.aliyuncs.eds_aic.model.v20230930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateAppRequest extends RpcAcsRequest<CreateAppResponse> {
	   

	private String bizRegionId;

	private String signApk;

	private String description;

	private String appName;

	private String filePath;

	private String ossAppUrl;

	private String customAppInfo;

	private String installParam;

	private String fileName;

	private String iconUrl;
	public CreateAppRequest() {
		super("eds-aic", "2023-09-30", "CreateApp");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getBizRegionId() {
		return this.bizRegionId;
	}

	public void setBizRegionId(String bizRegionId) {
		this.bizRegionId = bizRegionId;
		if(bizRegionId != null){
			putQueryParameter("BizRegionId", bizRegionId);
		}
	}

	public String getSignApk() {
		return this.signApk;
	}

	public void setSignApk(String signApk) {
		this.signApk = signApk;
		if(signApk != null){
			putQueryParameter("SignApk", signApk);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
		if(filePath != null){
			putQueryParameter("FilePath", filePath);
		}
	}

	public String getOssAppUrl() {
		return this.ossAppUrl;
	}

	public void setOssAppUrl(String ossAppUrl) {
		this.ossAppUrl = ossAppUrl;
		if(ossAppUrl != null){
			putQueryParameter("OssAppUrl", ossAppUrl);
		}
	}

	public String getCustomAppInfo() {
		return this.customAppInfo;
	}

	public void setCustomAppInfo(String customAppInfo) {
		this.customAppInfo = customAppInfo;
		if(customAppInfo != null){
			putQueryParameter("CustomAppInfo", customAppInfo);
		}
	}

	public String getInstallParam() {
		return this.installParam;
	}

	public void setInstallParam(String installParam) {
		this.installParam = installParam;
		if(installParam != null){
			putQueryParameter("InstallParam", installParam);
		}
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
		if(fileName != null){
			putQueryParameter("FileName", fileName);
		}
	}

	public String getIconUrl() {
		return this.iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
		if(iconUrl != null){
			putQueryParameter("IconUrl", iconUrl);
		}
	}

	@Override
	public Class<CreateAppResponse> getResponseClass() {
		return CreateAppResponse.class;
	}

}
