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
public class CreateDesktopsRequest extends RpcAcsRequest<CreateDesktopsResponse> {
	   

	private String volumeEncryptionKey;

	private String officeSiteId;

	private String bundleId;

	private String userAssignMode;

	private String hostname;

	private List<DesktopTimers> desktopTimerss;

	private Boolean desktopNameSuffix;

	private String directoryId;

	private List<String> endUserIds;

	private List<Tag> tags;

	private List<BundleModels> bundleModelss;

	private Boolean volumeEncryptionEnabled;

	private String desktopName;

	private Integer amount;

	private Integer period;

	private Boolean autoPay;

	private List<UserCommands> userCommandss;

	private String groupId;

	private String promotionId;

	private String periodUnit;

	private Boolean autoRenew;

	private String vpcId;

	private String chargeType;

	private String policyGroupId;

	private String userName;
	public CreateDesktopsRequest() {
		super("ecd", "2020-09-30", "CreateDesktops");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getVolumeEncryptionKey() {
		return this.volumeEncryptionKey;
	}

	public void setVolumeEncryptionKey(String volumeEncryptionKey) {
		this.volumeEncryptionKey = volumeEncryptionKey;
		if(volumeEncryptionKey != null){
			putQueryParameter("VolumeEncryptionKey", volumeEncryptionKey);
		}
	}

	public String getOfficeSiteId() {
		return this.officeSiteId;
	}

	public void setOfficeSiteId(String officeSiteId) {
		this.officeSiteId = officeSiteId;
		if(officeSiteId != null){
			putQueryParameter("OfficeSiteId", officeSiteId);
		}
	}

	public String getBundleId() {
		return this.bundleId;
	}

	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
		if(bundleId != null){
			putQueryParameter("BundleId", bundleId);
		}
	}

	public String getUserAssignMode() {
		return this.userAssignMode;
	}

	public void setUserAssignMode(String userAssignMode) {
		this.userAssignMode = userAssignMode;
		if(userAssignMode != null){
			putQueryParameter("UserAssignMode", userAssignMode);
		}
	}

	public String getHostname() {
		return this.hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
		if(hostname != null){
			putQueryParameter("Hostname", hostname);
		}
	}

	public List<DesktopTimers> getDesktopTimerss() {
		return this.desktopTimerss;
	}

	public void setDesktopTimerss(List<DesktopTimers> desktopTimerss) {
		this.desktopTimerss = desktopTimerss;	
		if (desktopTimerss != null) {
			for (int depth1 = 0; depth1 < desktopTimerss.size(); depth1++) {
				putQueryParameter("DesktopTimers." + (depth1 + 1) + ".CronExpression" , desktopTimerss.get(depth1).getCronExpression());
				putQueryParameter("DesktopTimers." + (depth1 + 1) + ".TimerType" , desktopTimerss.get(depth1).getTimerType());
				putQueryParameter("DesktopTimers." + (depth1 + 1) + ".AllowClientSetting" , desktopTimerss.get(depth1).getAllowClientSetting());
				putQueryParameter("DesktopTimers." + (depth1 + 1) + ".ResetType" , desktopTimerss.get(depth1).getResetType());
				putQueryParameter("DesktopTimers." + (depth1 + 1) + ".Enforce" , desktopTimerss.get(depth1).getEnforce());
				putQueryParameter("DesktopTimers." + (depth1 + 1) + ".Interval" , desktopTimerss.get(depth1).getInterval());
				putQueryParameter("DesktopTimers." + (depth1 + 1) + ".OperationType" , desktopTimerss.get(depth1).getOperationType());
			}
		}	
	}

	public Boolean getDesktopNameSuffix() {
		return this.desktopNameSuffix;
	}

	public void setDesktopNameSuffix(Boolean desktopNameSuffix) {
		this.desktopNameSuffix = desktopNameSuffix;
		if(desktopNameSuffix != null){
			putQueryParameter("DesktopNameSuffix", desktopNameSuffix.toString());
		}
	}

	public String getDirectoryId() {
		return this.directoryId;
	}

