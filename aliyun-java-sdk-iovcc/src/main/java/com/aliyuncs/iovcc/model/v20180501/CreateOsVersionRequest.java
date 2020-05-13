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
public class CreateOsVersionRequest extends RpcAcsRequest<CreateOsVersionResponse> {
	   

	private String isForceNightUpgrade;

	private String isForceUpgrade;

	private String isMilestone;

	private String remark;

	private String romList;

	private String deviceModelId;

	private String whiteVersionList;

	private String projectId;

	private String systemVersion;

	private String nightUpgradeIsShowTip;

	private String nightUpgradeIsAllowedCancel;

	private String minClientVersion;

	private String nightUpgradeDownloadType;

	private String blackVersionList;

	private String enableMobileDownload;

	private String maxClientVersion;

	private String releaseNote;

	private String mobileDownloadMaxSize;
	public CreateOsVersionRequest() {
		super("iovcc", "2018-05-01", "CreateOsVersion", "iovcc");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIsForceNightUpgrade() {
		return this.isForceNightUpgrade;
	}

	public void setIsForceNightUpgrade(String isForceNightUpgrade) {
		this.isForceNightUpgrade = isForceNightUpgrade;
		if(isForceNightUpgrade != null){
			putQueryParameter("IsForceNightUpgrade", isForceNightUpgrade);
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

	public String getIsMilestone() {
		return this.isMilestone;
	}

	public void setIsMilestone(String isMilestone) {
		this.isMilestone = isMilestone;
		if(isMilestone != null){
			putQueryParameter("IsMilestone", isMilestone);
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

	public String getRomList() {
		return this.romList;
	}

	public void setRomList(String romList) {
		this.romList = romList;
		if(romList != null){
			putQueryParameter("RomList", romList);
		}
	}

	public String getDeviceModelId() {
		return this.deviceModelId;
	}

	public void setDeviceModelId(String deviceModelId) {
		this.deviceModelId = deviceModelId;
		if(deviceModelId != null){
			putQueryParameter("DeviceModelId", deviceModelId);
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

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId);
		}
	}

	public String getSystemVersion() {
		return this.systemVersion;
	}

	public void setSystemVersion(String systemVersion) {
		this.systemVersion = systemVersion;
		if(systemVersion != null){
			putQueryParameter("SystemVersion", systemVersion);
		}
	}

	public String getNightUpgradeIsShowTip() {
		return this.nightUpgradeIsShowTip;
	}

	public void setNightUpgradeIsShowTip(String nightUpgradeIsShowTip) {
		this.nightUpgradeIsShowTip = nightUpgradeIsShowTip;
		if(nightUpgradeIsShowTip != null){
			putQueryParameter("NightUpgradeIsShowTip", nightUpgradeIsShowTip);
		}
	}

	public String getNightUpgradeIsAllowedCancel() {
		return this.nightUpgradeIsAllowedCancel;
	}

	public void setNightUpgradeIsAllowedCancel(String nightUpgradeIsAllowedCancel) {
		this.nightUpgradeIsAllowedCancel = nightUpgradeIsAllowedCancel;
		if(nightUpgradeIsAllowedCancel != null){
			putQueryParameter("NightUpgradeIsAllowedCancel", nightUpgradeIsAllowedCancel);
		}
	}

	public String getMinClientVersion() {
		return this.minClientVersion;
	}

	public void setMinClientVersion(String minClientVersion) {
		this.minClientVersion = minClientVersion;
		if(minClientVersion != null){
			putQueryParameter("MinClientVersion", minClientVersion);
		}
	}

	public String getNightUpgradeDownloadType() {
		return this.nightUpgradeDownloadType;
	}

	public void setNightUpgradeDownloadType(String nightUpgradeDownloadType) {
		this.nightUpgradeDownloadType = nightUpgradeDownloadType;
		if(nightUpgradeDownloadType != null){
			putQueryParameter("NightUpgradeDownloadType", nightUpgradeDownloadType);
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

	public String getEnableMobileDownload() {
		return this.enableMobileDownload;
	}

	public void setEnableMobileDownload(String enableMobileDownload) {
		this.enableMobileDownload = enableMobileDownload;
		if(enableMobileDownload != null){
			putQueryParameter("EnableMobileDownload", enableMobileDownload);
		}
	}

	public String getMaxClientVersion() {
		return this.maxClientVersion;
	}

	public void setMaxClientVersion(String maxClientVersion) {
		this.maxClientVersion = maxClientVersion;
		if(maxClientVersion != null){
			putQueryParameter("MaxClientVersion", maxClientVersion);
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

	public String getMobileDownloadMaxSize() {
		return this.mobileDownloadMaxSize;
	}

	public void setMobileDownloadMaxSize(String mobileDownloadMaxSize) {
		this.mobileDownloadMaxSize = mobileDownloadMaxSize;
		if(mobileDownloadMaxSize != null){
			putQueryParameter("MobileDownloadMaxSize", mobileDownloadMaxSize);
		}
	}

	@Override
	public Class<CreateOsVersionResponse> getResponseClass() {
		return CreateOsVersionResponse.class;
	}

}
