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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyPolicyGroupRequest extends RpcAcsRequest<ModifyPolicyGroupResponse> {
	   

	private List<RevokeSecurityPolicyRule> revokeSecurityPolicyRules;

	private String printerRedirection;

	private String wyAssistant;

	private String localDrive;

	private List<AuthorizeSecurityPolicyRule> authorizeSecurityPolicyRules;

	private String watermarkSecurity;

	private String clipboard;

	private String endUserApplyAdminCoordinate;

	private String usbRedirect;

	private String recordingStartTime;

	private Integer watermarkColor;

	private String watermark;

	private List<DomainResolveRule> domainResolveRules;

	private String watermarkPower;

	private String policyGroupId;

	private List<ClientType> clientTypes;

	private List<DeviceRedirects> deviceRedirectss;

	private List<String> scopeValues;

	private Long recordingFps;

	private String watermarkFontStyle;

	private String recordingUserNotifyMessage;

	private String endUserGroupCoordinate;

	private Double watermarkDegree;

	private String remoteCoordinate;

	private String gpuAcceleration;

	private String html5FileTransfer;

	private List<DeviceRules> deviceRuless;

	private String internetCommunicationProtocol;

	private Long recordingExpires;

	private List<String> preemptLoginUsers;

	private String domainList;

	private String netRedirect;

	private Integer watermarkTransparencyValue;

	private String watermarkType;

	private String adminAccess;

	private Integer recordingDuration;

	private List<RevokeAccessPolicyRule> revokeAccessPolicyRules;

	private String cameraRedirect;

	private String videoRedirect;

	private String appContentProtection;

	private List<AuthorizeAccessPolicyRule> authorizeAccessPolicyRules;

	private Integer maxReconnectTime;

	private String watermarkTransparency;

	private String name;

	private String preemptLogin;

	private List<UsbSupplyRedirectRule> usbSupplyRedirectRules;

	private Integer watermarkFontSize;

	private String watermarkAntiCam;

	private String recording;

	private String domainResolveRuleType;

	private String recordContent;

	private String scope;

	private Integer watermarkRowAmount;

	private Long recordContentExpires;

	private String recordingAudio;

	private String html5Access;

	private String visualQuality;

	private String recordingEndTime;

	private String recordingUserNotify;
	public ModifyPolicyGroupRequest() {
		super("ecd", "2020-09-30", "ModifyPolicyGroup", "gwsecd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<RevokeSecurityPolicyRule> getRevokeSecurityPolicyRules() {
		return this.revokeSecurityPolicyRules;
	}

	public void setRevokeSecurityPolicyRules(List<RevokeSecurityPolicyRule> revokeSecurityPolicyRules) {
		this.revokeSecurityPolicyRules = revokeSecurityPolicyRules;	
		if (revokeSecurityPolicyRules != null) {
			for (int depth1 = 0; depth1 < revokeSecurityPolicyRules.size(); depth1++) {
				putQueryParameter("RevokeSecurityPolicyRule." + (depth1 + 1) + ".PortRange" , revokeSecurityPolicyRules.get(depth1).getPortRange());
				putQueryParameter("RevokeSecurityPolicyRule." + (depth1 + 1) + ".IpProtocol" , revokeSecurityPolicyRules.get(depth1).getIpProtocol());
				putQueryParameter("RevokeSecurityPolicyRule." + (depth1 + 1) + ".Description" , revokeSecurityPolicyRules.get(depth1).getDescription());
				putQueryParameter("RevokeSecurityPolicyRule." + (depth1 + 1) + ".Type" , revokeSecurityPolicyRules.get(depth1).getType());
				putQueryParameter("RevokeSecurityPolicyRule." + (depth1 + 1) + ".Priority" , revokeSecurityPolicyRules.get(depth1).getPriority());
				putQueryParameter("RevokeSecurityPolicyRule." + (depth1 + 1) + ".CidrIp" , revokeSecurityPolicyRules.get(depth1).getCidrIp());
				putQueryParameter("RevokeSecurityPolicyRule." + (depth1 + 1) + ".Policy" , revokeSecurityPolicyRules.get(depth1).getPolicy());
			}
		}	
	}

	public String getPrinterRedirection() {
		return this.printerRedirection;
	}

	public void setPrinterRedirection(String printerRedirection) {
		this.printerRedirection = printerRedirection;
		if(printerRedirection != null){
			putQueryParameter("PrinterRedirection", printerRedirection);
		}
	}

	public String getWyAssistant() {
		return this.wyAssistant;
	}

	public void setWyAssistant(String wyAssistant) {
		this.wyAssistant = wyAssistant;
		if(wyAssistant != null){
			putQueryParameter("WyAssistant", wyAssistant);
		}
	}

	public String getLocalDrive() {
		return this.localDrive;
	}

	public void setLocalDrive(String localDrive) {
		this.localDrive = localDrive;
		if(localDrive != null){
			putQueryParameter("LocalDrive", localDrive);
		}
	}

	public List<AuthorizeSecurityPolicyRule> getAuthorizeSecurityPolicyRules() {
		return this.authorizeSecurityPolicyRules;
	}

	public void setAuthorizeSecurityPolicyRules(List<AuthorizeSecurityPolicyRule> authorizeSecurityPolicyRules) {
		this.authorizeSecurityPolicyRules = authorizeSecurityPolicyRules;	
		if (authorizeSecurityPolicyRules != null) {
			for (int depth1 = 0; depth1 < authorizeSecurityPolicyRules.size(); depth1++) {
				putQueryParameter("AuthorizeSecurityPolicyRule." + (depth1 + 1) + ".PortRange" , authorizeSecurityPolicyRules.get(depth1).getPortRange());
				putQueryParameter("AuthorizeSecurityPolicyRule." + (depth1 + 1) + ".IpProtocol" , authorizeSecurityPolicyRules.get(depth1).getIpProtocol());
				putQueryParameter("AuthorizeSecurityPolicyRule." + (depth1 + 1) + ".Description" , authorizeSecurityPolicyRules.get(depth1).getDescription());
				putQueryParameter("AuthorizeSecurityPolicyRule." + (depth1 + 1) + ".Type" , authorizeSecurityPolicyRules.get(depth1).getType());
				putQueryParameter("AuthorizeSecurityPolicyRule." + (depth1 + 1) + ".Priority" , authorizeSecurityPolicyRules.get(depth1).getPriority());
				putQueryParameter("AuthorizeSecurityPolicyRule." + (depth1 + 1) + ".CidrIp" , authorizeSecurityPolicyRules.get(depth1).getCidrIp());
				putQueryParameter("AuthorizeSecurityPolicyRule." + (depth1 + 1) + ".Policy" , authorizeSecurityPolicyRules.get(depth1).getPolicy());
			}
		}	
	}

	public String getWatermarkSecurity() {
		return this.watermarkSecurity;
	}

	public void setWatermarkSecurity(String watermarkSecurity) {
		this.watermarkSecurity = watermarkSecurity;
		if(watermarkSecurity != null){
			putQueryParameter("WatermarkSecurity", watermarkSecurity);
		}
	}

	public String getClipboard() {
		return this.clipboard;
	}

	public void setClipboard(String clipboard) {
		this.clipboard = clipboard;
		if(clipboard != null){
			putQueryParameter("Clipboard", clipboard);
		}
	}

	public String getEndUserApplyAdminCoordinate() {
		return this.endUserApplyAdminCoordinate;
	}

	public void setEndUserApplyAdminCoordinate(String endUserApplyAdminCoordinate) {
		this.endUserApplyAdminCoordinate = endUserApplyAdminCoordinate;
		if(endUserApplyAdminCoordinate != null){
			putQueryParameter("EndUserApplyAdminCoordinate", endUserApplyAdminCoordinate);
		}
	}

	public String getUsbRedirect() {
		return this.usbRedirect;
	}

	public void setUsbRedirect(String usbRedirect) {
		this.usbRedirect = usbRedirect;
		if(usbRedirect != null){
			putQueryParameter("UsbRedirect", usbRedirect);
		}
	}

	public String getRecordingStartTime() {
		return this.recordingStartTime;
	}

	public void setRecordingStartTime(String recordingStartTime) {
		this.recordingStartTime = recordingStartTime;
		if(recordingStartTime != null){
			putQueryParameter("RecordingStartTime", recordingStartTime);
		}
	}

	public Integer getWatermarkColor() {
		return this.watermarkColor;
	}

	public void setWatermarkColor(Integer watermarkColor) {
		this.watermarkColor = watermarkColor;
		if(watermarkColor != null){
			putQueryParameter("WatermarkColor", watermarkColor.toString());
		}
	}

	public String getWatermark() {
		return this.watermark;
	}

	public void setWatermark(String watermark) {
		this.watermark = watermark;
		if(watermark != null){
			putQueryParameter("Watermark", watermark);
		}
	}

	public List<DomainResolveRule> getDomainResolveRules() {
		return this.domainResolveRules;
	}

	public void setDomainResolveRules(List<DomainResolveRule> domainResolveRules) {
		this.domainResolveRules = domainResolveRules;	
		if (domainResolveRules != null) {
			for (int depth1 = 0; depth1 < domainResolveRules.size(); depth1++) {
				putQueryParameter("DomainResolveRule." + (depth1 + 1) + ".Domain" , domainResolveRules.get(depth1).getDomain());
				putQueryParameter("DomainResolveRule." + (depth1 + 1) + ".Description" , domainResolveRules.get(depth1).getDescription());
				putQueryParameter("DomainResolveRule." + (depth1 + 1) + ".Policy" , domainResolveRules.get(depth1).getPolicy());
			}
		}	
	}

	public String getWatermarkPower() {
		return this.watermarkPower;
	}

	public void setWatermarkPower(String watermarkPower) {
		this.watermarkPower = watermarkPower;
		if(watermarkPower != null){
			putQueryParameter("WatermarkPower", watermarkPower);
		}
	}

	public String getPolicyGroupId() {
		return this.policyGroupId;
	}

	public void setPolicyGroupId(String policyGroupId) {
		this.policyGroupId = policyGroupId;
		if(policyGroupId != null){
			putQueryParameter("PolicyGroupId", policyGroupId);
		}
	}

	public List<ClientType> getClientTypes() {
		return this.clientTypes;
	}

	public void setClientTypes(List<ClientType> clientTypes) {
		this.clientTypes = clientTypes;	
		if (clientTypes != null) {
			for (int depth1 = 0; depth1 < clientTypes.size(); depth1++) {
				putQueryParameter("ClientType." + (depth1 + 1) + ".ClientType" , clientTypes.get(depth1).getClientType());
				putQueryParameter("ClientType." + (depth1 + 1) + ".Status" , clientTypes.get(depth1).getStatus());
			}
		}	
	}

	public List<DeviceRedirects> getDeviceRedirectss() {
		return this.deviceRedirectss;
	}

	public void setDeviceRedirectss(List<DeviceRedirects> deviceRedirectss) {
		this.deviceRedirectss = deviceRedirectss;	
		if (deviceRedirectss != null) {
			for (int depth1 = 0; depth1 < deviceRedirectss.size(); depth1++) {
				putQueryParameter("DeviceRedirects." + (depth1 + 1) + ".RedirectType" , deviceRedirectss.get(depth1).getRedirectType());
				putQueryParameter("DeviceRedirects." + (depth1 + 1) + ".DeviceType" , deviceRedirectss.get(depth1).getDeviceType());
			}
		}	
	}

	public List<String> getScopeValues() {
		return this.scopeValues;
	}

	public void setScopeValues(List<String> scopeValues) {
		this.scopeValues = scopeValues;	
		if (scopeValues != null) {
			for (int i = 0; i < scopeValues.size(); i++) {
				putQueryParameter("ScopeValue." + (i + 1) , scopeValues.get(i));
			}
		}	
	}

	public Long getRecordingFps() {
		return this.recordingFps;
	}

	public void setRecordingFps(Long recordingFps) {
		this.recordingFps = recordingFps;
		if(recordingFps != null){
			putQueryParameter("RecordingFps", recordingFps.toString());
		}
	}

	public String getWatermarkFontStyle() {
		return this.watermarkFontStyle;
	}

	public void setWatermarkFontStyle(String watermarkFontStyle) {
		this.watermarkFontStyle = watermarkFontStyle;
		if(watermarkFontStyle != null){
			putQueryParameter("WatermarkFontStyle", watermarkFontStyle);
		}
	}

	public String getRecordingUserNotifyMessage() {
		return this.recordingUserNotifyMessage;
	}

	public void setRecordingUserNotifyMessage(String recordingUserNotifyMessage) {
		this.recordingUserNotifyMessage = recordingUserNotifyMessage;
		if(recordingUserNotifyMessage != null){
			putQueryParameter("RecordingUserNotifyMessage", recordingUserNotifyMessage);
		}
	}

	public String getEndUserGroupCoordinate() {
		return this.endUserGroupCoordinate;
	}

	public void setEndUserGroupCoordinate(String endUserGroupCoordinate) {
		this.endUserGroupCoordinate = endUserGroupCoordinate;
		if(endUserGroupCoordinate != null){
			putQueryParameter("EndUserGroupCoordinate", endUserGroupCoordinate);
		}
	}

	public Double getWatermarkDegree() {
		return this.watermarkDegree;
	}

	public void setWatermarkDegree(Double watermarkDegree) {
		this.watermarkDegree = watermarkDegree;
		if(watermarkDegree != null){
			putQueryParameter("WatermarkDegree", watermarkDegree.toString());
		}
	}

	public String getRemoteCoordinate() {
		return this.remoteCoordinate;
	}

	public void setRemoteCoordinate(String remoteCoordinate) {
		this.remoteCoordinate = remoteCoordinate;
		if(remoteCoordinate != null){
			putQueryParameter("RemoteCoordinate", remoteCoordinate);
		}
	}

	public String getGpuAcceleration() {
		return this.gpuAcceleration;
	}

	public void setGpuAcceleration(String gpuAcceleration) {
		this.gpuAcceleration = gpuAcceleration;
		if(gpuAcceleration != null){
			putQueryParameter("GpuAcceleration", gpuAcceleration);
		}
	}

	public String getHtml5FileTransfer() {
		return this.html5FileTransfer;
	}

	public void setHtml5FileTransfer(String html5FileTransfer) {
		this.html5FileTransfer = html5FileTransfer;
		if(html5FileTransfer != null){
			putQueryParameter("Html5FileTransfer", html5FileTransfer);
		}
	}

	public List<DeviceRules> getDeviceRuless() {
		return this.deviceRuless;
	}

	public void setDeviceRuless(List<DeviceRules> deviceRuless) {
		this.deviceRuless = deviceRuless;	
		if (deviceRuless != null) {
			for (int depth1 = 0; depth1 < deviceRuless.size(); depth1++) {
				putQueryParameter("DeviceRules." + (depth1 + 1) + ".DevicePid" , deviceRuless.get(depth1).getDevicePid());
				putQueryParameter("DeviceRules." + (depth1 + 1) + ".DeviceName" , deviceRuless.get(depth1).getDeviceName());
				putQueryParameter("DeviceRules." + (depth1 + 1) + ".DeviceVid" , deviceRuless.get(depth1).getDeviceVid());
				putQueryParameter("DeviceRules." + (depth1 + 1) + ".RedirectType" , deviceRuless.get(depth1).getRedirectType());
				putQueryParameter("DeviceRules." + (depth1 + 1) + ".DeviceType" , deviceRuless.get(depth1).getDeviceType());
				putQueryParameter("DeviceRules." + (depth1 + 1) + ".OptCommand" , deviceRuless.get(depth1).getOptCommand());
			}
		}	
	}

	public String getInternetCommunicationProtocol() {
		return this.internetCommunicationProtocol;
	}

	public void setInternetCommunicationProtocol(String internetCommunicationProtocol) {
		this.internetCommunicationProtocol = internetCommunicationProtocol;
		if(internetCommunicationProtocol != null){
			putQueryParameter("InternetCommunicationProtocol", internetCommunicationProtocol);
		}
	}

	public Long getRecordingExpires() {
		return this.recordingExpires;
	}

	public void setRecordingExpires(Long recordingExpires) {
		this.recordingExpires = recordingExpires;
		if(recordingExpires != null){
			putQueryParameter("RecordingExpires", recordingExpires.toString());
		}
	}

	public List<String> getPreemptLoginUsers() {
		return this.preemptLoginUsers;
	}

	public void setPreemptLoginUsers(List<String> preemptLoginUsers) {
		this.preemptLoginUsers = preemptLoginUsers;	
		if (preemptLoginUsers != null) {
			for (int i = 0; i < preemptLoginUsers.size(); i++) {
				putQueryParameter("PreemptLoginUser." + (i + 1) , preemptLoginUsers.get(i));
			}
		}	
	}

	public String getDomainList() {
		return this.domainList;
	}

	public void setDomainList(String domainList) {
		this.domainList = domainList;
		if(domainList != null){
			putQueryParameter("DomainList", domainList);
		}
	}

	public String getNetRedirect() {
		return this.netRedirect;
	}

	public void setNetRedirect(String netRedirect) {
		this.netRedirect = netRedirect;
		if(netRedirect != null){
			putQueryParameter("NetRedirect", netRedirect);
		}
	}

	public Integer getWatermarkTransparencyValue() {
		return this.watermarkTransparencyValue;
	}

	public void setWatermarkTransparencyValue(Integer watermarkTransparencyValue) {
		this.watermarkTransparencyValue = watermarkTransparencyValue;
		if(watermarkTransparencyValue != null){
			putQueryParameter("WatermarkTransparencyValue", watermarkTransparencyValue.toString());
		}
	}

	public String getWatermarkType() {
		return this.watermarkType;
	}

	public void setWatermarkType(String watermarkType) {
		this.watermarkType = watermarkType;
		if(watermarkType != null){
			putQueryParameter("WatermarkType", watermarkType);
		}
	}

	public String getAdminAccess() {
		return this.adminAccess;
	}

	public void setAdminAccess(String adminAccess) {
		this.adminAccess = adminAccess;
		if(adminAccess != null){
			putQueryParameter("AdminAccess", adminAccess);
		}
	}

	public Integer getRecordingDuration() {
		return this.recordingDuration;
	}

	public void setRecordingDuration(Integer recordingDuration) {
		this.recordingDuration = recordingDuration;
		if(recordingDuration != null){
			putQueryParameter("RecordingDuration", recordingDuration.toString());
		}
	}

	public List<RevokeAccessPolicyRule> getRevokeAccessPolicyRules() {
		return this.revokeAccessPolicyRules;
	}

	public void setRevokeAccessPolicyRules(List<RevokeAccessPolicyRule> revokeAccessPolicyRules) {
		this.revokeAccessPolicyRules = revokeAccessPolicyRules;	
		if (revokeAccessPolicyRules != null) {
			for (int depth1 = 0; depth1 < revokeAccessPolicyRules.size(); depth1++) {
				putQueryParameter("RevokeAccessPolicyRule." + (depth1 + 1) + ".Description" , revokeAccessPolicyRules.get(depth1).getDescription());
				putQueryParameter("RevokeAccessPolicyRule." + (depth1 + 1) + ".CidrIp" , revokeAccessPolicyRules.get(depth1).getCidrIp());
			}
		}	
	}

	public String getCameraRedirect() {
		return this.cameraRedirect;
	}

	public void setCameraRedirect(String cameraRedirect) {
		this.cameraRedirect = cameraRedirect;
		if(cameraRedirect != null){
			putQueryParameter("CameraRedirect", cameraRedirect);
		}
	}

	public String getVideoRedirect() {
		return this.videoRedirect;
	}

	public void setVideoRedirect(String videoRedirect) {
		this.videoRedirect = videoRedirect;
		if(videoRedirect != null){
			putQueryParameter("VideoRedirect", videoRedirect);
		}
	}

	public String getAppContentProtection() {
		return this.appContentProtection;
	}

	public void setAppContentProtection(String appContentProtection) {
		this.appContentProtection = appContentProtection;
		if(appContentProtection != null){
			putQueryParameter("AppContentProtection", appContentProtection);
		}
	}

	public List<AuthorizeAccessPolicyRule> getAuthorizeAccessPolicyRules() {
		return this.authorizeAccessPolicyRules;
	}

	public void setAuthorizeAccessPolicyRules(List<AuthorizeAccessPolicyRule> authorizeAccessPolicyRules) {
		this.authorizeAccessPolicyRules = authorizeAccessPolicyRules;	
		if (authorizeAccessPolicyRules != null) {
			for (int depth1 = 0; depth1 < authorizeAccessPolicyRules.size(); depth1++) {
				putQueryParameter("AuthorizeAccessPolicyRule." + (depth1 + 1) + ".Description" , authorizeAccessPolicyRules.get(depth1).getDescription());
				putQueryParameter("AuthorizeAccessPolicyRule." + (depth1 + 1) + ".CidrIp" , authorizeAccessPolicyRules.get(depth1).getCidrIp());
			}
		}	
	}

	public Integer getMaxReconnectTime() {
		return this.maxReconnectTime;
	}

	public void setMaxReconnectTime(Integer maxReconnectTime) {
		this.maxReconnectTime = maxReconnectTime;
		if(maxReconnectTime != null){
			putQueryParameter("MaxReconnectTime", maxReconnectTime.toString());
		}
	}

	public String getWatermarkTransparency() {
		return this.watermarkTransparency;
	}

	public void setWatermarkTransparency(String watermarkTransparency) {
		this.watermarkTransparency = watermarkTransparency;
		if(watermarkTransparency != null){
			putQueryParameter("WatermarkTransparency", watermarkTransparency);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getPreemptLogin() {
		return this.preemptLogin;
	}

	public void setPreemptLogin(String preemptLogin) {
		this.preemptLogin = preemptLogin;
		if(preemptLogin != null){
			putQueryParameter("PreemptLogin", preemptLogin);
		}
	}

	public List<UsbSupplyRedirectRule> getUsbSupplyRedirectRules() {
		return this.usbSupplyRedirectRules;
	}

	public void setUsbSupplyRedirectRules(List<UsbSupplyRedirectRule> usbSupplyRedirectRules) {
		this.usbSupplyRedirectRules = usbSupplyRedirectRules;	
		if (usbSupplyRedirectRules != null) {
			for (int depth1 = 0; depth1 < usbSupplyRedirectRules.size(); depth1++) {
				putQueryParameter("UsbSupplyRedirectRule." + (depth1 + 1) + ".ProductId" , usbSupplyRedirectRules.get(depth1).getProductId());
				putQueryParameter("UsbSupplyRedirectRule." + (depth1 + 1) + ".DeviceSubclass" , usbSupplyRedirectRules.get(depth1).getDeviceSubclass());
				putQueryParameter("UsbSupplyRedirectRule." + (depth1 + 1) + ".UsbRedirectType" , usbSupplyRedirectRules.get(depth1).getUsbRedirectType());
				putQueryParameter("UsbSupplyRedirectRule." + (depth1 + 1) + ".VendorId" , usbSupplyRedirectRules.get(depth1).getVendorId());
				putQueryParameter("UsbSupplyRedirectRule." + (depth1 + 1) + ".Description" , usbSupplyRedirectRules.get(depth1).getDescription());
				putQueryParameter("UsbSupplyRedirectRule." + (depth1 + 1) + ".DeviceClass" , usbSupplyRedirectRules.get(depth1).getDeviceClass());
				putQueryParameter("UsbSupplyRedirectRule." + (depth1 + 1) + ".UsbRuleType" , usbSupplyRedirectRules.get(depth1).getUsbRuleType());
			}
		}	
	}

	public Integer getWatermarkFontSize() {
		return this.watermarkFontSize;
	}

	public void setWatermarkFontSize(Integer watermarkFontSize) {
		this.watermarkFontSize = watermarkFontSize;
		if(watermarkFontSize != null){
			putQueryParameter("WatermarkFontSize", watermarkFontSize.toString());
		}
	}

	public String getWatermarkAntiCam() {
		return this.watermarkAntiCam;
	}

	public void setWatermarkAntiCam(String watermarkAntiCam) {
		this.watermarkAntiCam = watermarkAntiCam;
		if(watermarkAntiCam != null){
			putQueryParameter("WatermarkAntiCam", watermarkAntiCam);
		}
	}

	public String getRecording() {
		return this.recording;
	}

	public void setRecording(String recording) {
		this.recording = recording;
		if(recording != null){
			putQueryParameter("Recording", recording);
		}
	}

	public String getDomainResolveRuleType() {
		return this.domainResolveRuleType;
	}

	public void setDomainResolveRuleType(String domainResolveRuleType) {
		this.domainResolveRuleType = domainResolveRuleType;
		if(domainResolveRuleType != null){
			putQueryParameter("DomainResolveRuleType", domainResolveRuleType);
		}
	}

	public String getRecordContent() {
		return this.recordContent;
	}

	public void setRecordContent(String recordContent) {
		this.recordContent = recordContent;
		if(recordContent != null){
			putQueryParameter("RecordContent", recordContent);
		}
	}

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
		if(scope != null){
			putQueryParameter("Scope", scope);
		}
	}

	public Integer getWatermarkRowAmount() {
		return this.watermarkRowAmount;
	}

	public void setWatermarkRowAmount(Integer watermarkRowAmount) {
		this.watermarkRowAmount = watermarkRowAmount;
		if(watermarkRowAmount != null){
			putQueryParameter("WatermarkRowAmount", watermarkRowAmount.toString());
		}
	}

	public Long getRecordContentExpires() {
		return this.recordContentExpires;
	}

	public void setRecordContentExpires(Long recordContentExpires) {
		this.recordContentExpires = recordContentExpires;
		if(recordContentExpires != null){
			putQueryParameter("RecordContentExpires", recordContentExpires.toString());
		}
	}

	public String getRecordingAudio() {
		return this.recordingAudio;
	}

	public void setRecordingAudio(String recordingAudio) {
		this.recordingAudio = recordingAudio;
		if(recordingAudio != null){
			putQueryParameter("RecordingAudio", recordingAudio);
		}
	}

	public String getHtml5Access() {
		return this.html5Access;
	}

	public void setHtml5Access(String html5Access) {
		this.html5Access = html5Access;
		if(html5Access != null){
			putQueryParameter("Html5Access", html5Access);
		}
	}

	public String getVisualQuality() {
		return this.visualQuality;
	}

	public void setVisualQuality(String visualQuality) {
		this.visualQuality = visualQuality;
		if(visualQuality != null){
			putQueryParameter("VisualQuality", visualQuality);
		}
	}

	public String getRecordingEndTime() {
		return this.recordingEndTime;
	}

	public void setRecordingEndTime(String recordingEndTime) {
		this.recordingEndTime = recordingEndTime;
		if(recordingEndTime != null){
			putQueryParameter("RecordingEndTime", recordingEndTime);
		}
	}

	public String getRecordingUserNotify() {
		return this.recordingUserNotify;
	}

	public void setRecordingUserNotify(String recordingUserNotify) {
		this.recordingUserNotify = recordingUserNotify;
		if(recordingUserNotify != null){
			putQueryParameter("RecordingUserNotify", recordingUserNotify);
		}
	}

	public static class RevokeSecurityPolicyRule {

		private String portRange;

		private String ipProtocol;

		private String description;

		private String type;

		private String priority;

		private String cidrIp;

		private String policy;

		public String getPortRange() {
			return this.portRange;
		}

		public void setPortRange(String portRange) {
			this.portRange = portRange;
		}

		public String getIpProtocol() {
			return this.ipProtocol;
		}

		public void setIpProtocol(String ipProtocol) {
			this.ipProtocol = ipProtocol;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getPriority() {
			return this.priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

		public String getCidrIp() {
			return this.cidrIp;
		}

		public void setCidrIp(String cidrIp) {
			this.cidrIp = cidrIp;
		}

		public String getPolicy() {
			return this.policy;
		}

		public void setPolicy(String policy) {
			this.policy = policy;
		}
	}

	public static class AuthorizeSecurityPolicyRule {

		private String portRange;

		private String ipProtocol;

		private String description;

		private String type;

		private String priority;

		private String cidrIp;

		private String policy;

		public String getPortRange() {
			return this.portRange;
		}

		public void setPortRange(String portRange) {
			this.portRange = portRange;
		}

		public String getIpProtocol() {
			return this.ipProtocol;
		}

		public void setIpProtocol(String ipProtocol) {
			this.ipProtocol = ipProtocol;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getPriority() {
			return this.priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

		public String getCidrIp() {
			return this.cidrIp;
		}

		public void setCidrIp(String cidrIp) {
			this.cidrIp = cidrIp;
		}

		public String getPolicy() {
			return this.policy;
		}

		public void setPolicy(String policy) {
			this.policy = policy;
		}
	}

	public static class DomainResolveRule {

		private String domain;

		private String description;

		private String policy;

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getPolicy() {
			return this.policy;
		}

		public void setPolicy(String policy) {
			this.policy = policy;
		}
	}

	public static class ClientType {

		private String clientType;

		private String status;

		public String getClientType() {
			return this.clientType;
		}

		public void setClientType(String clientType) {
			this.clientType = clientType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	public static class DeviceRedirects {

		private String redirectType;

		private String deviceType;

		public String getRedirectType() {
			return this.redirectType;
		}

		public void setRedirectType(String redirectType) {
			this.redirectType = redirectType;
		}

		public String getDeviceType() {
			return this.deviceType;
		}

		public void setDeviceType(String deviceType) {
			this.deviceType = deviceType;
		}
	}

	public static class DeviceRules {

		private String devicePid;

		private String deviceName;

		private String deviceVid;

		private String redirectType;

		private String deviceType;

		private String optCommand;

		public String getDevicePid() {
			return this.devicePid;
		}

		public void setDevicePid(String devicePid) {
			this.devicePid = devicePid;
		}

		public String getDeviceName() {
			return this.deviceName;
		}

		public void setDeviceName(String deviceName) {
			this.deviceName = deviceName;
		}

		public String getDeviceVid() {
			return this.deviceVid;
		}

		public void setDeviceVid(String deviceVid) {
			this.deviceVid = deviceVid;
		}

		public String getRedirectType() {
			return this.redirectType;
		}

		public void setRedirectType(String redirectType) {
			this.redirectType = redirectType;
		}

		public String getDeviceType() {
			return this.deviceType;
		}

		public void setDeviceType(String deviceType) {
			this.deviceType = deviceType;
		}

		public String getOptCommand() {
			return this.optCommand;
		}

		public void setOptCommand(String optCommand) {
			this.optCommand = optCommand;
		}
	}

	public static class RevokeAccessPolicyRule {

		private String description;

		private String cidrIp;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCidrIp() {
			return this.cidrIp;
		}

		public void setCidrIp(String cidrIp) {
			this.cidrIp = cidrIp;
		}
	}

	public static class AuthorizeAccessPolicyRule {

		private String description;

		private String cidrIp;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCidrIp() {
			return this.cidrIp;
		}

		public void setCidrIp(String cidrIp) {
			this.cidrIp = cidrIp;
		}
	}

	public static class UsbSupplyRedirectRule {

		private String productId;

		private String deviceSubclass;

		private Long usbRedirectType;

		private String vendorId;

		private String description;

		private String deviceClass;

		private Long usbRuleType;

		public String getProductId() {
			return this.productId;
		}

		public void setProductId(String productId) {
			this.productId = productId;
		}

		public String getDeviceSubclass() {
			return this.deviceSubclass;
		}

		public void setDeviceSubclass(String deviceSubclass) {
			this.deviceSubclass = deviceSubclass;
		}

		public Long getUsbRedirectType() {
			return this.usbRedirectType;
		}

		public void setUsbRedirectType(Long usbRedirectType) {
			this.usbRedirectType = usbRedirectType;
		}

		public String getVendorId() {
			return this.vendorId;
		}

		public void setVendorId(String vendorId) {
			this.vendorId = vendorId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDeviceClass() {
			return this.deviceClass;
		}

		public void setDeviceClass(String deviceClass) {
			this.deviceClass = deviceClass;
		}

		public Long getUsbRuleType() {
			return this.usbRuleType;
		}

		public void setUsbRuleType(Long usbRuleType) {
			this.usbRuleType = usbRuleType;
		}
	}

	@Override
	public Class<ModifyPolicyGroupResponse> getResponseClass() {
		return ModifyPolicyGroupResponse.class;
	}

}