	public void setDirectoryId(String directoryId) {
		this.directoryId = directoryId;
		if(directoryId != null){
			putQueryParameter("DirectoryId", directoryId);
		}
	}

	public List<String> getEndUserIds() {
		return this.endUserIds;
	}

	public void setEndUserIds(List<String> endUserIds) {
		this.endUserIds = endUserIds;	
		if (endUserIds != null) {
			for (int i = 0; i < endUserIds.size(); i++) {
				putQueryParameter("EndUserId." + (i + 1) , endUserIds.get(i));
			}
		}	
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
		}	
	}

	public List<BundleModels> getBundleModelss() {
		return this.bundleModelss;
	}

	public void setBundleModelss(List<BundleModels> bundleModelss) {
		this.bundleModelss = bundleModelss;	
		if (bundleModelss != null) {
			for (int depth1 = 0; depth1 < bundleModelss.size(); depth1++) {
				putQueryParameter("BundleModels." + (depth1 + 1) + ".VolumeEncryptionEnabled" , bundleModelss.get(depth1).getVolumeEncryptionEnabled());
				putQueryParameter("BundleModels." + (depth1 + 1) + ".VolumeEncryptionKey" , bundleModelss.get(depth1).getVolumeEncryptionKey());
				putQueryParameter("BundleModels." + (depth1 + 1) + ".Amount" , bundleModelss.get(depth1).getAmount());
				putQueryParameter("BundleModels." + (depth1 + 1) + ".DesktopName" , bundleModelss.get(depth1).getDesktopName());
				putQueryParameter("BundleModels." + (depth1 + 1) + ".Hostname" , bundleModelss.get(depth1).getHostname());
				if (bundleModelss.get(depth1).getEndUserIdss() != null) {
					for (int i = 0; i < bundleModelss.get(depth1).getEndUserIdss().size(); i++) {
						putQueryParameter("BundleModels." + (depth1 + 1) + ".EndUserIds." + (i + 1) , bundleModelss.get(depth1).getEndUserIdss().get(i));
					}
				}
				putQueryParameter("BundleModels." + (depth1 + 1) + ".BundleId" , bundleModelss.get(depth1).getBundleId());
			}
		}	
	}

	public Boolean getVolumeEncryptionEnabled() {
		return this.volumeEncryptionEnabled;
	}

	public void setVolumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
		this.volumeEncryptionEnabled = volumeEncryptionEnabled;
		if(volumeEncryptionEnabled != null){
			putQueryParameter("VolumeEncryptionEnabled", volumeEncryptionEnabled.toString());
		}
	}

	public String getDesktopName() {
		return this.desktopName;
	}

	public void setDesktopName(String desktopName) {
		this.desktopName = desktopName;
		if(desktopName != null){
			putQueryParameter("DesktopName", desktopName);
		}
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
		if(amount != null){
			putQueryParameter("Amount", amount.toString());
		}
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period.toString());
		}
	}

	public Boolean getAutoPay() {
		return this.autoPay;
	}

	public void setAutoPay(Boolean autoPay) {
		this.autoPay = autoPay;
		if(autoPay != null){
			putQueryParameter("AutoPay", autoPay.toString());
		}
	}

	public List<UserCommands> getUserCommandss() {
		return this.userCommandss;
	}

	public void setUserCommandss(List<UserCommands> userCommandss) {
		this.userCommandss = userCommandss;	
		if (userCommandss != null) {
			for (int depth1 = 0; depth1 < userCommandss.size(); depth1++) {
				putQueryParameter("UserCommands." + (depth1 + 1) + ".ContentEncoding" , userCommandss.get(depth1).getContentEncoding());
				putQueryParameter("UserCommands." + (depth1 + 1) + ".Content" , userCommandss.get(depth1).getContent());
				putQueryParameter("UserCommands." + (depth1 + 1) + ".ContentType" , userCommandss.get(depth1).getContentType());
			}
		}	
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public String getPromotionId() {
		return this.promotionId;
	}

	public void setPromotionId(String promotionId) {
		this.promotionId = promotionId;
		if(promotionId != null){
			putQueryParameter("PromotionId", promotionId);
		}
	}

	public String getPeriodUnit() {
		return this.periodUnit;
	}

	public void setPeriodUnit(String periodUnit) {
		this.periodUnit = periodUnit;
		if(periodUnit != null){
			putQueryParameter("PeriodUnit", periodUnit);
		}
	}

	public Boolean getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(Boolean autoRenew) {
		this.autoRenew = autoRenew;
		if(autoRenew != null){
			putQueryParameter("AutoRenew", autoRenew.toString());
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	public String getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
		if(chargeType != null){
			putQueryParameter("ChargeType", chargeType);
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

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putQueryParameter("UserName", userName);
		}
	}

	public static class DesktopTimers {

		private String cronExpression;

		private String timerType;

		private Boolean allowClientSetting;

		private String resetType;

		private Boolean enforce;

		private Integer interval;

		private String operationType;

		public String getCronExpression() {
			return this.cronExpression;
		}

		public void setCronExpression(String cronExpression) {
			this.cronExpression = cronExpression;
		}

		public String getTimerType() {
			return this.timerType;
		}

		public void setTimerType(String timerType) {
			this.timerType = timerType;
		}

		public Boolean getAllowClientSetting() {
			return this.allowClientSetting;
		}

		public void setAllowClientSetting(Boolean allowClientSetting) {
			this.allowClientSetting = allowClientSetting;
		}

		public String getResetType() {
			return this.resetType;
		}

		public void setResetType(String resetType) {
			this.resetType = resetType;
		}

		public Boolean getEnforce() {
			return this.enforce;
		}

		public void setEnforce(Boolean enforce) {
			this.enforce = enforce;
		}

		public Integer getInterval() {
			return this.interval;
		}

		public void setInterval(Integer interval) {
			this.interval = interval;
		}

		public String getOperationType() {
			return this.operationType;
		}

		public void setOperationType(String operationType) {
			this.operationType = operationType;
		}
	}

	public static class Tag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	public static class BundleModels {

		private Boolean volumeEncryptionEnabled;

		private String volumeEncryptionKey;

		private Integer amount;

		private String desktopName;

		private String hostname;

		private List<String> endUserIdss;

		private String bundleId;

		public Boolean getVolumeEncryptionEnabled() {
			return this.volumeEncryptionEnabled;
		}

		public void setVolumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
			this.volumeEncryptionEnabled = volumeEncryptionEnabled;
		}

		public String getVolumeEncryptionKey() {
			return this.volumeEncryptionKey;
		}

		public void setVolumeEncryptionKey(String volumeEncryptionKey) {
			this.volumeEncryptionKey = volumeEncryptionKey;
		}

		public Integer getAmount() {
			return this.amount;
		}

		public void setAmount(Integer amount) {
			this.amount = amount;
		}

		public String getDesktopName() {
			return this.desktopName;
		}

		public void setDesktopName(String desktopName) {
			this.desktopName = desktopName;
		}

		public String getHostname() {
			return this.hostname;
		}

		public void setHostname(String hostname) {
			this.hostname = hostname;
		}

		public List<String> getEndUserIdss() {
			return this.endUserIdss;
		}

		public void setEndUserIdss(List<String> endUserIdss) {
			this.endUserIdss = endUserIdss;
		}

		public String getBundleId() {
			return this.bundleId;
		}

		public void setBundleId(String bundleId) {
			this.bundleId = bundleId;
		}
	}

	public static class UserCommands {

		private String contentEncoding;

		private String content;

		private String contentType;

		public String getContentEncoding() {
			return this.contentEncoding;
		}

		public void setContentEncoding(String contentEncoding) {
			this.contentEncoding = contentEncoding;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getContentType() {
			return this.contentType;
		}

		public void setContentType(String contentType) {
			this.contentType = contentType;
		}
	}

	@Override
	public Class<CreateDesktopsResponse> getResponseClass() {
		return CreateDesktopsResponse.class;
	}

}
