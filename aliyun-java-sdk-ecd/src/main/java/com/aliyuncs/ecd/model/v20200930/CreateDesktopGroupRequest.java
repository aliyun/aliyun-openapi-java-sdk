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
public class CreateDesktopGroupRequest extends RpcAcsRequest<CreateDesktopGroupResponse> {
	   

	private String desktopGroupName;

	private Integer allowBufferCount;

	private Integer groupVersion;

	private List<Tag> tags;

	private Boolean allClassifyUsers;

	private Integer maxDesktopsCount;

	private Boolean volumeEncryptionEnabled;

	private Integer period;

	private Integer allowAutoSetup;

	private Long resetType;

	private Float ratioThreshold;

	private Long keepDuration;

	private String periodUnit;

	private Boolean autoRenew;

	private Boolean profileFollowSwitch;

	private Integer buyDesktopsCount;

	private String policyGroupId;

	private String volumeEncryptionKey;

	private String officeSiteId;

	private String classify;

	private List<String> endUserIdss;

	private String scaleStrategyId;

	private String clientToken;

	private String bundleId;

	private Long bindAmount;

	private Long loadPolicy;

	private Integer defaultInitDesktopCount;

	private Long idleDisconnectDuration;

	private String directoryId;

	private Integer minDesktopsCount;

	private String fileSystemId;

	private Boolean autoPay;

	private String comments;

	private Integer ownType;

	private Long stopDuration;

	private String promotionId;

	private Long connectDuration;

	private String vpcId;

