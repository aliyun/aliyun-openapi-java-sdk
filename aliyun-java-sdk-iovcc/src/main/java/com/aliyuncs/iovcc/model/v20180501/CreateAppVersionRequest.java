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

package com.aliyuncs.iovcc.model.v20180501;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iovcc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateAppVersionRequest extends RpcAcsRequest<CreateAppVersionResponse> {
	   

	private String apkMd5;

	private String isForceUpgrade;

	private String installType;

	private String remark;

	private String isSilentUpgrade;

	private String packageUrl;

	private String whiteVersionList;

	private String restartAppType;

	private String versionCode;

	private String projectId;

	private String deviceAdapterList;

	private String isNeedRestart;

	private String appVersion;

	private String restartAppParam;

	private String blackVersionList;

	private String isAllowNewInstall;

	private String appId;

	private String releaseNote;

	private String restartType;
	public CreateAppVersionRequest() {
		super("iovcc", "2018-05-01", "CreateAppVersion", "iovcc");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getApkMd5() {
		return this.apkMd5;
	}

	public void setApkMd5(String apkMd5) {
		this.apkMd5 = apkMd5;
		if(apkMd5 != null){
			putQueryParameter("ApkMd5", apkMd5);
		}
	}

	public String getIsForceUpgrade() {
		return this.isForceUpgrade;
	}

	public void setIsForceUpgrade(String isForceUpgrade) {
		this.isForceUpgrade = isForceUpgrade;
		if(isForceUpgrade != null){
			putQueryParameter("IsForceUpgrade", isForceUpgrade);
		}
	}

	public String getInstallType() {
		return this.installType;
	}

	public void setInstallType(String installType) {
		this.installType = installType;
		if(installType != null){
			putQueryParameter("InstallType", installType);
		}
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public String getIsSilentUpgrade() {
		return this.isSilentUpgrade;
	}

	public void setIsSilentUpgrade(String isSilentUpgrade) {
		this.isSilentUpgrade = isSilentUpgrade;
		if(isSilentUpgrade != null){
			putQueryParameter("IsSilentUpgrade", isSilentUpgrade);
		}
	}

	public String getPackageUrl() {
		return this.packageUrl;
	}

	public void setPackageUrl(String packageUrl) {
		this.packageUrl = packageUrl;
		if(packageUrl != null){
			putQueryParameter("PackageUrl", packageUrl);
		}
	}

	public String getWhiteVersionList() {
		return this.whiteVersionList;
	}

	public void setWhiteVersionList(String whiteVersionList) {
		this.whiteVersionList = whiteVersionList;
		if(whiteVersionList != null){
			putQueryParameter("WhiteVersionList", whiteVersionList);
		}
	}

	public String getRestartAppType() {
		return this.restartAppType;
	}

	public void setRestartAppType(String restartAppType) {
		this.restartAppType = restartAppType;
		if(restartAppType != null){
			putQueryParameter("RestartAppType", restartAppType);
		}
	}

	public String getVersionCode() {
		return this.versionCode;
	}

	public void setVersionCode(String versionCode) {
		this.versionCode = versionCode;
		if(versionCode != null){
			putQueryParameter("VersionCode", versionCode);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId);
		}
	}

	public String getDeviceAdapterList() {
		return this.deviceAdapterList;
	}

	public void setDeviceAdapterList(String deviceAdapterList) {
		this.deviceAdapterList = deviceAdapterList;
		if(deviceAdapterList != null){
			putQueryParameter("DeviceAdapterList", deviceAdapterList);
		}
	}

	public String getIsNeedRestart() {
		return this.isNeedRestart;
	}

	public void setIsNeedRestart(String isNeedRestart) {
		this.isNeedRestart = isNeedRestart;
		if(isNeedRestart != null){
			putQueryParameter("IsNeedRestart", isNeedRestart);
		}
	}

	public String getAppVersion() {
		return this.appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
		if(appVersion != null){
			putQueryParameter("AppVersion", appVersion);
		}
	}

	public String getRestartAppParam() {
		return this.restartAppParam;
	}

	public void setRestartAppParam(String restartAppParam) {
		this.restartAppParam = restartAppParam;
		if(restartAppParam != null){
			putQueryParameter("RestartAppParam", restartAppParam);
		}
	}

	public String getBlackVersionList() {
		return this.blackVersionList;
	}

	public void setBlackVersionList(String blackVersionList) {
		this.blackVersionList = blackVersionList;
		if(blackVersionList != null){
			putQueryParameter("BlackVersionList", blackVersionList);
		}
	}

	public String getIsAllowNewInstall() {
		return this.isAllowNewInstall;
	}

	public void setIsAllowNewInstall(String isAllowNewInstall) {
		this.isAllowNewInstall = isAllowNewInstall;
		if(isAllowNewInstall != null){
			putQueryParameter("IsAllowNewInstall", isAllowNewInstall);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public String getReleaseNote() {
		return this.releaseNote;
	}

	public void setReleaseNote(String releaseNote) {
		this.releaseNote = releaseNote;
		if(releaseNote != null){
			putQueryParameter("ReleaseNote", releaseNote);
		}
	}

	public String getRestartType() {
		return this.restartType;
	}

	public void setRestartType(String restartType) {
		this.restartType = restartType;
		if(restartType != null){
			putQueryParameter("RestartType", restartType);
		}
	}

	@Override
	public Class<CreateAppVersionResponse> getResponseClass() {
		return CreateAppVersionResponse.class;
	}

}
