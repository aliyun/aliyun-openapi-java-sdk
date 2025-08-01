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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateCloudPhoneNodeRequest extends RpcAcsRequest<CreateCloudPhoneNodeResponse> {
	   

	private String bizRegionId;

	@SerializedName("networkInfo")
	private NetworkInfo networkInfo;

	private String imageId;

	private String serverType;

	private Integer downBandwidthLimit;

	private String networkType;

	private Integer resolutionWidth;

	private String instanceType;

	private Integer serverShareDataVolume;

	private List<Tag> tags;

	private Integer resolutionHeight;

	private Integer phoneCount;

	private Integer period;

	private Boolean autoPay;

	private String bandwidthPackageId;

	private String count;

	private String bandwidthPackageType;

	@SerializedName("displayConfig")
	private DisplayConfig displayConfig;

	private String vSwitchId;

	private String nodeName;

	private String periodUnit;

	private Boolean autoRenew;

	private Integer phoneDataVolume;

	private Integer streamMode;

	private String networkId;

	private String chargeType;

	private Integer upBandwidthLimit;

	private String useTemplate;
	public CreateCloudPhoneNodeRequest() {
		super("eds-aic", "2023-09-30", "CreateCloudPhoneNode");
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

	public NetworkInfo getNetworkInfo() {
		return this.networkInfo;
	}

	public void setNetworkInfo(NetworkInfo networkInfo) {
		this.networkInfo = networkInfo;	
		if (networkInfo != null) {
			putQueryParameter("NetworkInfo" , new Gson().toJson(networkInfo));
		}	
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("ImageId", imageId);
		}
	}

	public String getServerType() {
		return this.serverType;
	}

	public void setServerType(String serverType) {
		this.serverType = serverType;
		if(serverType != null){
			putQueryParameter("ServerType", serverType);
		}
	}

	public Integer getDownBandwidthLimit() {
		return this.downBandwidthLimit;
	}

	public void setDownBandwidthLimit(Integer downBandwidthLimit) {
		this.downBandwidthLimit = downBandwidthLimit;
		if(downBandwidthLimit != null){
			putQueryParameter("DownBandwidthLimit", downBandwidthLimit.toString());
		}
	}

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
		if(networkType != null){
			putQueryParameter("NetworkType", networkType);
		}
	}

	public Integer getResolutionWidth() {
		return this.resolutionWidth;
	}

	public void setResolutionWidth(Integer resolutionWidth) {
		this.resolutionWidth = resolutionWidth;
		if(resolutionWidth != null){
			putQueryParameter("ResolutionWidth", resolutionWidth.toString());
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public Integer getServerShareDataVolume() {
		return this.serverShareDataVolume;
	}

	public void setServerShareDataVolume(Integer serverShareDataVolume) {
		this.serverShareDataVolume = serverShareDataVolume;
		if(serverShareDataVolume != null){
			putQueryParameter("ServerShareDataVolume", serverShareDataVolume.toString());
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

	public Integer getResolutionHeight() {
		return this.resolutionHeight;
	}

	public void setResolutionHeight(Integer resolutionHeight) {
		this.resolutionHeight = resolutionHeight;
		if(resolutionHeight != null){
			putQueryParameter("ResolutionHeight", resolutionHeight.toString());
		}
	}

	public Integer getPhoneCount() {
		return this.phoneCount;
	}

	public void setPhoneCount(Integer phoneCount) {
		this.phoneCount = phoneCount;
		if(phoneCount != null){
			putQueryParameter("PhoneCount", phoneCount.toString());
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

	public String getBandwidthPackageId() {
		return this.bandwidthPackageId;
	}

	public void setBandwidthPackageId(String bandwidthPackageId) {
		this.bandwidthPackageId = bandwidthPackageId;
		if(bandwidthPackageId != null){
			putQueryParameter("BandwidthPackageId", bandwidthPackageId);
		}
	}

	public String getCount() {
		return this.count;
	}

	public void setCount(String count) {
		this.count = count;
		if(count != null){
			putQueryParameter("Count", count);
		}
	}

	public String getBandwidthPackageType() {
		return this.bandwidthPackageType;
	}

	public void setBandwidthPackageType(String bandwidthPackageType) {
		this.bandwidthPackageType = bandwidthPackageType;
		if(bandwidthPackageType != null){
			putQueryParameter("BandwidthPackageType", bandwidthPackageType);
		}
	}

	public DisplayConfig getDisplayConfig() {
		return this.displayConfig;
	}

	public void setDisplayConfig(DisplayConfig displayConfig) {
		this.displayConfig = displayConfig;	
		if (displayConfig != null) {
			putBodyParameter("DisplayConfig" , new Gson().toJson(displayConfig));
		}	
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
		}
	}

	public String getNodeName() {
		return this.nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
		if(nodeName != null){
			putQueryParameter("NodeName", nodeName);
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

	public Integer getPhoneDataVolume() {
		return this.phoneDataVolume;
	}

	public void setPhoneDataVolume(Integer phoneDataVolume) {
		this.phoneDataVolume = phoneDataVolume;
		if(phoneDataVolume != null){
			putQueryParameter("PhoneDataVolume", phoneDataVolume.toString());
		}
	}

	public Integer getStreamMode() {
		return this.streamMode;
	}

	public void setStreamMode(Integer streamMode) {
		this.streamMode = streamMode;
		if(streamMode != null){
			putQueryParameter("StreamMode", streamMode.toString());
		}
	}

	public String getNetworkId() {
		return this.networkId;
	}

	public void setNetworkId(String networkId) {
		this.networkId = networkId;
		if(networkId != null){
			putQueryParameter("NetworkId", networkId);
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

	public Integer getUpBandwidthLimit() {
		return this.upBandwidthLimit;
	}

	public void setUpBandwidthLimit(Integer upBandwidthLimit) {
		this.upBandwidthLimit = upBandwidthLimit;
		if(upBandwidthLimit != null){
			putQueryParameter("UpBandwidthLimit", upBandwidthLimit.toString());
		}
	}

	public String getUseTemplate() {
		return this.useTemplate;
	}

	public void setUseTemplate(String useTemplate) {
		this.useTemplate = useTemplate;
		if(useTemplate != null){
			putQueryParameter("UseTemplate", useTemplate);
		}
	}

	public static class NetworkInfo {

		@SerializedName("LimitedBandwidth")
		private Integer limitedBandwidth;

		@SerializedName("IpRatio")
		private Integer ipRatio;

		@SerializedName("InternetChargeType")
		private String internetChargeType;

		@SerializedName("Isp")
		private String isp;

		@SerializedName("CidrBlock")
		private String cidrBlock;

		@SerializedName("BandwidthPackageName")
		private String bandwidthPackageName;

		public Integer getLimitedBandwidth() {
			return this.limitedBandwidth;
		}

		public void setLimitedBandwidth(Integer limitedBandwidth) {
			this.limitedBandwidth = limitedBandwidth;
		}

		public Integer getIpRatio() {
			return this.ipRatio;
		}

		public void setIpRatio(Integer ipRatio) {
			this.ipRatio = ipRatio;
		}

		public String getInternetChargeType() {
			return this.internetChargeType;
		}

		public void setInternetChargeType(String internetChargeType) {
			this.internetChargeType = internetChargeType;
		}

		public String getIsp() {
			return this.isp;
		}

		public void setIsp(String isp) {
			this.isp = isp;
		}

		public String getCidrBlock() {
			return this.cidrBlock;
		}

		public void setCidrBlock(String cidrBlock) {
			this.cidrBlock = cidrBlock;
		}

		public String getBandwidthPackageName() {
			return this.bandwidthPackageName;
		}

		public void setBandwidthPackageName(String bandwidthPackageName) {
			this.bandwidthPackageName = bandwidthPackageName;
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

	public static class DisplayConfig {

		@SerializedName("Fps")
		private Integer fps;

		@SerializedName("LockResolution")
		private String lockResolution;

		@SerializedName("Dpi")
		private Integer dpi;

		public Integer getFps() {
			return this.fps;
		}

		public void setFps(Integer fps) {
			this.fps = fps;
		}

		public String getLockResolution() {
			return this.lockResolution;
		}

		public void setLockResolution(String lockResolution) {
			this.lockResolution = lockResolution;
		}

		public Integer getDpi() {
			return this.dpi;
		}

		public void setDpi(Integer dpi) {
			this.dpi = dpi;
		}
	}

	@Override
	public Class<CreateCloudPhoneNodeResponse> getResponseClass() {
		return CreateCloudPhoneNodeResponse.class;
	}

}