	private String chargeType;
	public CreateDesktopGroupRequest() {
		super("ecd", "2020-09-30", "CreateDesktopGroup", "gwsecd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDesktopGroupName() {
		return this.desktopGroupName;
	}

	public void setDesktopGroupName(String desktopGroupName) {
		this.desktopGroupName = desktopGroupName;
		if(desktopGroupName != null){
			putQueryParameter("DesktopGroupName", desktopGroupName);
		}
	}

	public Integer getAllowBufferCount() {
		return this.allowBufferCount;
	}

	public void setAllowBufferCount(Integer allowBufferCount) {
		this.allowBufferCount = allowBufferCount;
		if(allowBufferCount != null){
			putQueryParameter("AllowBufferCount", allowBufferCount.toString());
		}
	}

	public Integer getGroupVersion() {
		return this.groupVersion;
	}

	public void setGroupVersion(Integer groupVersion) {
		this.groupVersion = groupVersion;
		if(groupVersion != null){
			putQueryParameter("GroupVersion", groupVersion.toString());
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

	public Boolean getAllClassifyUsers() {
		return this.allClassifyUsers;
	}

	public void setAllClassifyUsers(Boolean allClassifyUsers) {
		this.allClassifyUsers = allClassifyUsers;
		if(allClassifyUsers != null){
			putQueryParameter("AllClassifyUsers", allClassifyUsers.toString());
		}
	}

	public Integer getMaxDesktopsCount() {
		return this.maxDesktopsCount;
	}

	public void setMaxDesktopsCount(Integer maxDesktopsCount) {
		this.maxDesktopsCount = maxDesktopsCount;
		if(maxDesktopsCount != null){
			putQueryParameter("MaxDesktopsCount", maxDesktopsCount.toString());
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

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period.toString());
		}
	}

	public Integer getAllowAutoSetup() {
		return this.allowAutoSetup;
	}

	public void setAllowAutoSetup(Integer allowAutoSetup) {
		this.allowAutoSetup = allowAutoSetup;
		if(allowAutoSetup != null){
			putQueryParameter("AllowAutoSetup", allowAutoSetup.toString());
		}
	}

	public Long getResetType() {
		return this.resetType;
	}

	public void setResetType(Long resetType) {
		this.resetType = resetType;
		if(resetType != null){
			putQueryParameter("ResetType", resetType.toString());
		}
	}

	public Float getRatioThreshold() {
		return this.ratioThreshold;
	}

	public void setRatioThreshold(Float ratioThreshold) {
		this.ratioThreshold = ratioThreshold;
		if(ratioThreshold != null){
			putQueryParameter("RatioThreshold", ratioThreshold.toString());
		}
	}

	public Long getKeepDuration() {
		return this.keepDuration;
	}

	public void setKeepDuration(Long keepDuration) {
		this.keepDuration = keepDuration;
		if(keepDuration != null){
			putQueryParameter("KeepDuration", keepDuration.toString());
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

	public Boolean getProfileFollowSwitch() {
		return this.profileFollowSwitch;
	}

	public void setProfileFollowSwitch(Boolean profileFollowSwitch) {
		this.profileFollowSwitch = profileFollowSwitch;
		if(profileFollowSwitch != null){
			putQueryParameter("ProfileFollowSwitch", profileFollowSwitch.toString());
		}
	}

	public Integer getBuyDesktopsCount() {
		return this.buyDesktopsCount;
	}

	public void setBuyDesktopsCount(Integer buyDesktopsCount) {
		this.buyDesktopsCount = buyDesktopsCount;
		if(buyDesktopsCount != null){
			putQueryParameter("BuyDesktopsCount", buyDesktopsCount.toString());
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

	public String getClassify() {
		return this.classify;
	}

	public void setClassify(String classify) {
		this.classify = classify;
		if(classify != null){
			putQueryParameter("Classify", classify);
		}
	}

	public List<String> getEndUserIdss() {
		return this.endUserIdss;
	}

	public void setEndUserIdss(List<String> endUserIdss) {
		this.endUserIdss = endUserIdss;	
		if (endUserIdss != null) {
			for (int i = 0; i < endUserIdss.size(); i++) {
				putQueryParameter("EndUserIds." + (i + 1) , endUserIdss.get(i));
			}
		}	
	}

	public String getScaleStrategyId() {
		return this.scaleStrategyId;
	}

	public void setScaleStrategyId(String scaleStrategyId) {
		this.scaleStrategyId = scaleStrategyId;
		if(scaleStrategyId != null){
			putQueryParameter("ScaleStrategyId", scaleStrategyId);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
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

	public Long getBindAmount() {
		return this.bindAmount;
	}

	public void setBindAmount(Long bindAmount) {
		this.bindAmount = bindAmount;
		if(bindAmount != null){
			putQueryParameter("BindAmount", bindAmount.toString());
		}
	}

	public Long getLoadPolicy() {
		return this.loadPolicy;
	}

	public void setLoadPolicy(Long loadPolicy) {
		this.loadPolicy = loadPolicy;
		if(loadPolicy != null){
			putQueryParameter("LoadPolicy", loadPolicy.toString());
		}
	}

	public Integer getDefaultInitDesktopCount() {
		return this.defaultInitDesktopCount;
	}

	public void setDefaultInitDesktopCount(Integer defaultInitDesktopCount) {
		this.defaultInitDesktopCount = defaultInitDesktopCount;
		if(defaultInitDesktopCount != null){
			putQueryParameter("DefaultInitDesktopCount", defaultInitDesktopCount.toString());
		}
	}

	public Long getIdleDisconnectDuration() {
		return this.idleDisconnectDuration;
	}

	public void setIdleDisconnectDuration(Long idleDisconnectDuration) {
		this.idleDisconnectDuration = idleDisconnectDuration;
		if(idleDisconnectDuration != null){
			putQueryParameter("IdleDisconnectDuration", idleDisconnectDuration.toString());
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

	public Integer getMinDesktopsCount() {
		return this.minDesktopsCount;
	}

	public void setMinDesktopsCount(Integer minDesktopsCount) {
		this.minDesktopsCount = minDesktopsCount;
		if(minDesktopsCount != null){
			putQueryParameter("MinDesktopsCount", minDesktopsCount.toString());
		}
	}

	public String getFileSystemId() {
		return this.fileSystemId;
	}

	public void setFileSystemId(String fileSystemId) {
		this.fileSystemId = fileSystemId;
		if(fileSystemId != null){
			putQueryParameter("FileSystemId", fileSystemId);
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

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
		if(comments != null){
			putQueryParameter("Comments", comments);
		}
	}

	public Integer getOwnType() {
		return this.ownType;
	}

	public void setOwnType(Integer ownType) {
		this.ownType = ownType;
		if(ownType != null){
			putQueryParameter("OwnType", ownType.toString());
		}
	}

	public Long getStopDuration() {
		return this.stopDuration;
	}

	public void setStopDuration(Long stopDuration) {
		this.stopDuration = stopDuration;
		if(stopDuration != null){
			putQueryParameter("StopDuration", stopDuration.toString());
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

	public Long getConnectDuration() {
		return this.connectDuration;
	}

	public void setConnectDuration(Long connectDuration) {
		this.connectDuration = connectDuration;
		if(connectDuration != null){
			putQueryParameter("ConnectDuration", connectDuration.toString());
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

	@Override
	public Class<CreateDesktopGroupResponse> getResponseClass() {
		return CreateDesktopGroupResponse.class;
	}

}
