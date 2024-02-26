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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribePolicyGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePolicyGroupsResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<DescribePolicyGroup> describePolicyGroups;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DescribePolicyGroup> getDescribePolicyGroups() {
		return this.describePolicyGroups;
	}

	public void setDescribePolicyGroups(List<DescribePolicyGroup> describePolicyGroups) {
		this.describePolicyGroups = describePolicyGroups;
	}

	public static class DescribePolicyGroup {

		private String policyStatus;

		private String html5Access;

		private String watermarkType;

		private String preemptLogin;

		private String watermarkCustomText;

		private String clipboard;

		private String domainList;

		private String policyGroupId;

		private String printerRedirection;

		private String watermarkTransparency;

		private String html5FileTransfer;

		private String usbRedirect;

		private String policyGroupType;

		private String watermark;

		private String visualQuality;

		private Integer edsCount;

		private String name;

		private String localDrive;

		private String gpuAcceleration;

		private String domainResolveRuleType;

		private String recording;

		private String recordingStartTime;

		private String recordingEndTime;

		private Long recordingFps;

		private Long recordingExpires;

		private String cameraRedirect;

		private String netRedirect;

		private String appContentProtection;

		private String recordContent;

		private Long recordContentExpires;

		private String remoteCoordinate;

		private Integer recordingDuration;

		private String scope;

		private String recordingAudio;

		private String internetCommunicationProtocol;

		private String videoRedirect;

		private Integer watermarkTransparencyValue;

		private Integer watermarkColor;

		private Integer watermarkFontSize;

		private String watermarkFontStyle;

		private Double watermarkDegree;

		private Integer watermarkRowAmount;

		private String endUserApplyAdminCoordinate;

		private String endUserGroupCoordinate;

		private String cpuProtectedMode;

		private Integer cpuRateLimit;

		private Integer cpuSampleDuration;

		private Integer cpuSingleRateLimit;

		private Integer cpuDownGradeDuration;

		private String memoryProtectedMode;

		private Integer memoryRateLimit;

		private Integer memorySampleDuration;

		private Integer memorySingleRateLimit;

		private Integer memoryDownGradeDuration;

		private String watermarkSecurity;

		private String watermarkAntiCam;

		private String cloudHub;

		private String watermarkPower;

		private String recordingUserNotify;

		private String recordingUserNotifyMessage;

		private String adminAccess;

		private List<AuthorizeSecurityPolicyRule> authorizeSecurityPolicyRules;

		private List<AuthorizeAccessPolicyRule> authorizeAccessPolicyRules;

		private List<ClientType> clientTypes;

		private List<UsbSupplyRedirectRuleItem> usbSupplyRedirectRule;

		private List<DomainResolveRuleItem> domainResolveRule;

		private List<NetRedirectRuleItem> netRedirectRule;

		private List<String> preemptLoginUsers;

		private List<String> scopeValue;

		private List<String> cpuProcessors;

		private List<String> memoryProcessors;

		public String getPolicyStatus() {
			return this.policyStatus;
		}

		public void setPolicyStatus(String policyStatus) {
			this.policyStatus = policyStatus;
		}

		public String getHtml5Access() {
			return this.html5Access;
		}

		public void setHtml5Access(String html5Access) {
			this.html5Access = html5Access;
		}

		public String getWatermarkType() {
			return this.watermarkType;
		}

		public void setWatermarkType(String watermarkType) {
			this.watermarkType = watermarkType;
		}

		public String getPreemptLogin() {
			return this.preemptLogin;
		}

		public void setPreemptLogin(String preemptLogin) {
			this.preemptLogin = preemptLogin;
		}

		public String getWatermarkCustomText() {
			return this.watermarkCustomText;
		}

		public void setWatermarkCustomText(String watermarkCustomText) {
			this.watermarkCustomText = watermarkCustomText;
		}

		public String getClipboard() {
			return this.clipboard;
		}

		public void setClipboard(String clipboard) {
			this.clipboard = clipboard;
		}

		public String getDomainList() {
			return this.domainList;
		}

		public void setDomainList(String domainList) {
			this.domainList = domainList;
		}

		public String getPolicyGroupId() {
			return this.policyGroupId;
		}

		public void setPolicyGroupId(String policyGroupId) {
			this.policyGroupId = policyGroupId;
		}

		public String getPrinterRedirection() {
			return this.printerRedirection;
		}

		public void setPrinterRedirection(String printerRedirection) {
			this.printerRedirection = printerRedirection;
		}

		public String getWatermarkTransparency() {
			return this.watermarkTransparency;
		}

		public void setWatermarkTransparency(String watermarkTransparency) {
			this.watermarkTransparency = watermarkTransparency;
		}

		public String getHtml5FileTransfer() {
			return this.html5FileTransfer;
		}

		public void setHtml5FileTransfer(String html5FileTransfer) {
			this.html5FileTransfer = html5FileTransfer;
		}

		public String getUsbRedirect() {
			return this.usbRedirect;
		}

		public void setUsbRedirect(String usbRedirect) {
			this.usbRedirect = usbRedirect;
		}

		public String getPolicyGroupType() {
			return this.policyGroupType;
		}

		public void setPolicyGroupType(String policyGroupType) {
			this.policyGroupType = policyGroupType;
		}

		public String getWatermark() {
			return this.watermark;
		}

		public void setWatermark(String watermark) {
			this.watermark = watermark;
		}

		public String getVisualQuality() {
			return this.visualQuality;
		}

		public void setVisualQuality(String visualQuality) {
			this.visualQuality = visualQuality;
		}

		public Integer getEdsCount() {
			return this.edsCount;
		}

		public void setEdsCount(Integer edsCount) {
			this.edsCount = edsCount;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLocalDrive() {
			return this.localDrive;
		}

		public void setLocalDrive(String localDrive) {
			this.localDrive = localDrive;
		}

		public String getGpuAcceleration() {
			return this.gpuAcceleration;
		}

		public void setGpuAcceleration(String gpuAcceleration) {
			this.gpuAcceleration = gpuAcceleration;
		}

		public String getDomainResolveRuleType() {
			return this.domainResolveRuleType;
		}

		public void setDomainResolveRuleType(String domainResolveRuleType) {
			this.domainResolveRuleType = domainResolveRuleType;
		}

		public String getRecording() {
			return this.recording;
		}

		public void setRecording(String recording) {
			this.recording = recording;
		}

		public String getRecordingStartTime() {
			return this.recordingStartTime;
		}

		public void setRecordingStartTime(String recordingStartTime) {
			this.recordingStartTime = recordingStartTime;
		}

		public String getRecordingEndTime() {
			return this.recordingEndTime;
		}

		public void setRecordingEndTime(String recordingEndTime) {
			this.recordingEndTime = recordingEndTime;
		}

		public Long getRecordingFps() {
			return this.recordingFps;
		}

		public void setRecordingFps(Long recordingFps) {
			this.recordingFps = recordingFps;
		}

		public Long getRecordingExpires() {
			return this.recordingExpires;
		}

		public void setRecordingExpires(Long recordingExpires) {
			this.recordingExpires = recordingExpires;
		}

		public String getCameraRedirect() {
			return this.cameraRedirect;
		}

		public void setCameraRedirect(String cameraRedirect) {
			this.cameraRedirect = cameraRedirect;
		}

		public String getNetRedirect() {
			return this.netRedirect;
		}

		public void setNetRedirect(String netRedirect) {
			this.netRedirect = netRedirect;
		}

		public String getAppContentProtection() {
			return this.appContentProtection;
		}

		public void setAppContentProtection(String appContentProtection) {
			this.appContentProtection = appContentProtection;
		}

		public String getRecordContent() {
			return this.recordContent;
		}

		public void setRecordContent(String recordContent) {
			this.recordContent = recordContent;
		}

		public Long getRecordContentExpires() {
			return this.recordContentExpires;
		}

		public void setRecordContentExpires(Long recordContentExpires) {
			this.recordContentExpires = recordContentExpires;
		}

		public String getRemoteCoordinate() {
			return this.remoteCoordinate;
		}

		public void setRemoteCoordinate(String remoteCoordinate) {
			this.remoteCoordinate = remoteCoordinate;
		}

		public Integer getRecordingDuration() {
			return this.recordingDuration;
		}

		public void setRecordingDuration(Integer recordingDuration) {
			this.recordingDuration = recordingDuration;
		}

		public String getScope() {
			return this.scope;
		}

		public void setScope(String scope) {
			this.scope = scope;
		}

		public String getRecordingAudio() {
			return this.recordingAudio;
		}

		public void setRecordingAudio(String recordingAudio) {
			this.recordingAudio = recordingAudio;
		}

		public String getInternetCommunicationProtocol() {
			return this.internetCommunicationProtocol;
		}

		public void setInternetCommunicationProtocol(String internetCommunicationProtocol) {
			this.internetCommunicationProtocol = internetCommunicationProtocol;
		}

		public String getVideoRedirect() {
			return this.videoRedirect;
		}

		public void setVideoRedirect(String videoRedirect) {
			this.videoRedirect = videoRedirect;
		}

		public Integer getWatermarkTransparencyValue() {
			return this.watermarkTransparencyValue;
		}

		public void setWatermarkTransparencyValue(Integer watermarkTransparencyValue) {
			this.watermarkTransparencyValue = watermarkTransparencyValue;
		}

		public Integer getWatermarkColor() {
			return this.watermarkColor;
		}

		public void setWatermarkColor(Integer watermarkColor) {
			this.watermarkColor = watermarkColor;
		}

		public Integer getWatermarkFontSize() {
			return this.watermarkFontSize;
		}

		public void setWatermarkFontSize(Integer watermarkFontSize) {
			this.watermarkFontSize = watermarkFontSize;
		}

		public String getWatermarkFontStyle() {
			return this.watermarkFontStyle;
		}

		public void setWatermarkFontStyle(String watermarkFontStyle) {
			this.watermarkFontStyle = watermarkFontStyle;
		}

		public Double getWatermarkDegree() {
			return this.watermarkDegree;
		}

		public void setWatermarkDegree(Double watermarkDegree) {
			this.watermarkDegree = watermarkDegree;
		}

		public Integer getWatermarkRowAmount() {
			return this.watermarkRowAmount;
		}

		public void setWatermarkRowAmount(Integer watermarkRowAmount) {
			this.watermarkRowAmount = watermarkRowAmount;
		}

		public String getEndUserApplyAdminCoordinate() {
			return this.endUserApplyAdminCoordinate;
		}

		public void setEndUserApplyAdminCoordinate(String endUserApplyAdminCoordinate) {
			this.endUserApplyAdminCoordinate = endUserApplyAdminCoordinate;
		}

		public String getEndUserGroupCoordinate() {
			return this.endUserGroupCoordinate;
		}

		public void setEndUserGroupCoordinate(String endUserGroupCoordinate) {
			this.endUserGroupCoordinate = endUserGroupCoordinate;
		}

		public String getCpuProtectedMode() {
			return this.cpuProtectedMode;
		}

		public void setCpuProtectedMode(String cpuProtectedMode) {
			this.cpuProtectedMode = cpuProtectedMode;
		}

		public Integer getCpuRateLimit() {
			return this.cpuRateLimit;
		}

		public void setCpuRateLimit(Integer cpuRateLimit) {
			this.cpuRateLimit = cpuRateLimit;
		}

		public Integer getCpuSampleDuration() {
			return this.cpuSampleDuration;
		}

		public void setCpuSampleDuration(Integer cpuSampleDuration) {
			this.cpuSampleDuration = cpuSampleDuration;
		}

		public Integer getCpuSingleRateLimit() {
			return this.cpuSingleRateLimit;
		}

		public void setCpuSingleRateLimit(Integer cpuSingleRateLimit) {
			this.cpuSingleRateLimit = cpuSingleRateLimit;
		}

		public Integer getCpuDownGradeDuration() {
			return this.cpuDownGradeDuration;
		}

		public void setCpuDownGradeDuration(Integer cpuDownGradeDuration) {
			this.cpuDownGradeDuration = cpuDownGradeDuration;
		}

		public String getMemoryProtectedMode() {
			return this.memoryProtectedMode;
		}

		public void setMemoryProtectedMode(String memoryProtectedMode) {
			this.memoryProtectedMode = memoryProtectedMode;
		}

		public Integer getMemoryRateLimit() {
			return this.memoryRateLimit;
		}

		public void setMemoryRateLimit(Integer memoryRateLimit) {
			this.memoryRateLimit = memoryRateLimit;
		}

		public Integer getMemorySampleDuration() {
			return this.memorySampleDuration;
		}

		public void setMemorySampleDuration(Integer memorySampleDuration) {
			this.memorySampleDuration = memorySampleDuration;
		}

		public Integer getMemorySingleRateLimit() {
			return this.memorySingleRateLimit;
		}

		public void setMemorySingleRateLimit(Integer memorySingleRateLimit) {
			this.memorySingleRateLimit = memorySingleRateLimit;
		}

		public Integer getMemoryDownGradeDuration() {
			return this.memoryDownGradeDuration;
		}

		public void setMemoryDownGradeDuration(Integer memoryDownGradeDuration) {
			this.memoryDownGradeDuration = memoryDownGradeDuration;
		}

		public String getWatermarkSecurity() {
			return this.watermarkSecurity;
		}

		public void setWatermarkSecurity(String watermarkSecurity) {
			this.watermarkSecurity = watermarkSecurity;
		}

		public String getWatermarkAntiCam() {
			return this.watermarkAntiCam;
		}

		public void setWatermarkAntiCam(String watermarkAntiCam) {
			this.watermarkAntiCam = watermarkAntiCam;
		}

		public String getCloudHub() {
			return this.cloudHub;
		}

		public void setCloudHub(String cloudHub) {
			this.cloudHub = cloudHub;
		}

		public String getWatermarkPower() {
			return this.watermarkPower;
		}

		public void setWatermarkPower(String watermarkPower) {
			this.watermarkPower = watermarkPower;
		}

		public String getRecordingUserNotify() {
			return this.recordingUserNotify;
		}

		public void setRecordingUserNotify(String recordingUserNotify) {
			this.recordingUserNotify = recordingUserNotify;
		}

		public String getRecordingUserNotifyMessage() {
			return this.recordingUserNotifyMessage;
		}

		public void setRecordingUserNotifyMessage(String recordingUserNotifyMessage) {
			this.recordingUserNotifyMessage = recordingUserNotifyMessage;
		}

		public String getAdminAccess() {
			return this.adminAccess;
		}

		public void setAdminAccess(String adminAccess) {
			this.adminAccess = adminAccess;
		}

		public List<AuthorizeSecurityPolicyRule> getAuthorizeSecurityPolicyRules() {
			return this.authorizeSecurityPolicyRules;
		}

		public void setAuthorizeSecurityPolicyRules(List<AuthorizeSecurityPolicyRule> authorizeSecurityPolicyRules) {
			this.authorizeSecurityPolicyRules = authorizeSecurityPolicyRules;
		}

		public List<AuthorizeAccessPolicyRule> getAuthorizeAccessPolicyRules() {
			return this.authorizeAccessPolicyRules;
		}

		public void setAuthorizeAccessPolicyRules(List<AuthorizeAccessPolicyRule> authorizeAccessPolicyRules) {
			this.authorizeAccessPolicyRules = authorizeAccessPolicyRules;
		}

		public List<ClientType> getClientTypes() {
			return this.clientTypes;
		}

		public void setClientTypes(List<ClientType> clientTypes) {
			this.clientTypes = clientTypes;
		}

		public List<UsbSupplyRedirectRuleItem> getUsbSupplyRedirectRule() {
			return this.usbSupplyRedirectRule;
		}

		public void setUsbSupplyRedirectRule(List<UsbSupplyRedirectRuleItem> usbSupplyRedirectRule) {
			this.usbSupplyRedirectRule = usbSupplyRedirectRule;
		}

		public List<DomainResolveRuleItem> getDomainResolveRule() {
			return this.domainResolveRule;
		}

		public void setDomainResolveRule(List<DomainResolveRuleItem> domainResolveRule) {
			this.domainResolveRule = domainResolveRule;
		}

		public List<NetRedirectRuleItem> getNetRedirectRule() {
			return this.netRedirectRule;
		}

		public void setNetRedirectRule(List<NetRedirectRuleItem> netRedirectRule) {
			this.netRedirectRule = netRedirectRule;
		}

		public List<String> getPreemptLoginUsers() {
			return this.preemptLoginUsers;
		}

		public void setPreemptLoginUsers(List<String> preemptLoginUsers) {
			this.preemptLoginUsers = preemptLoginUsers;
		}

		public List<String> getScopeValue() {
			return this.scopeValue;
		}

		public void setScopeValue(List<String> scopeValue) {
			this.scopeValue = scopeValue;
		}

		public List<String> getCpuProcessors() {
			return this.cpuProcessors;
		}

		public void setCpuProcessors(List<String> cpuProcessors) {
			this.cpuProcessors = cpuProcessors;
		}

		public List<String> getMemoryProcessors() {
			return this.memoryProcessors;
		}

		public void setMemoryProcessors(List<String> memoryProcessors) {
			this.memoryProcessors = memoryProcessors;
		}

		public static class AuthorizeSecurityPolicyRule {

			private String type;

			private String policy;

			private String description;

			private String portRange;

			private String ipProtocol;

			private String priority;

			private String cidrIp;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getPolicy() {
				return this.policy;
			}

			public void setPolicy(String policy) {
				this.policy = policy;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

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

		public static class ClientType {

			private String status;

			private String clientType;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getClientType() {
				return this.clientType;
			}

			public void setClientType(String clientType) {
				this.clientType = clientType;
			}
		}

		public static class UsbSupplyRedirectRuleItem {

			private String vendorId;

			private String productId;

			private String description;

			private Long usbRedirectType;

			private String deviceClass;

			private String deviceSubclass;

			private Long usbRuleType;

			public String getVendorId() {
				return this.vendorId;
			}

			public void setVendorId(String vendorId) {
				this.vendorId = vendorId;
			}

			public String getProductId() {
				return this.productId;
			}

			public void setProductId(String productId) {
				this.productId = productId;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Long getUsbRedirectType() {
				return this.usbRedirectType;
			}

			public void setUsbRedirectType(Long usbRedirectType) {
				this.usbRedirectType = usbRedirectType;
			}

			public String getDeviceClass() {
				return this.deviceClass;
			}

			public void setDeviceClass(String deviceClass) {
				this.deviceClass = deviceClass;
			}

			public String getDeviceSubclass() {
				return this.deviceSubclass;
			}

			public void setDeviceSubclass(String deviceSubclass) {
				this.deviceSubclass = deviceSubclass;
			}

			public Long getUsbRuleType() {
				return this.usbRuleType;
			}

			public void setUsbRuleType(Long usbRuleType) {
				this.usbRuleType = usbRuleType;
			}
		}

		public static class DomainResolveRuleItem {

			private String domain;

			private String policy;

			private String description;

			public String getDomain() {
				return this.domain;
			}

			public void setDomain(String domain) {
				this.domain = domain;
			}

			public String getPolicy() {
				return this.policy;
			}

			public void setPolicy(String policy) {
				this.policy = policy;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}
		}

		public static class NetRedirectRuleItem {

			private String domain;

			private String ruleType;

			private String policy;

			public String getDomain() {
				return this.domain;
			}

			public void setDomain(String domain) {
				this.domain = domain;
			}

			public String getRuleType() {
				return this.ruleType;
			}

			public void setRuleType(String ruleType) {
				this.ruleType = ruleType;
			}

			public String getPolicy() {
				return this.policy;
			}

			public void setPolicy(String policy) {
				this.policy = policy;
			}
		}
	}

	@Override
	public DescribePolicyGroupsResponse getInstance(UnmarshallerContext context) {
		return	DescribePolicyGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
